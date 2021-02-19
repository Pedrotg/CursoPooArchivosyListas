package LeerArchivo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UsoDeSplit {

	public static void main(String[] args) {
		
		ArrayList<String> ListaCreada = new ArrayList<String>();
		
		ListaCreada.add("esto es una línea de texto 56756^*");

		String[]arreglo = null;
		
		for (String nombre : ListaCreada) {
			
			arreglo = nombre.split(" ");
		}
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("arreglo["+i+"] = "+arreglo[i]);
		}
		
	}

}

/*
arreglo[0] = esto
arreglo[1] = es
arreglo[2] = una
arreglo[3] = línea
arreglo[4] = de
arreglo[5] = texto
arreglo[6] = 56756^*

*/