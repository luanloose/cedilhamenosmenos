package Principal;

public class Simbolo {

	private String nome;      // nome do identificador
	private char tipo;        // tipo da vari�vel
	private int referencia;   // � uma refer�ncia usada na gera��o do c�digo destino
	private static int marcador = 1; // armazena a �ltima refer�ncia inclu�da na tabela

	public String toString() {
		return "\n" + "Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo() +
				"\t" + "Refer�ncia:"+this.getReferencia();
	}
	
	public char getTipo() {
		return this.tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getReferencia() {
		return this.referencia;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	
//	public static int setMarcador(int num){
//		this.marcador = this.marcador + num;
//	}

}
