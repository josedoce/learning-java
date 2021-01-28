package heranca.associacao.abstracao;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Aluno() {
		//construtor padrao
	}
	public void print() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		if(this.seminario != null) {
			System.out.println("Inscrição seminario: "+this.seminario.getTitulo());
			return;
		}
		System.out.println("Aluno não encontrado.");
	}
	public Seminario getSeminario() {
		return this.seminario;
	}
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
