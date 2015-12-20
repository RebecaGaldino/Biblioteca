package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 *  @author Rayla Medeiros e Rebeca Galdino
 *  User Interface da classe Aluno do projeto Biblioteca. Apresenta o menu com opcoe relativas ao aluno e os metodos delas,
 *  chamando a classe biblioteca. 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoUI {
	/**
	 * Menu principal, indicando as opções acerca dos alunos.
	 * @param b, objeto de Biblioteca que chamará os métodos.
	 */
	public static void inicializar(Biblioteca b){
		try{
			do{
			
			System.out.println("--------------Opcoes para alunos------------");
			System.out.println("O que deseja fazer?");
			System.out.println(" 1 - Cadastrar aluno \n"
							+ "  2 - Locar um livro ou revista \n"
							+ "  3 - Devolver um livro ou revista \n"
							+ "  4 - Ver livros  revistas pegos de um aluno\n"
							+ "  5 - Voltar ao Menu ");
		    
			} while(AlunoUI.escolha(b));
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
		AlunoUI aluno = new AlunoUI();
		try{
			Scanner s = new Scanner(System.in);
			int op = s.nextInt();
			switch (op){
				case 1 : 
					aluno.cadastrarA(b);
					return true;
				case 2 : 
					aluno.locarA(b);
					return true;
				case 3 : 
					aluno.devolverA(b);
					return true;
				case 4 : 
					aluno.exibirA(b);
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
	 * Método de cadastro do aluno
	 * @param b, para indicar o array
	 * @throws Exception 
	 * @exception Menssagem se o aluno já estiver cadastrado
	 */
	public  void cadastrarA(Biblioteca b) throws Exception{
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("Insira o id de associado pra o aluno:\n");
			int id = s.nextInt();
			System.out.println("Insira o nome dele:\n");
			String nome = s.nextLine();
			System.out.println("Insira o endereco dele:\n");
			String endereco = s.nextLine();
			ArrayList<Emprestimo> array = new ArrayList<Emprestimo>();
			Aluno a = new Aluno(id,nome,endereco,array);
			b.alunos.add(a);
			System.out.println("Cadastro concluido com sucesso!\n");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
			
	}

	/**
	 * Método que oferece a opção de locar um livro ou uma revista ao aluno
	 * @param b
	 * @throws Exception
	 * @exception Mensagem se o aluno já atingiu sua cota máxima
	 */
	public void locarA(Biblioteca b) throws Exception{
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("Insira o ID do aluno:\n");
			int id = s.nextInt(); 
			System.out.println("O que voce deseja levar? 1 - Livro 2 - Revista\n");
			int c = s.nextInt();
			switch(c){
			
				case 1:
					
					System.out.println("Insira o ISBN do livro:\n");
					String isbn = s.nextLine();
					b.emprestimoAluno(b.findAluno(id), b.findLivro(isbn));
					break;
					
				case 2:
					
					System.out.println("Insira o titulo da revista: (Ex.: Veja)\n");
					String nome = s.nextLine();
					System.out.println("Insira a edicao da revista:\n");
					int ed = s.nextInt();
					b.emprestimoAluno(b.findAluno(id), b.findRevista(nome,ed));
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
	 * Método de devolução do livro ou revista locado
	 * @param b
	 * @throws Exception Se o livro não se encontra ou o aluno não possuía nenhum livro
	 */
	public void devolverA(Biblioteca b) throws Exception{
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("Insira o ID do aluno:\n");
			int id = s.nextInt(); 
			System.out.println("O que voce deseja devolver? 1 - Livro 2 - Revista\n");
			int c = s.nextInt();
			switch(c){
			
				case 1:
					
					System.out.println("Insira o ISBN do livro:\n");
					String isbn = s.nextLine();
					b.devolucaoLivro(b.findAluno(id), b.findLivro(isbn));
					break;
					
				case 2:
					
					System.out.println("Insira o titulo da revista: (Ex.: Veja)\n");
					String nome = s.nextLine();
					System.out.println("Insira a edicao da revista:\n");
					int ed = s.nextInt();
					b.devolucaoRevista(b.findAluno(id), b.findRevista(nome,ed));
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
	 * Método de exibição do aluno por base no seu id de associado
	 * @param b
	 */
	public void exibirA(Biblioteca b){
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o ID de associado do aluno:\n");
		int id = s.nextInt();
		b.exibirEmprestimos(b.findAluno(id));
	}
}
