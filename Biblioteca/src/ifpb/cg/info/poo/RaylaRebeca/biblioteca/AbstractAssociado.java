package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * Classe abstrata do projeto de biblioteca. Contém os métodos relacionados aos associados, que são os alunos e professores.
 */

import java.util.*;

public abstract class AbstractAssociado {
	protected int idAssociado;
	protected String nome;
	protected String endereco;

	/**
	 * Construtor da classe abstrata
	 * @param idAssociado
	 * @param nome
	 * @param endereco
	 * @param emprestimos, um arrayList de objetos do tipo emprestimo(que podem ser tanto de livros quanto de revistas) 
	 */
	public AbstractAssociado(int idAssociado, String nome, String endereco) {
		this.idAssociado = idAssociado;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getIdAssociado() {
		return idAssociado;
	}

	public void setIdAssociado(int idAssociado) {
		this.idAssociado = idAssociado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
