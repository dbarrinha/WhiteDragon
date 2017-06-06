package br.com.timemanager.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.primefaces.event.DragDropEvent;

import br.com.timemanager.model.Tarefa;

@SessionScoped
@Named
@ManagedBean
public class TimeController implements Serializable{
	
	private static final long serialVersionUID = -8850982832236566931L;
	
	private List<Tarefa> tarefas = new ArrayList<>();
	private List<Tarefa> tarefasDropadas = new ArrayList<>();
	private Tarefa tarefa = new Tarefa("","");
	private String teste = "bláu";
	
	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	public TimeController() {
    	tarefas.add(new Tarefa("Teste1","4622364"));
    	tarefas.add(new Tarefa("Teste2","4622364"));
    	tarefas.add(new Tarefa("Teste3","4622364"));
    	tarefas.add(new Tarefa("Teste4","4622364"));
	}
	
	public List<Tarefa> getTarefasDropadas() {
		return tarefasDropadas;
	}

	public void setTarefasDropadas(List<Tarefa> tarefasDropadas) {
		this.tarefasDropadas = tarefasDropadas;
	}

	/*public void addTarefa(){
		
		tarefas.add(tarefa);
		System.out.println(tarefas.size());
	}*/

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public void onDrop(DragDropEvent ddEvent) {
		System.out.println("Entrou on drop");
		Tarefa tarefa = ((Tarefa) ddEvent.getData());
		tarefasDropadas.add(tarefa);
		tarefas.remove(tarefa);
	}
	
	
}






