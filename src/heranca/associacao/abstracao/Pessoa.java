package heranca.associacao.abstracao;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	/*Com o atributo setado como protected, s� ser� possivel acessar
	 * de uma classe herdeira ou uma classe do mesmo pacote onde o pai
	 * est�.*/
	static{
		System.out.println("Dentro do bloco de inicializa��o static pessoa0");
	}
	{
		System.out.println("Dentro do bloco de inicializa��o pessoa1");
	}
	{
		System.out.println("Dentro do bloco de inicializa��o pessoa2");
	}
	public Pessoa(String nome) {
		System.out.println("Dentro do construtor de pessoa");
		this.nome = nome;
	}
	
	public Pessoa(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}
	public Pessoa() {
		//padr�o
	}
	
	public void imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf: "+this.cpf);
		System.out.println("Endere�o: "+this.endereco.getBairro()+"|"+this.endereco.getRua());
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
