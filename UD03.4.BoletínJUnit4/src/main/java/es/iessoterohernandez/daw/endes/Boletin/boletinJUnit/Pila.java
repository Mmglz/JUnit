package es.iessoterohernandez.daw.endes.Boletin.boletinJUnit;

import java.util.Stack;

public class Pila {
	private Stack<Integer> pila = new Stack<Integer>();
	// Añadede el numero solo si es mayor que 2 y menor que 20
	public void push (Integer num) {
		if (num > 2 && num < 20)
			pila.push(num);
	}
	/*
	 Si la pila esta vacia devolvemos null, sino se devuelve el
	 ultimo numero añadido a la pila sacandolo de la pila
	*/
	public Integer pop() {
		if (pila.isEmpty())
			return null;
		else
			return pila.pop();
	}
	//Devuelve true si la pila esta vacia, false caso contrario
	public boolean isEmpty() {
		return pila.isEmpty();
	}
	/*
	 Si la pila esta vacia devolvemos null, sino se devuelve el
	 primer numero añadido a la pila sin sacarlo
	*/
	public Integer top() {
		if (pila.isEmpty())
			return null;
		else
			return pila.peek();
	}
}