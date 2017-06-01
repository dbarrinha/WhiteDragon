package br.com.timemanager.controller;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.primefaces.event.DragDropEvent;

import br.com.timemanager.model.Tarefa;


@Named
@ManagedBean
public class TimeController implements Serializable{
	
	private static final long serialVersionUID = -8850982832236566931L;
	
	private List<Tarefa> tarefas = new ArrayList<>();
	private List<String> tarefasDropadas = new ArrayList<>();
	private Tarefa tarefa = new Tarefa("","");
	
	
	
	
	public List<String> getTarefasDropadas() {
		return tarefasDropadas;
	}

	public void setTarefasDropadas(List<String> tarefasDropadas) {
		this.tarefasDropadas = tarefasDropadas;
	}

	

	@PostConstruct
    public void init() {
		tarefasDropadas.add("teste");
		tarefasDropadas.add("teste2");
		
    }
	
	public void addTarefa(){
		
		tarefas.add(tarefa);
		System.out.println(tarefas.size());
	}

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

	public void onTarefaDrop(DragDropEvent ddEvent) {
	        Tarefa car = ((Tarefa) ddEvent.getData());
	        System.out.println("ok");
	        //Tarefa aux = new Tarefa(car.getDescricao(),car.getDuracao());
	        System.out.println("ok");
	        tarefasDropadas.add(car.getDescricao());
	        System.out.println(tarefasDropadas.size());
	    }
	
}
