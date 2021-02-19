package Listas;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//Como crear/declarar una lista
		//ArrayList ListaCreada = new ArrayList();
		ArrayList<Object> ListaCreada = new ArrayList<Object>();
		
		//Declarar lista de tipo String
		//ArrayList<String> ListaCreada = new ArrayList<String>();
		
		//Agregar elementos a la lista
		ListaCreada.add("Hola");  	//0
		ListaCreada.add(123);		//1
		ListaCreada.add(true);		//2
		ListaCreada.add(2.34);		//3
		ListaCreada.add('v');		//4
		
		//Imprimir el tamaño de una lista
		System.out.println("El tamaño de la lista es de: "+ListaCreada.size()+ " elementos");
		
		System.out.println("\nForma de leer una lista V1");
		//leer una lista V1
		for (int i = 0; i < ListaCreada.size(); i++) {
			System.out.print(" "+ListaCreada.get(i));
		}
		
		System.out.println("\nForma de leer una lista V2");
		//Leer una lista V2
		Iterator j = ListaCreada.iterator();
		
		while(j.hasNext()) {
			System.out.print(" "+j.next());
		}
		
		//borrar la lista completa
		//ListaCreada.clear();
		//Eliminar elemento en concreto de una lista 
		//ListaCreada.remove(2); A través de un index
		//ListaCreada.remove("Hola"); A través del contenido del elemento
		
		//Saber si la lista está vacía
		if(ListaCreada.isEmpty()) {
			System.out.println("\nDentro del IF");
		}else {
			System.out.println("\nFuera del IF");
		}
		
		//Saber si la lista contiene cierto elemento
		if(ListaCreada.contains('v'))
			System.out.println("\nDentro del IF2");
		else
			System.out.println("\nFuera del IF2");
		
		//Sublistas
		System.out.println("Sublista: "+ListaCreada.subList(0, 3));
		
		//Actualizar elemento
		ListaCreada.set(2, 'c'); //primer elemento es el index, segundo elemento es el elemento actualizado

	}

}

