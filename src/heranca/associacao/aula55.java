package heranca.associacao;
import heranca.associacao.abstracao.*;
//toda classe é filha de object
public class aula55 {
	public static void main(String[] args) {
		Individuo pessoa = new Individuo();
		
		pessoa.setNome("Fernanda");
		pessoa.setIdade(13);
		System.out.println(pessoa);
		Individuo pessoa2 = new Individuo();
		pessoa2.setNome("Joana");
		pessoa2.setIdade(15);
		System.out.println(pessoa2);
	}
}
