package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoUI {
	
	public static void inicializar(Biblioteca b){
		try{
			do{
			
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
			System.out.println("Cadastro concluido com sucesso!\n");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
			
	}

	
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
	
	public void exibirA(Biblioteca b){
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o ID do aluno:\n");
		int id = s.nextInt();
		b.exibirEmprestimos(b.findAluno(id));
	}
}
