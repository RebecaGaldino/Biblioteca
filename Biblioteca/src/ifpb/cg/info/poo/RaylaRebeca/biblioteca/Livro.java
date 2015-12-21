package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * lasse do livro do projeto biblioteca. Extende a classe abstrata do exemplar e acrescenta o metodo equals, individual.
 */

public class Livro extends AbstractExemplar {
	private String autor;
	private String ISBN;
	private String keywords;

	/**
	 * Construtor da classe, setando individualmente os atibutos nao gerais de autor e ISBN
	 * @param titulo
	 * @param editora
	 * @param localDeEdicao
	 * @param quantidade
	 * @param edicao
	 * @param autor
	 * @param ISBN
	 */
	
	public Livro(String titulo, String editora, String localDeEdicao, int quantidade, int edicao, String autor, String ISBN, String keywords) {
		super(titulo, editora, localDeEdicao, quantidade, edicao);
		setAutor(autor);
		setISBN(ISBN);
		setKeywords(keywords);
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
								if(l.getEdicao() == this.getEdicao())
									if(l.getISBN() == this.getISBN())
										return true;
		return false;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	
}
