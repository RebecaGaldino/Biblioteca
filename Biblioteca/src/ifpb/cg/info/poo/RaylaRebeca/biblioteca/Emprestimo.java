package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.*;

public class Emprestimo {
	private Date dtEmprestimo;
	private Date dtDevolucao;
	private int edicao;
	private String ISBN;
	private int idAssociado;

	public Emprestimo(Date dtEmprestimo, Date dtDevolucao, int idAssociado, String iSBN) {
		this.dtEmprestimo = dtEmprestimo;
		this.dtDevolucao = dtDevolucao;
		this.idAssociado = idAssociado;
		ISBN = iSBN;
	}
	
	public Emprestimo(Date dtEmprestimo, Date dtDevolucao, int idAssociado, int edicao) {
		this.dtEmprestimo = dtEmprestimo;
		this.dtDevolucao = dtDevolucao;
		this.idAssociado = idAssociado;
		this.edicao = edicao;
	}

	public Date getDtEmprestimo() {
		return dtEmprestimo;
	}

	public void setDtEmprestimo(Date dtEmprestimo) {
		this.dtEmprestimo = dtEmprestimo;
	}

	public Date getDtDevolucao() {
		return dtDevolucao;
	}

	public void setDtDevolucao(Date dtDevolucao) {
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

}
