package ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		
		LocalDate fechaActual = LocalDate.now(); 
		System.out.println(fechaActual);
		LocalTime horaActual = LocalTime.now();
		System.out.println(horaActual);
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println(ahora);
		
		//Fecha formateada
		int dia = fechaActual.getDayOfMonth();
		int mes = fechaActual.getMonthValue();
		int anno = fechaActual.getYear();
		
		System.out.printf("Fecha actual %d/%d/%d%n", dia, mes, anno);
		
		//Hora formateada
		int hora = horaActual.getHour();
		int minutos = horaActual.getMinute();
		
		System.out.printf("Hora actual %d:%d%n", hora, minutos);
	}
}
