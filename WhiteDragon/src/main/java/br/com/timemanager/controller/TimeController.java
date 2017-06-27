package br.com.timemanager.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.primefaces.event.DragDropEvent;

import br.com.timemanager.model.Card;
import br.com.timemanager.model.Tarefa;

@SessionScoped
@Named
@ManagedBean
public class TimeController implements Serializable{
	
	private static final long serialVersionUID = -8850982832236566931L;
	
	private List<Tarefa> tarefas = new ArrayList<>();
	private List<Card> box = new ArrayList<>();
	private List<Tarefa> tarefas2 = new ArrayList<>();
	private Tarefa tarefa = new Tarefa(0,"","");
	String [] semana = {"Segunda","Terça","Quarta","Quinta","Sexta","Sábado","Domingo"};
	
	public TimeController() {
    	tarefas.add(new Tarefa(1,"Teste1","12"));
    	tarefas.add(new Tarefa(2,"Teste2","43"));
    	tarefas2.add(new Tarefa(3,"Teste3","4"));
    	tarefas2.add(new Tarefa(4,"Teste4","1"));
    	
    	box.add(new Card("box1",tarefas));
    	box.add(new Card("box2",tarefas2));
	}
	
	public List<Card> getBox() {
		return box;
	}

	public void setBox(List<Card> box) {
		this.box = box;
	}

	public List<Tarefa> getTarefas2() {
		return tarefas2;
	}

	public void setTarefas2(List<Tarefa> tarefas2) {
		this.tarefas2 = tarefas2;
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

	/*public void onDrop(DragDropEvent ddEvent) {
		System.out.println("Entrou on drop");
		Tarefa tarefa = ((Tarefa) ddEvent.getData());
		tarefasDropadas.add(tarefa);
		tarefas.remove(tarefa);
		System.out.println("Tam 1: "+tarefas.size() + "Tam 2: "+ tarefasDropadas.size());
	}*/
	
	public String dataAtual(int index){
		Date aux = new Date(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		cal.setTime(aux);
		cal.add(Calendar.DATE, index-1);
		aux = cal.getTime();
		
		return (aux.getDate()+1)+"/"+(aux.getMonth()+1);
	}
	
	public String diaSemana(int index){
		Date aux = new Date(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		cal.setTime(aux);
		cal.add(Calendar.DATE, index-1);
		aux = cal.getTime();
		
		return semana[aux.getDay()] + "";
	}
	
	
	
	
	
}






