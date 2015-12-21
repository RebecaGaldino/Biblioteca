package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 *
 * Classe de professor do projeto biblioteca. Extende a classe abstrata do associado e acrescenta o método equals, individual.
 */
import java.util.ArrayList;

public class Professor extends AbstractAssociado {

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
	 * @param emprestimos
	 */
	public Professor(int idAssociado, String nome, String endereco) {
		super(idAssociado, nome, endereco);
	}

	public boolean equals(Professor p) {
		if (p.getIdAssociado() == this.getIdAssociado())
			if (p.getNome() == this.getNome())
				if (p.getEndereco() == this.getEndereco())
					return true;
		return false;
	}
	
	
}
