package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.*;

public class Aluno extends AbstractAssociado{
	
	public Aluno(int idAssociado, String nome, String endereco,
			ArrayList<Emprestimo> emprestimos) {
		super(idAssociado, nome, endereco, emprestimos);
	}

	public boolean equals(Aluno a){
		if(a.getIdAssociado() == this.getIdAssociado())
			if(a.getNome() == this.getNome())
				if(a.getEndereco() == this.getEndereco())
					return true;
		return false;
	}
}
