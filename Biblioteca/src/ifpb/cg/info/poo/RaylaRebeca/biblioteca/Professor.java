package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * Classe de professor do projeto biblioteca. Extende a classe abstrata do associado e acrescenta o m�todo equals, individual.
 */
import java.util.ArrayList;

public class Professor extends AbstractAssociado{
	/**
	 * Construtor da classe
	 * @param idAssociado
	 * @param nome
	 * @param endereco
	 * @param emprestimos
	 */
	public Professor(int idAssociado, String nome, String endereco,
			ArrayList<Emprestimo> emprestimos) {
		super(idAssociado, nome, endereco, emprestimos);
	}
	
	public boolean equals(Professor p){
		if(p.getIdAssociado() == this.getIdAssociado())
			if(p.getNome() == this.getNome())
				if(p.getEndereco() == this.getEndereco())
					return true;
		return false;
	}
}
