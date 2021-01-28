package heranca.associacao;
import heranca.associacao.abstracao.Aluno;
import heranca.associacao.abstracao.Local;
import heranca.associacao.abstracao.Professor;
import heranca.associacao.abstracao.Seminario;

public class aula48 {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("joana",12);
		Aluno aluno2 = new Aluno("victoria",14);
		
		Seminario seminario = new Seminario("Lord gour");
		Seminario seminario2 = new Seminario("Ford Conference");
		
		Professor prof = new Professor("Antonio", "desenvolvimento web");
		Local local = new Local("Rua hospedeiro feliz","verde amarelo");
		//seminario é uma variavel de referencia
		
		//associação aluno -> seminario
		aluno.setSeminario(seminario);
		aluno2.setSeminario(seminario);
		
		//associação seminario -> professor
		Aluno[] alunArray = new Aluno[2];
		alunArray[0] = aluno;
		alunArray[1] = aluno2;
		
		seminario.setProfessor(prof);
		seminario.setLocal(local);
		seminario.setAlunos(alunArray);
		
		Seminario[] semiArray = new Seminario[2];
		semiArray[0] = seminario;
		semiArray[1] = seminario2;
		prof.setSeminario(semiArray);
		
		seminario.print();
		prof.print();
		
	}
}
