package Logica;

import java.util.LinkedList;

public class calculator {
	public calculator() {
	}

	public double calcular(String Expre) throws Exception {
		double resultado = 0;
		String aux = Expre;
		valParen valida = new valParen();
		aux = valida.valpar(aux);
		if (aux.equals("P") || aux.equals("O")) {

			System.out.println("sale parenetesis");

		} else {

			Caracter e;
			e = new Caracter(aux);
			LinkedList exp = e.CompletoPrefija();
			if ((exp.size() != 0) && (exp.size() != 2)) {
				Arbol ar = new Arbol(exp);
				resultado = ar.Evaluar();
			} else
				throw new Exception("");
		}
		return resultado;
	}
}
