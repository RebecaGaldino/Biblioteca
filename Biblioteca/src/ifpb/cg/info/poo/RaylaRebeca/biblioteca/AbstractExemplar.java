package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.*;

public abstract class AbstractExemplar {
	protected String titulo;
	protected String editora;
	protected String localDeEdicao;
	ArrayList<String> keywords = new ArrayList<String>();
	protected int quantidade;
	protected int edicao;


	public AbstractExemplar(String titulo, String editora, String localDeEdicao, ArrayList<String> keywords , int quantidade, int edicao) {
		this.titulo = titulo;
		this.editora = editora;
		this.localDeEdicao = localDeEdicao;
		this.keywords = keywords;
		this.quantidade = quantidade;
		this.edicao = edicao;
		setKeywords(keywords);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getLocalDeEdicao() {
		return localDeEdicao;
	}

	public void setLocalDeEdicao(String localDeEdicao) {
		this.localDeEdicao = localDeEdicao;
	}

	public ArrayList<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(ArrayList<String> keywords) {
			this.keywords = keywords;
		}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	


	
	

	
}
