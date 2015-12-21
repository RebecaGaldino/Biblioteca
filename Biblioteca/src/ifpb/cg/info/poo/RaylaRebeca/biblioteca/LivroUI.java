package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * UI do livro, possuindo o metodo de adicao deles 
 */
import java.util.*;

public class LivroUI {
	
	public static void adicionarLivro(Biblioteca b){
		try{
			System.out.println("------------Bem vindo a adicao de livros!-----------");
			Scanner s = new Scanner(System.in);
			System.out.println("Insira o titulo do livro: \n");
			String titulo = s.nextLine();
			System.out.println("Insira a editora: \n");
			String editora = s.nextLine();
			System.out.println("Insira o local de edicao: \n");
			String edicao = s.nextLine();
			System.out.println("Insira as palavras chave:\n");
			boolean encerrar = false;
			while(!encerrar){
				String keywords = s.nextLine();
				System.out.println("Encerrar? (S/N)\n");
				if(s.nextLine().toUpperCase() == "S")
					encerrar = true;
			}
			System.out.println("Insira o numero da edicao: \n");
			int numEdicao = s.nextInt();
			System.out.println("Insira o nome do(a) autor(a): \n");
			String autor = s.nextLine();
			System.out.println("Insira o ISBN do livro: \n");
			String isbn = s.nextLine();
			System.out.println("Insira as palavras-chaves: \n");
			String Keywords = s.nextLine();
			Livro livro = new Livro(titulo, editora, edicao, 1, numEdicao, autor, isbn, Keywords);
			b.addLivro(livro);
				
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
	}

}
