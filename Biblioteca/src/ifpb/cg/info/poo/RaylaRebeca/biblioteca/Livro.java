package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

public class Livro extends AbstractExemplar {
	private String autor;
	private String ISBN;

	public Livro(String titulo, String editora, String localDeEdicao,
			String keywords, int quantidade, int edicao, String autor, String ISBN) {
		super(titulo, editora, localDeEdicao, keywords, quantidade, edicao);
		setAutor(autor);
		setISBN(ISBN);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public boolean equals(Livro l){
		if(l.getClass() == this.getClass())
			if(l.getTitulo() == this.getTitulo())
				if(l.getEditora() == this.getEditora())
					if(l.getLocalDeEdicao() == this.getLocalDeEdicao())
						if(l.getKeywords() == this.getKeywords())
							if(l.getQuantidade() == this.getQuantidade())
								if(l.getEdicao() == this.getEdicao())
									if(l.getISBN() == this.getISBN())
										return true;
		return false;
	}
	
}
