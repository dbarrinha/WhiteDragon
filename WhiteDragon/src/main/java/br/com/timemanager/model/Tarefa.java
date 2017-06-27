package br.com.timemanager.model;

import java.util.Calendar;

public class Tarefa {
	
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	
	private String descricao;
	private String duracao;
	private Calendar data;
	
	
	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Tarefa(int id,String descricao,String duracao) {
		this.descricao = descricao;
		this.duracao = duracao;
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
}
