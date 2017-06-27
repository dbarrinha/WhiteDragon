package br.com.timemanager.model;

import java.util.Calendar;
import java.util.List;

public class Card {
	private String data;
	private List<Tarefa> tarefas;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Card(String data,List<Tarefa> tarefas){
		this.data = data;
		this.tarefas = tarefas;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
}
