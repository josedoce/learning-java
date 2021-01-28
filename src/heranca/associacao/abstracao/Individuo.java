package heranca.associacao.abstracao;

public class Individuo {
	private String nome;
	private int idade;
	
	//sobrescrita do metodo toString() do Object
	//colocando ou n�o colocando @Override, funcionar�, mas
	//para facilitar o entendimento, � melhor colocar
	//o metodo do toString() nativo, foi sobrescrito e auterou suas fun�oes
	@Override
	public String toString() {
		return "Nome: "+this.nome+" idade: " + this.idade;
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
