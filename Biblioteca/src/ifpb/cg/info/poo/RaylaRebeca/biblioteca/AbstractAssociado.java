package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.*;

public abstract class AbstractAssociado {
	protected int idAssociado;
	protected String nome;
	protected String endereco;
	ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

	public AbstractAssociado(int idAssociado, String nome, String endereco,
			ArrayList<Emprestimo> emprestimos) {
		this.idAssociado = idAssociado;
		this.nome = nome;
		this.endereco = endereco;
		this.emprestimos = emprestimos;
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

	public ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

}
