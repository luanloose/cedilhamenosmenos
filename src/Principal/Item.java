package Principal;

public class Item {

	private char tipo; // pode ser 'n' (número), 's' (string), 'v' (variável) ou 'o' (operador).
	private String valor;

	public Item(char _tipo, String _valor){
		this.tipo = _tipo;
		this.valor = _valor;
	}

	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

	public String toString() {
		return ("Tipo: " + this.getTipo() + "\nValor: " + this.getValor());
	}


}
