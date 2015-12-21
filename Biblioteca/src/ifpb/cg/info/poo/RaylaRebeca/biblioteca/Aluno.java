package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * Classe de aluno do projeto biblioteca. Extende a classe abstrata do associado e acrescenta o método equals, individual.
 */

import java.util.*;

public class Aluno extends AbstractAssociado {
	
	ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

	public ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	/**
	 * Construtor da classe
	 * 
	 * @param idAssociado
	 * @param nome
	 * @param endereco
	 * @param emprestimos, arrayList dos livros e revistas que o aluno terá locado, os
	 * mantendo armazenados no objeto
	 */
	public Aluno(int idAssociado, String nome, String endereco) {
		super(idAssociado, nome, endereco);
	}

	public boolean equals(Aluno a) {
		if (a.getIdAssociado() == this.getIdAssociado())
			if (a.getNome() == this.getNome())
				if (a.getEndereco() == this.getEndereco())
					return true;
		return false;
	}
}
