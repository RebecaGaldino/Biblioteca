package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.ArrayList;

public class Professor extends AbstractAssociado{
	
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
