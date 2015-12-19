package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

import java.util.*;


public class Biblioteca {
	ArrayList<Revista> revistas = new ArrayList<Revista>();
	ArrayList<Livro> livros = new ArrayList<Livro>();
	ArrayList<Professor> professores = new ArrayList<Professor>();
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	/*---------------------------------- REVISTAS -----------------------------------------------------*/
	
	
	public Revista getRevista(int index){
		return revistas.get(index);
	}
	
	public boolean findRevista(Revista r){
		for(int i = 0; i < revistas.size(); i++)
			if(revistas.get(i).equals(r))
				return true;
		return false;
	}
	
	public int findPos(Revista r){
		for(int i = 0; i < revistas.size(); i++)
			if(revistas.get(i).equals(r))
					return i;
		return 0;
	}
	
	public void addRevista(Revista r){
		if(!findRevista(r)) {
			revistas.add(r);
			System.out.println("Nova revista adicionada com sucesso!\n");
		} else {
			int pos = findPos(r);
			int quant = revistas.get(pos).getQuantidade();
			revistas.get(pos).setQuantidade(quant++);
			System.out.println("Revista adicionada com sucesso!\n");
		}
	}
	
	/*---------------------------------- LIVROS -----------------------------------------------------*/
	

	public Livro getLivro(int index){
		return livros.get(index);
	}
	
	public boolean findLivro(Livro l){
		for(int i = 0; i < livros.size(); i++)
			if(livros.get(i).equals(l))
				return true;
		return false;
	}
	
	public int findPos(Livro l){
		for(int i = 0; i < livros.size(); i++)
			if(livros.get(i).equals(l))
					return i;
		return 0;
	}
	
	public void addLivro(Livro l){
		if(!findLivro(l)) {
			livros.add(l);
			System.out.println("Novo livro adicionado com sucesso!\n");
			
		} else {
			int pos = findPos(l);
			int quant = livros.get(pos).getQuantidade();
			livros.get(pos).setQuantidade(quant++);
			System.out.println("Livro adicionado com sucesso!\n");
		}
	}
	
	/*---------------------------------- ALUNOS -----------------------------------------------------*/
	
	public Aluno getAlunos(int index){
		return alunos.get(index);
	}
	
	public boolean findAluno(Aluno a){
		for(int i = 0; i < alunos.size(); i++)
			if(alunos.get(i).equals(a))
				return true;
		return false;
	}
	
	public int findPos(Aluno a){
		for(int i = 0; i < alunos.size(); i++)
			if(alunos.get(i).equals(a))
					return i;
		return 0;
	}
	
	public void addAluno(Aluno a) throws Exception{
		if(!findAluno(a)) {
			alunos.add(a);
			System.out.println("Aluno cadastrado com sucesso!\n");
			
		} else {
			throw new Exception("Aluno já cadastrado!\n");
		}
	}
	
	/*---------------------------------- PROFESSORES -----------------------------------------------------*/
	
	public Professor getProfessores(int index){
		return professores.get(index);
	}
	
	public boolean findProfessor(Professor p){
		for(int i = 0; i < professores.size(); i++)
			if(professores.get(i).equals(p))
				return true;
		return false;
	}
	
	public int findPos(Professor p){
		for(int i = 0; i < professores.size(); i++)
			if(professores.get(i).equals(p))
					return i;
		return 0;
	}
	
	public void addProfessor(Professor p) throws Exception{
		if(!findProfessor(p)) {
			professores.add(p);
			System.out.println("Professor cadastrado com sucesso!\n");
			
		} else {
			throw new Exception("Professor já cadastrado!\n");
		}
	}
	

	/*---------------------------------- MÉTODOS DE EMPRESTIMOS -----------------------------------------------------*/
	
	
	
}
