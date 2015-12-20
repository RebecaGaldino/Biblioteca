package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * Classe da revista do projeto biblioteca. Extende a classe abstrata do exemplar e acrescenta o metodo equals, individual.
 */

import java.util.*;

public class Revista extends AbstractExemplar{

	/**
	 * Construtor da classe
	 * @param titulo
	 * @param editora
	 * @param localDeEdicao
	 * @param keywords
	 * @param quantidade
	 * @param edicao
	 */
	public Revista(String titulo, String editora, String localDeEdicao, ArrayList<String> keywords, int quantidade, int edicao) {
		super(titulo, editora, localDeEdicao, keywords, quantidade, edicao);
	}
	
	
	public boolean equals(Revista r){
		if(r.getClass() == this.getClass())
			if(r.getTitulo() == this.getTitulo())
				if(r.getEditora() == this.getEditora())
					if(r.getLocalDeEdicao() == this.getLocalDeEdicao())
								if(r.getEdicao() == this.getEdicao())
									return true;
		return false;
	}
}
