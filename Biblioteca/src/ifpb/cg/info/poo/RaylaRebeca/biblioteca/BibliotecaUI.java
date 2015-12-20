package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * Classe principal do projeto Biblioteca, a user interface que reúne as UIs de livro, revista, aluno e professor 
 */

import java.util.*;



public class BibliotecaUI {
	
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		escolha(biblioteca);	
	}
	
	public static void escolha(Biblioteca biblioteca){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("BEM VINDO!");
		System.out.println("Selecione a sessao que voce quer ir: ");
		System.out.println("1 - Aluno 2 - Professor 3 - Livros 4 - Revistas 5 - Sair");
		String op = sc.nextLine();
		switch(op){
			case "1" :
				AlunoUI.inicializar(biblioteca);
				break;
			case "2" :
				ProfessorUI.inicializar(biblioteca);
				break;
			case "3" :
				LivroUI.adicionarLivro(biblioteca);
				break;
			case "4" :
				RevistaUI.adicionarLivro(biblioteca);
				break;
			default: 
				System.err.println("Insira um digito valido!");
		}
	}
	
}
