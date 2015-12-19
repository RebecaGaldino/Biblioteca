package ifpb.cg.info.poo.RaylaRebeca.biblioteca;
import java.util.*;

public class Revista extends AbstractExemplar{

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
