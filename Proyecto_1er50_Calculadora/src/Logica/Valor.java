
package Logica;

public class Valor {
	private String valor;
	private boolean operador;

	public Valor() {
		operador = false;
		valor = "";

	}

	public Valor(String va, boolean op) {
		valor = va;
		operador = op;
	}

	public void setValor(String va) {
		this.valor = va;
	}

	public void setOperador(boolean op) {
		this.operador = op;
	}

	public String getValor() {
		return valor;
	}

	public boolean getOperator() {
		return operador;
	}
}
