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
	
	/*public boolean equals() {
		
	}*/

}
