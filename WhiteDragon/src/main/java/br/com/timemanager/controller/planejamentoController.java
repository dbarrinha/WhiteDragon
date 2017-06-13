package br.com.timemanager.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;

import br.com.timemanager.model.Tarefa;

@ManagedBean
@ViewScoped
public class planejamentoController implements Serializable{

	private static final long serialVersionUID = -13697391047336495L;
  
	private List<Tarefa> tarefas;
	 
	
}
