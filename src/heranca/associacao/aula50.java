package heranca.associacao;
import heranca.associacao.abstracao.*;

public class aula50 {
	public static void main(String[] args) {
		//Pessoa p = new Pessoa("felipe");
		//p.setNome("carla");
		//p.setCpf("123.123.123-12");
		
		Endereco end = new Endereco();
		//end.setBairro("Galeao");
		end.setRua("Rua dona cecilia");
		//p.setEndereco(end);
		//p.imprime();
		
		System.out.println("---------------------");
		Funcionario f = new Funcionario("Antonia");
		//f.setNome("carla");
		f.setCpf("123.123.123-12");
		f.setSalario(15000);
		f.setEndereco(end);
		//f.imprime();
		
	}
}
