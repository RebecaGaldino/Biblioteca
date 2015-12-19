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
	
	public Revista findRevista(String titulo, int edicao){
		for(int i = 0; i < revistas.size(); i++)
			if(revistas.get(i).getTitulo() == titulo)
				if(revistas.get(i).getEdicao() == edicao)
					return revistas.get(i);
		return null;
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
	
	public Livro findLivro(String isbn){
		for(int i = 0; i < livros.size(); i++)
			if(livros.get(i).getISBN() == isbn)
				return livros.get(i);
		return null;
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
	
	public Aluno findAluno(int id){
		for(int i = 0; i < alunos.size(); i++)
			if(alunos.get(i).getIdAssociado() == id)
					return alunos.get(i);
		return null;
	}
	
	public void addAluno(Aluno a) throws Exception{
		if(!findAluno(a)) {
			alunos.add(a);
			System.out.println("Aluno cadastrado com sucesso!\n");
			
		} else {
			throw new Exception("Aluno ja cadastrado!\n");
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
			throw new Exception("Professor ja cadastrado!\n");
		}
	}
	

	/*---------------------------------- MÉTODOS DE EMPRESTIMOS -----------------------------------------------------*/
	
	//ALUNOS
	
	public void emprestimoAluno(Aluno a, Livro l) throws Exception{
		Aluno x = alunos.get(findPos(a));
		Livro y =  livros.get(findPos(l));
		int tam = x.getEmprestimos().size();
		if( tam < 3){
			for(int i = 0; i < x.getEmprestimos().size(); i++){
				if(x.getEmprestimos().get(i).getISBN() == y.getISBN())
					throw new Exception("O aluno ja locou esse livro!\n");
			}
			Date hoje = new Date();
			GregorianCalendar gc=new GregorianCalendar();
			gc.add(Calendar.MONTH, 1);
			Emprestimo e = new Emprestimo(hoje,gc,x.getIdAssociado(),y.getISBN());
			x.getEmprestimos().add(e);
			y.setQuantidade(y.getQuantidade()-1);
		} else
			throw new Exception("O aluno ja atingiu a cota maxima de livros e revistas locados!\n");	
		
	}
	
	public void emprestimoAluno(Aluno a, Revista r) throws Exception{
		Aluno x = alunos.get(findPos(a));
		Revista y =  revistas.get(findPos(r));
		int tam = x.getEmprestimos().size();
		if( tam < 3){
			for(int i = 0; i < x.getEmprestimos().size(); i++){
				if(x.getEmprestimos().get(i).getTitulo() == y.getTitulo())
					throw new Exception("O aluno ja locou essa revista!\n");
			}
			Date hoje = new Date();
			GregorianCalendar gc=new GregorianCalendar();
			gc.add(Calendar.MONTH, 1);
			Emprestimo e = new Emprestimo(hoje,gc,x.getIdAssociado(),y.getTitulo(),y.getEdicao());
			x.getEmprestimos().add(e);
			y.setQuantidade(y.getQuantidade()-1);
		} else
			throw new Exception("O aluno ja atingiu a cota maxima de livros e revistas locados!\n");
		
	}
	
	//PROFESSORES
	
	public void emprestimoProfessor(Professor p, Livro l) throws Exception{
		Professor x = professores.get(findPos(p));
		Livro y =  livros.get(findPos(l));
		int tam = x.getEmprestimos().size();
		if( tam < 5){
			for(int i = 0; i < x.getEmprestimos().size(); i++){
				if(x.getEmprestimos().get(i).getISBN() == y.getISBN())
					throw new Exception("O professor ja locou esse livro!\n");
			}
			Date hoje = new Date();
			GregorianCalendar gc=new GregorianCalendar();
			gc.add(Calendar.MONTH, 1);
			Emprestimo e = new Emprestimo(hoje,gc,x.getIdAssociado(),y.getISBN());
			x.getEmprestimos().add(e);
			y.setQuantidade(y.getQuantidade()-1);
		} else
			throw new Exception("O professor ja atingiu a cota maxima de livros e revistas locados!\n");	
		
	}
	
	public void emprestimoProfessor(Professor p, Revista r) throws Exception{
		Professor x = professores.get(findPos(p));
		Revista y =  revistas.get(findPos(r));
		int tam = x.getEmprestimos().size();
		if( tam < 5){
			for(int i = 0; i < x.getEmprestimos().size(); i++){
				if(x.getEmprestimos().get(i).getTitulo() == y.getTitulo())
					if(x.getEmprestimos().get(i).getEdicao() == y.getEdicao())
						throw new Exception("O professor ja locou essa revista!\n");
			}
			Date hoje = new Date();
			GregorianCalendar gc=new GregorianCalendar();
			gc.add(Calendar.MONTH, 1);
			Emprestimo e = new Emprestimo(hoje,gc,x.getIdAssociado(),y.getTitulo(),y.getEdicao());
			x.getEmprestimos().add(e);
			y.setQuantidade(y.getQuantidade()-1);
		} else
			throw new Exception("O professor ja atingiu a cota maxima de livros e revistas locados!\n");
		
	}
	
	//-ALL 
	
	public void exibirEmprestimos(Aluno a){
		Aluno x = alunos.get(findPos(a));
		for(int i = 0; i < x.getEmprestimos().size(); i++){
			if(x.getEmprestimos().get(i).getISBN() != null){
				Livro l = findLivro(x.getEmprestimos().get(i).getISBN());
				System.out.println("Titulo: " + l.getTitulo()
								+ "ISBN: " + l.getISBN() 
								+ "Data de emprestimo: " + x.getEmprestimos().get(i).getDtDevolucao() 
								+ "\n---------------------------------------------\n"
						);
			}	else
				System.out.println("Titulo: " + x.getEmprestimos().get(i).getTitulo() 
						+ "Edicao: " + x.getEmprestimos().get(i).getEdicao() 
						+ "Data de emprestimo: " + x.getEmprestimos().get(i).getDtDevolucao() 
						+ "\n---------------------------------------------\n"
				);
		}
	}
	
	public void exibirEmprestimos(Professor p){
		Professor x = professores.get(findPos(p));
		for(int i = 0; i < x.getEmprestimos().size(); i++){
			if(x.getEmprestimos().get(i).getISBN() != null){
				Livro l = findLivro(x.getEmprestimos().get(i).getISBN());
				System.out.println("Titulo: " + l.getTitulo()
								+ "ISBN: " + l.getISBN() 
								+ "Data de emprestimo: " + x.getEmprestimos().get(i).getDtDevolucao() 
								+ "\n---------------------------------------------\n"
						);
			}	else
				System.out.println("Titulo: " + x.getEmprestimos().get(i).getTitulo() 
						+ "Edicao: " + x.getEmprestimos().get(i).getEdicao() 
						+ "Data de emprestimo: " + x.getEmprestimos().get(i).getDtDevolucao() 
						+ "\n---------------------------------------------\n"
				);
		}
	}

	
	/*---------------------------------- MÉTODOS DE DEVOLUCAO -----------------------------------------------------*/
	
	//ALUNOS
	
	public void devolucaoLivro(Aluno a, Livro l) throws Exception{
		Aluno x = alunos.get(findPos(a));
		Livro y =  livros.get(findPos(l));
		boolean notFound = true;
		
		if(!x.getEmprestimos().isEmpty()){
			for(int i = 0; i < x.getEmprestimos().size(); i++){
				if(x.getEmprestimos().get(i).getISBN() == y.getISBN()){
					x.getEmprestimos().remove(i);
					y.setQuantidade(y.getQuantidade()+1);
				} else
					notFound = true;
			}
			
			if(!notFound)
				throw new Exception("O aluno nao locou esse livro!\n");
		} else 
			throw new Exception("O aluno nao locou nada.\n");
	}
	
	public void devolucaoRevista(Aluno a, Revista r) throws Exception{
		Aluno x = alunos.get(findPos(a));
		Revista y =  revistas.get(findPos(r));
		boolean notFound = true;
		
		if(!x.getEmprestimos().isEmpty()){
			for(int i = 0; i < x.getEmprestimos().size(); i++){
				if(x.getEmprestimos().get(i).getTitulo() == y.getTitulo())
					if(x.getEmprestimos().get(i).getEdicao() == y.getEdicao()){
						x.getEmprestimos().remove(i);
						y.setQuantidade(y.getQuantidade()+1);
				} else
					notFound = true;
			}
			
			if(!notFound)
				throw new Exception("O aluno nao locou essa revista!\n");
		} else 
			throw new Exception("O aluno nao locou nada.\n");
	}
	
	//PROFESSORES 
	
	public void devolucaoLivro(Professor p, Livro l) throws Exception{
		Professor x = professores.get(findPos(p));
		Livro y =  livros.get(findPos(l));
		boolean notFound = true;
		
		if(!x.getEmprestimos().isEmpty()){
			for(int i = 0; i < x.getEmprestimos().size(); i++){
				if(x.getEmprestimos().get(i).getISBN() == y.getISBN()){
					x.getEmprestimos().remove(i);
					y.setQuantidade(y.getQuantidade()+1);
				} else
					notFound = true;
			}
			
			if(!notFound)
				throw new Exception("O professor nao locou esse livro!\n");
		} else 
			throw new Exception("O professor nao locou nada.\n");
	}
	
	public void devolucaoRevista(Professor p, Revista r) throws Exception{
		Professor x = professores.get(findPos(p));
		Revista y =  revistas.get(findPos(r));
		boolean notFound = true;
		
		if(!x.getEmprestimos().isEmpty()){
			for(int i = 0; i < x.getEmprestimos().size(); i++){
			if(x.getEmprestimos().get(i).getTitulo() == y.getTitulo())
				if(x.getEmprestimos().get(i).getEdicao() == y.getEdicao()){
					x.getEmprestimos().remove(i);
					y.setQuantidade(y.getQuantidade()+1);
			} else
					notFound = true;
			}
			
			if(!notFound)
				throw new Exception("O professor nao locou essa revista!\n");
			
		} else
			throw new Exception("O professor nao locou nada.\n");
		
	}
	
	
	
		
}
