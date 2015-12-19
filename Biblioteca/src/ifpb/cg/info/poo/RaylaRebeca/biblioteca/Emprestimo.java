package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.*;

public class Emprestimo {
	private Date dtEmprestimo;
	private GregorianCalendar dtDevolucao;
	private String titulo; //para revistas somente
	private int edicao;
	private String ISBN;
	private int idAssociado;

	public Emprestimo(Date dtEmprestimo, GregorianCalendar dtDevolucao, int idAssociado, String iSBN) {
		setDtEmprestimo(dtEmprestimo);
		setDtDevolucao(dtDevolucao);
		setIdAssociado(idAssociado);
		setISBN(iSBN);
	}
	
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

}
