package heranca.associacao.abstracao;

public class Endereco {
	private String rua;
	private String bairro;
	
	public Endereco(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	public Endereco() {
		
	}
	public String getRua() {
		return this.rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return this.bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
