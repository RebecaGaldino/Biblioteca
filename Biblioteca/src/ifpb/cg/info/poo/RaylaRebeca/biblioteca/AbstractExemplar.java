package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * Classe abstrata do projeto de biblioteca. Contém os métodos relacionados aos exemplares, que são os livros e as revistas.
 */

import java.util.*;

public abstract class AbstractExemplar {
	protected String titulo;
	protected String editora;
	protected String localDeEdicao;	
	protected int quantidade;
	protected int edicao;


	/**
	 * Construtor da classe abstrata
	 * @param titulo
	 * @param editora
	 * @param localDeEdicao
	 * @param keywords, arraylist de palavras a serem inseridas pelo usuário no momento de cadastro
	 * @param quantidade
	 * @param edicao
	 */
	public AbstractExemplar(String titulo, String editora, String localDeEdicao, int quantidade, int edicao) {
		this.titulo = titulo;
		this.editora = editora;
		this.localDeEdicao = localDeEdicao;
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
