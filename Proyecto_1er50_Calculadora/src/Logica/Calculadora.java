package Logica;

import java.util.LinkedList;

public class Calculadora {
	public Calculadora() {
	}

	public double calcular(String Expre) throws Exception {
		double resultado = 0;
		String aux = Expre;
		Regulador scanner = new Regulador();
		aux = scanner.Scan(aux);
		if (aux.equals("P") || aux.equals("O")) {
			if (aux.equals("P"))
				throw new Exception("Verificar los paréntesis. Gracias.");
			else
				throw new Exception("El número de operadores no es correcto. Gracias.");
		} else {

			Caracter e;
			e = new Caracter(aux);
			LinkedList exp = e.CompletoPrefija();
			if ((exp.size() != 0) && (exp.size() != 2)) {
				Arbol ar = new Arbol(exp);
				resultado = ar.Evaluar();
			} else
				throw new Exception("Verifique la expresión. Gracias.");
		}
		return resultado;
	}
}
