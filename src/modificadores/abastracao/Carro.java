package modificadores.abastracao;
//o metodo static não esta associado ao objeto, mas sim, a classe
//então não é possivel usar o this
//regra
//1- não se pode acessar atributos de um objeto em metodos staticos
//2- use metodos static para acessar atributos de classe static
//obs: atributos e metodos static existem antes mesmo do objeto ser criado

public class Carro {
	//Velocidade limite deve ser de 240km/h
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240;
	
	public Carro(String nome, double vlm) {
		this.nome = nome;
		this.velocidadeMaxima = vlm;
	}
	public Carro() {
		
	}
	public void imprime() {
		System.out.println("===========================");
		System.out.println("Nome: "+this.nome);
		System.out.println("Velocidade maxima: "+this.velocidadeMaxima);
		System.out.println("Velocidade limite: "+velocidadeLimite);//não precisa do this, se o atributo for da classes (static)
	}
	public static void setVML(double vml) {
		Carro.velocidadeLimite = vml;
	}
	public static double getVML() {
		return velocidadeLimite;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome(String nome) {
		return this.nome;
	}
	public void setVelocidadeMax(double vmx) {
		this.velocidadeMaxima = vmx;
	}
	public double getVelocidadeMax() {
		return this.velocidadeMaxima;
	}
	
}