package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * Classe de emprestimo, que pode ser livro ou revista
 */

import java.util.*;

public class Emprestimo {
	private Date dtEmprestimo;
	private GregorianCalendar dtDevolucao;
	private String titulo; //para revistas somente
	private int edicao;
	private String ISBN;
	private int idAssociado;
	private String autor;

	/**
	 * Construtor da classe para livro, com isbn e autor
	 * @param dtEmprestimo
	 * @param dtDevolucao
	 * @param idAssociado
	 * @param iSBN
	 */
	public Emprestimo(Date dtEmprestimo, GregorianCalendar dtDevolucao, int idAssociado, String iSBN, String autor) {
		setDtEmprestimo(dtEmprestimo);
		setDtDevolucao(dtDevolucao);
		setIdAssociado(idAssociado);
		setISBN(iSBN);
		setAutor(autor);
	}
	

	/**
	 * Contrutor da classe para revista, com titulo e dicao somente
	 * @param dtEmprestimo
	 * @param dtDevolucao
	 * @param idAssociado
	 * @param titulo
	 * @param edicao
	 */
	public Emprestimo(Date dtEmprestimo, GregorianCalendar dtDevolucao, int idAssociado, String titulo, int edicao) {
		setDtEmprestimo(dtEmprestimo);
		setDtDevolucao(dtDevolucao);
		setIdAssociado(idAssociado);
		setEdicao(edicao);
		setTitulo(titulo);
		setISBN(null);
	}

	public Date getDtEmprestimo() {
		return dtEmprestimo;
	}

	public void setDtEmprestimo(Date dtEmprestimo) {
		this.dtEmprestimo = dtEmprestimo;
	}

	public GregorianCalendar getDtDevolucao() {
		return dtDevolucao;
	}

	public void setDtDevolucao(GregorianCalendar dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}

	public int getIdAssociado() {
		return idAssociado;
	}

	public void setIdAssociado(int idAssociado) {
		this.idAssociado = idAssociado;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
