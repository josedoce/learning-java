package heranca.associacao.abstracao;

public class Funcionario extends Pessoa{
	//conceito de herança referece ao aproveitamento de codigo, assim, evitando
	//escrita repetitiva de atributos e metodos de uma classe extendendo a classe.
//	private String nome; Esta contido em Pessoa
//	private String cpf;	Está contido em Pessoa
//	private Endereco endereco; Está contido em Pessoa
	
	private double salario;
	/* Ordem de inicialização das classes
	 * 1- o pai
	 * 2- o herdeiro
	 * */
	/*Ordem de inicialização dentro do pai
	 *1- o bloco static
	 *2- o bloco de inicialização
	 *3- o construtor
	 * */
	/*Ordem de inicialização dentro do herdeiro
	 * 1- o bloco static (pai 1° e herdeiro em 2°)
	 * 2- o bloco de inicialização do pai em 1°
	 * 3- o bloco de inicialização do herdeiro em 2°*/
	static{
		System.out.println("Dentro do bloco de inicialização static funcionario0");
	}
	{
		System.out.println("Dentro do bloco de inicialização funcionario1");
	}
	{
		System.out.println("Dentro do bloco de inicialização funcionario2");
	}
	public Funcionario(String nome) {
		/*regras do super
		 * 1- deve estar na primeira linha
		 * 2- não se pode usar this() onde estiver o super()*/
		super(nome); //referente ao construtor da classe Pessoa
		System.out.println("Dentro do construtor de funcionario");
		//this(); //referente ao construtor desta classe.
	}
	public Funcionario() {
		
	}
	public void imprime() {
		//solicitando o imprime da superclasse
		super.imprime();
		System.out.println(super.getNome()+" tem "+this.salario);
		imprimeReciboPagamento();
	}
	public void imprimeReciboPagamento() {
		System.out.println("Eu, "+super.nome+" recebi R$ "+this.salario);
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
