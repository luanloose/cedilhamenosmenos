package Principal;

public class Simbolo {

	private String nome;      // nome do identificador
	private char tipo;        // tipo da variável
	private int referencia;   // é uma referência usada na geração do código destino
	private static int marcador = 1; // armazena a última referência incluída na tabela

	public String toString() {
		return "\n" + "Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo() +
				"\t" + "Referência:"+this.getReferencia();
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
