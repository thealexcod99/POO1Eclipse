package ejercicios;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;


public class LeerDatos {

	public static void main(String[] args) throws IOException {
		
		List<Ciudad> listaCiudades = new ArrayList<>(); //Colección de objetos(Ciudad)
		
		String archCSV = "csv/Ciudades.csv"; //asignar el archivo csv a un String
		CSVReader csvReader = new CSVReader(new FileReader(archCSV)); //leer el archivo csv 
		String[] fila = null; //separar los elementos del csv en columnas
		int contador = 0;
		
		while((fila = csvReader.readNext()) != null) {
			if (contador == 0)
				contador++;
			else {

//				System.out.println("Nombre de ciudad: " + fila[0] + " | " + fila[1] + " |  " + fila[2] + " | " + fila[3]);
//			    System.out.println("--------------------------------------------------------------------------------------------------------");
				Ciudad ciudad = new Ciudad(fila[0], fila[1], Float.parseFloat(fila[2]), Float.parseFloat(fila[3])); //Crear el objeto Ciudad pasandole los elementos leidos del csv 
				System.out.println(ciudad);
				contador++;
				listaCiudades.add(ciudad); //añadir a la colección el objeto Ciudad creado con sus elementos
			}
		}
		System.out.println(listaCiudades); //imprimir la colección del objeto Ciudad
		csvReader.close();

	}
}
