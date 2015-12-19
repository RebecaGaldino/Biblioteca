package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.Scanner;

public class AlunoUI {
	
	public static void inicializar(Biblioteca b){
		try{
			do{
			
			System.out.println("O que deseja fazer?");
			System.out.println(" 1 - Cadastrar aluno \n"
							+ "  2 - Locar um livro ou revista \n"
							+ "  3 - Devolver um livro ou revista \n"
							+ "  4 - Voltar ao Menu ");
		    
			} while(AlunoUI.escolha(b));
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
		
	}
	
	public static boolean escolha(Biblioteca b) throws Exception{
		try{
			Scanner s = new Scanner(System.in);
			int op = s.nextInt();
			switch (op){
				case 1 : 
					//Cadastro method TO DO
					return true;
					
				case 2 : 
					
					System.out.println("Insira o ID do aluno:\n");
					int id = s.nextInt(); 
					System.out.println("O que voce deseja levar? 1 - Livro 2 - Revista\n");
					int c = s.nextInt();
					switch(c){
					
						case 1:
							
							System.out.println("Insira o ISBN do livro:\n");
							String isbn = s.nextLine();
							b.emprestimoAluno(b.findAluno(id), b.findLivro(isbn));
							return true;
							
						case 2:
							
							System.out.println("Insira o titulo da revista: (Ex.: Veja)\n");
							String nome = s.nextLine();
							System.out.println("Insira a edicao da revista:\n");
							int ed = s.nextInt();
							b.emprestimoAluno(b.findAluno(id), b.findRevista(nome,ed));
							return true;
						
						default:
							
							System.err.println("Escolha uma opcao valida!\n");
							return true;
					}
					
				case 3 : 
						//DEVOLUCAO METHOD TO DO
						return true;
				case 4 : 
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
	

}
