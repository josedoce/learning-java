package heranca.associacao.abstracao;

public class Professor {
	private String nome;
	private String especialidade;
	//um professor possui muitos seminarios
	private Seminario[] seminarios;
	
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	public Professor() {
		
	}
	public void print() {
		System.out.println(" ");
		System.out.println("Professor: "+this.nome);
		System.out.println("Especialidade: "+this.especialidade);
		int i = 1;
		System.out.println("------seminarios------");
		if(this.seminarios!=null && this.seminarios.length != 0) {
			for(Seminario sem: this.seminarios) {
				System.out.println("Seminario "+i+": "+sem.getTitulo());
				i++;
			}
			return;
		}
		
	}
	public Seminario[] getSeminario() {
		return this.seminarios;
	}
	public void setSeminario(Seminario[] seminario) {
		this.seminarios = seminario;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEsp() {
		return this.especialidade;
	}
	public void setEsp(String esp) {
		this.especialidade = esp;
	}
}
