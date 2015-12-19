package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

//import java.util.*;

public abstract class AbstractExemplar {
	protected String titulo;
	protected String editora;
	protected String localDeEdicao;
	protected String keywords;
	protected int quantidade;
	protected int edicao;


	public AbstractExemplar(String titulo, String editora, String localDeEdicao, String keywords, int quantidade, int edicao) {
		this.titulo = titulo;
		this.editora = editora;
		this.localDeEdicao = localDeEdicao;
		this.keywords = keywords;
		this.quantidade = quantidade;
		this.edicao = edicao;
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

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
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
