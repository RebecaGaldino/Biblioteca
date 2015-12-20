package ifpb.cg.info.poo.RaylaRebeca.biblioteca;

/**
 * @author Rebeca Galdino
 * Classe maior do projeto Biblioteca, contendo os métodos básicos de todos os elementos
 */

import java.util.*;



public class Biblioteca {
	/**
	 * Arrays para armazenar os elementos do programa que forem registrados
	 */
	ArrayList<Revista> revistas = new ArrayList<Revista>();
	ArrayList<Livro> livros = new ArrayList<Livro>();
	ArrayList<Professor> professores = new ArrayList<Professor>();
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	/*---------------------------------- REVISTAS -----------------------------------------------------*/
	
	
	public Revista getRevista(int index){
		return revistas.get(index);
	}
	
	/**
	 * Metodo que verifica se uma revista se encontra registrada 
	 * @param r, objeto do tipo Revista
	 * @return true se estiver, false se não
	 */
	public boolean findRevista(Revista r){
		for(int i = 0; i < revistas.size(); i++)
			if(revistas.get(i).equals(r))
				return true;
		return false;
	}
	
	/**
	 * Metodo que verifica se uma revista se encontra registrada a partir de seu titulo e edicao
	 * @param titulo
	 * @param edicao
	 * @return a revista se estiver, null se não.
	 */
	public Revista findRevista(String titulo, int edicao){
		for(int i = 0; i < revistas.size(); i++)
			if(revistas.get(i).getTitulo() == titulo)
				if(revistas.get(i).getEdicao() == edicao)
					return revistas.get(i);
		return null;
	}
	
	/**
	 * Metodo que encontra a posicao de uma determinada revista no array de revistas
	 * @param r - a revista
	 * @return a posicao dela ou 0;
	 */
	public int findPos(Revista r){
		for(int i = 0; i < revistas.size(); i++)
			if(revistas.get(i).equals(r))
					return i;
		return -1;
	}
	
	/**
	 * Metodo de adicao da revista, exibindo se for apenas adicionada ou incrementada
	 * @param r - a revista
	 */
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
	
	/**
	 * Metodo que verifica se um livro se encontra registrado 
	 * @param l, objeto do tipo Livro
	 * @return true se estiver, false se não
	 */
	public boolean findLivro(Livro l){
		for(int i = 0; i < livros.size(); i++)
			if(livros.get(i).equals(l))
				return true;
		return false;
	}
	
	/**
	 * Metodo que verifica se um livro se encontra registrado a partir de seu codigo isbn
	 * @param isbn, codigo diferenciador
	 * @return o livro se estiver, null se não.
	 */
	public Livro findLivro(String isbn){
		for(int i = 0; i < livros.size(); i++)
			if(livros.get(i).getISBN() == isbn)
				return livros.get(i);
		return null;
	}
	
	/**
	 * Metodo que encontra a posicao de um determinado livro no array de livros
	 * @param l - o livro
	 * @return a posicao dele ou 0;
	 */
	public int findPos(Livro l){
		for(int i = 0; i < livros.size(); i++)
			if(livros.get(i).equals(l))
					return i;
		return 0;
	}
	
	/**
	 * Metodo de adicao do livro, exibindo se for apenas adicionado ou incrementado
	 * @param l - livro
	 */
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
	
	/**
	 * Metodo que verifica se um aluno se encontra registrado 
	 * @param a - objeto do tipo Aluno
	 * @return true se estiver, false se não
	 */
	public boolean findAluno(Aluno a){
		for(int i = 0; i < alunos.size(); i++)
			if(alunos.get(i).equals(a))
				return true;
		return false;
	}
	
	/**
	 * Metodo que encontra a posicao de um determinado aluno no array de alunos
	 * @param a
	 * @return a posicao do aluno ou 0, se nao estiver
	 */
	public int findPos(Aluno a){
		for(int i = 0; i < alunos.size(); i++)
			if(alunos.get(i).equals(a))
					return i;
		return 0;
	}
	
	/**
	 * Metodo de identificacao do aluno estar ou nao no array pelo seu id de associado 
	 * @param id - idAssociado
	 * @return o objeto do aluno referente ou null
	 */
	public Aluno findAluno(int id){
		for(int i = 0; i < alunos.size(); i++)
			if(alunos.get(i).getIdAssociado() == id)
					return alunos.get(i);
		return null;
	}
	
	/**
	 * Metodo de adicao do aluno no array
	 * @param a
	 * @throws Exception se o aluno ja estiver cadastrado
	 */
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
	
	/**
	 * Metodo que verifica se um professor se encontra registrado 
	 * @param p - objeto do tipo Professor
	 * @return true se estiver, false se não
	 */
	public boolean findProfessor(Professor p){
		for(int i = 0; i < professores.size(); i++)
			if(professores.get(i).equals(p))
				return true;
		return false;
	}
	
	/**
	 * Metodo de identificacao do prof estar ou nao no array pelo seu id de associado 
	 * @param id - idAssociado
	 * @return o objeto do prof referente ou null
	 */
	public Professor findProfessor(int id){
		for(int i = 0; i < professores.size(); i++)
			if(professores.get(i).getIdAssociado() == id)
				return professores.get(i);
		return null;
	}
	
