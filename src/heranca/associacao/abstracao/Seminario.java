package heranca.associacao.abstracao;

public class Seminario {
	private String titulo;
	//associações
	private Aluno[] alunos;
	private Professor professor;
	private Local local;
	
	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	
	public Seminario() {
		//construtor padrão
	}
	public void print() {
		System.out.println("++++++++++++++++Seminario++++++++++++++++");
		System.out.println("Titulo: "+this.titulo);
		
		if(this.professor != null) {
			System.out.println("Palestrante: "+this.professor.getNome());
		}
		if(this.local != null) {
			System.out.println("Local: "+"Rua: "+this.local.getRua()+" Bairro: "+this.local.getBairro());
		}
		
		int i = 1;
		
		System.out.println("___________alunos____________");
		if(this.alunos!= null && this.alunos.length!=0) {
			for(Aluno aluno: this.alunos) {
				System.out.println(" ");
				System.out.println("Aluno"+i+": "+aluno.getNome());
				System.out.println("Idade: "+aluno.getIdade());
				System.out.println("_____________________________");
			}
			return;
		}
		System.out.println("Aluno não encontrado.");
		
	}
	public Aluno[] getAlunos() {
		return this.alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Local getLocal() {
		return this.local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
