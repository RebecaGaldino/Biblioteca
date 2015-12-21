package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 *  @author Rayla Medeiros e Rebeca Galdino
 *  User Interface da classe Professor do projeto Biblioteca. Apresenta o menu com opcoes relativas ao professor e os metodos delas,
 *  chamando a classe biblioteca. 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ProfessorUI {
	public static void inicializar(Biblioteca b){
		try{
			do{
			
			System.out.println("--------------Opcoes para professores------------");
			System.out.println("O que deseja fazer?");
			System.out.println(" 1 - Cadastrar professor \n"
							+ "  2 - Locar um livro ou revista \n"
							+ "  3 - Devolver um livro ou revista \n"
							+ "  4 - Ver livros  revistas pegos de um professor\n"
							+ "  5 - Voltar ao Menu ");
		    
			} while(ProfessorUI.escolha(b));
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
		
	}
	
	/**
	 * Subdireciona para os metodos selecionados
	 * @param b
	 * @return
	 * @throws Exception
	 */
	public static boolean escolha(Biblioteca b) throws Exception{
		ProfessorUI prof = new ProfessorUI();
		try{
			Scanner s = new Scanner(System.in);
			int op = s.nextInt();
			switch (op){
				case 1 : 
					prof.cadastrarP(b);
					return true;
				case 2 : 
					prof.locarP(b);
					return true;
				case 3 : 
					prof.devolverP(b);
					return true;
				case 4 : 
					prof.exibirP(b);
					return true;
				case 5 :
					return true;
				default:
					System.err.println("Escolha uma opcao valida!\n");
					return true;
					
			}
		   
	   } catch (Exception e){
		   System.err.println(e.getMessage());
		   return true;
	   }
	}	
	
	/**
	 * Metodo de cadastro do prof
	 * @param b, para indicar o array
	 * @throws Exception 
	 * @exception Menssagem se o prof ja estiver cadastrado
	 */
	public  void cadastrarP(Biblioteca b) throws Exception{
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("Insira o id de associado pra o professor:\n");
			int id = s.nextInt();
			System.out.println("Insira o nome dele:\n");
			String nome = s.nextLine();
			System.out.println("Insira o endereco dele:\n");
			String endereco = s.nextLine();
			Professor p = new Professor(id,nome,endereco);
			b.professores.add(p);
			System.out.println("Cadastro concluido com sucesso!\n");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
			
	}

	/**
	 * Metodo que oferece a opção de locar um livro ou uma revista ao prof
	 * @param b
	 * @throws Exception
	 * @exception Mensagem se o prof ja atingiu sua cota maxima
	 */
	public void locarP(Biblioteca b) throws Exception{
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("Insira o ID do professor:\n");
			int id = s.nextInt(); 
			System.out.println("O que voce deseja levar? 1 - Livro 2 - Revista\n");
			int c = s.nextInt();
			switch(c){
			
				case 1:
					
					System.out.println("Insira o ISBN do livro:\n");
					String isbn = s.nextLine();
					b.emprestimoProfessor(b.findProfessor(id), b.findLivro(isbn));
					break;
					
				case 2:
					
					System.out.println("Insira o titulo da revista: (Ex.: Veja)\n");
					String nome = s.nextLine();
					System.out.println("Insira a edicao da revista:\n");
					int ed = s.nextInt();
					b.emprestimoProfessor(b.findProfessor(id), b.findRevista(nome,ed));
					break;
				
				default:
					
					System.err.println("Escolha uma opcao valida!\n");
					break;
			}
		
	  } catch (Exception e){
		  System.err.println(e.getMessage());
	   }
		
	}	
	
	/**
	 * Metodo de devolucaoo do livro ou revista locado
	 * @param b
	 * @throws Exception Se o livro nao se encontra ou o prov nao possuia nenhum livro
	 */
	public void devolverP(Biblioteca b) throws Exception{
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("Insira o ID do professor:\n");
			int id = s.nextInt(); 
			System.out.println("O que voce deseja devolver? 1 - Livro 2 - Revista\n");
			int c = s.nextInt();
			switch(c){
			
				case 1:
					
					System.out.println("Insira o ISBN do livro:\n");
					String isbn = s.nextLine();
					b.devolucaoLivro(b.findProfessor(id), b.findLivro(isbn));
					break;
					
				case 2:
					
					System.out.println("Insira o titulo da revista: (Ex.: Veja)\n");
					String nome = s.nextLine();
					System.out.println("Insira a edicao da revista:\n");
					int ed = s.nextInt();
					b.devolucaoRevista(b.findProfessor(id), b.findRevista(nome,ed));
					break;
				
				default:
					
					System.err.println("Escolha uma opcao valida!\n");
					break;
			}
		
			
			
		} catch(Exception e){
			System.err.println(e.getMessage());
		}
		
	}
	
	/**
	 * Metodo de exibiçeo do prof por base no seu id de associado
	 * @param b
	 */
	public void exibirP(Biblioteca b){
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o ID de associado do professor:\n");
		int id = s.nextInt();
		b.exibirEmprestimos(b.findProfessor(id));
	}
}
