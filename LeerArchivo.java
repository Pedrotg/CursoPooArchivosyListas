package LeerArchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args){
		
		//Favor de cambiar la ruta a la de su archivo
		String texto, ruta = "//Users//pedrotrujillogarcia//Desktop//numeros.txt";
		
		try {
			FileReader f = new FileReader(ruta);
			BufferedReader b = new BufferedReader(f);
			
			while((texto = b.readLine()) != null) {
				System.out.println(texto);
			}
			
		} catch (FileNotFoundException e) { // corresponde al FileReader 
			System.out.println("Error 1: " +e);
			//e.printStackTrace();
		} catch (IOException e) { //Corresponde al readLine() (while)
			System.out.println("Error 2: " +e);
			//e.printStackTrace();
		}
	}
}