	/**
	 * Metodo que encontra a posicao de um determinado professor no array de professores
	 * @param p
	 * @return a posicao do prof ou 0, se nao estiver
	 */
	public int findPos(Professor p){
		for(int i = 0; i < professores.size(); i++)
			if(professores.get(i).equals(p))
					return i;
		return 0;
	}
	
	/**
	 * Metodo de adicao do prof no array
	 * @param a
	 * @throws Exception se o prof ja estiver cadastrado
	 */
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
	
	/**
	 * Metodo que faz o emprestimo do livro indicado ao aluno. Procura a posicao do aluno no array de alunos,
	 * a do livro no do de livros e o tamanho do seu array de emprestimos, que dependendo do tamanho permitira
	 * ou nao a locacao. Se sim, verifica-se se o livro ja esta no array, se nao, atribui-se a data, loca-se o livro 
	 * e o adiciona ao array pessoal de emprestimos do aluno. Alem disso, diminui a quantidade do livro disponivel. 
	 * @param a
	 * @param l
	 * @throws Exception se o aluno tiver atingido a cota de livros ou se ja o tiver locado
	 */
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
	
	/**
	 * Metodo que faz o emprestimo da revista indicada ao aluno. Procura a posicao do aluno no array de alunos,
	 * a da revista no de revistas e o tamanho do seu array de emprestimos, que dependendo do tamanho permitira
	 * ou nao a locacao. Se sim, verifica-se se a revista ja esta no array, se nao, atribui-se a data, loca-se a revista 
	 * e o adiciona ao array pessoal de emprestimos do aluno. Alem disso, diminui a quantidade da revista disponivel. 
	 * @param a
	 * @param r
	 * @throws Exception se o aluno tiver atingido a cota de revistas ou se ja a tiver locado
	 */
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
	
	/**
	 * Metodo que faz o emprestimo do livro indicado ao prof. Procura a posicao do prof no array de profs,
	 * a do livro no do de livros e o tamanho do seu array de emprestimos, que dependendo do tamanho permitira
	 * ou nao a locacao. Se sim, verifica-se se o livro ja esta no array, se nao, atribui-se a data, loca-se o livro 
	 * e o adiciona ao array pessoal de emprestimos do prof. Alem disso, diminui a quantidade do livro disponivel. 
	 * @param p
	 * @param l
	 * @throws Exception se o prof tiver atingido a cota de livros ou se ja o tiver locado
	 */
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
	
	/**
	 * Metodo que faz o emprestimo da revista indicada ao prof. Procura a posicao do prof no array de profs,
	 * a da revista no de revistas e o tamanho do seu array de emprestimos, que dependendo do tamanho permitira
	 * ou nao a locacao. Se sim, verifica-se se a revista ja esta no array, se nao, atribui-se a data, loca-se a revista 
	 * e o adiciona ao array pessoal de emprestimos do prof. Alem disso, diminui a quantidade da revista disponivel. 
	 * @param p
	 * @param r
	 * @throws Exception se o prof tiver atingido a cota de revistas ou se ja a tiver locado
	 */
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
	
	/**
	 * Metodo que exibe os correntes emprestimos do aluno, categorizando por titulo e ISBN 
	 * se for livro, contendo o campo de ISBN nao nulo, e por titulo  edicao se for revista
	 * (que contem o ISBN nulo)
	 * @param a
	 */
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
	
	/**
	 * Metodo que exibe os correntes emprestimos do prof, categorizando por titulo e ISBN 
	 * se for livro, contendo o campo de ISBN nao nulo, e por titulo  edicao se for revista
	 * (que contem o ISBN nulo)
	 * @param p
	 */
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
	
	/**
	 * Metodo que devolve o livro, pegando a pos do aluno no array de alunos, a de livros e verificando se o isbn presente
	 * no array de emprestimos do selecionado e o correto, ate encontrar e excluir, setando a quantidade para maior no
	 * array de livros. 
	 * @param a
	 * @param l
	 * @throws Exception Se o aluno nao tiver locado o livro ou se nao tiver locado nada
	 */
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
	
	/**
	 * Metodo que devolve a revista, pegando a pos do aluno no array de alunos, a da revista e verificando se o titulo e edicao presentes
	 * no array de emprestimos do selecionado e o correto, ate encontrar e excluir, setando a quantidade para maior no
	 * array de revistas. 
	 * @param a
	 * @param r
	 * @throws Exception Se o aluno nao tiver locado a revista ou se nao tiver locado nada
	 */
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
	
	/**
	 * Metodo que devolve o livro, pegando a pos do prof no array de profs, a de livros e verificando se o isbn presente
	 * no array de emprestimos do selecionado e o correto, ate encontrar e excluir, setando a quantidade para maior no
	 * array de livros. 
	 * @param a
	 * @param l
	 * @throws Exception Se o prof nao tiver locado o livro ou se nao tiver locado nada
	 */
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
	
	/**
	 * Metodo que devolve a revista, pegando a pos do prof no array de prof, a da revista e verificando se o titulo e edicao presentes
	 * no array de emprestimos do selecionado e o correto, ate encontrar e excluir, setando a quantidade para maior no
	 * array de revistas. 
	 * @param a
	 * @param r
	 * @throws Exception Se o prof nao tiver locado a revista ou se nao tiver locado nada
	 */
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
