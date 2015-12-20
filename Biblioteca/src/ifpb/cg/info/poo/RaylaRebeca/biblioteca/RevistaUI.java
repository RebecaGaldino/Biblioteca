package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rayla Medeiros e Rebeca Galdino
 * UI da revista, possuindo o metodo de adicao delas 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class RevistaUI {
	public static void adicionarLivro(Biblioteca b){
		try{
			System.out.println("------------Bem vindo a adicao de revistas!-----------");
			Scanner s = new Scanner(System.in);
			System.out.println("Insira o nome da revista: (Ex.: Veja) \n");
			String titulo = s.nextLine();
			System.out.println("Insira a editora: \n");
			String editora = s.nextLine();
			System.out.println("Insira o local de edicao: \n");
			String edicao = s.nextLine();
			System.out.println("Insira as palavras chave:\n");
			boolean encerrar = false;
			ArrayList<String> keywords = new ArrayList<String>();
			while(!encerrar){
				keywords.add(s.nextLine());
				System.out.println("Encerrar? (S/N)\n");
				if(s.nextLine().toUpperCase() == "S")
					encerrar = true;
			}
			System.out.println("Insira o numero da edicao: \n");
			int numEdicao = s.nextInt();
			Revista revista = new Revista(titulo,editora,edicao,keywords,1,numEdicao);
			b.addRevista(revista);
				
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
	}
}
