package unidad3;

import java.util.Scanner;

public class Jubulacion {

	public static void main(String[] args) {
		//Nombre:Valenzuela Arce Roberto
		//Fecha: 10 de noviembre del 2022
		//Proposito: obtener los a�os a trabajar Para en base
		//a una meta, una aportacion anual y una tasa de interes
		
		//crear objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		//Definir variable de salida
		byte a�os;
		//Definir variables de entrada
		double meta, tasadeinteres, pago;
		//Definir variables auxiliares 
		double balance, interes;
		
		System.out.println("�Cuanto deseas recibir en tu jubulacion?");
		meta = entrada.nextDouble();
		System.out.println("�Cuanto sera tu aportacion anual?");
		pago =  entrada.nextDouble();
		System.out.println("Dame la tasa de interes bancaria anual en %");
		tasadeinteres = entrada.nextDouble();
		
		balance = 0;
		a�os = 0;
		
		while (balance < meta) 
		{
			balance = balance + pago;
			interes = balance * (tasadeinteres/100);
			balance = balance + interes;
			a�os = (byte) (a�os + 1);
		}
		
		System.out.println("Usted requiere " + a�os + " para jubilarse");
		System.out.println("Y recibir " + balance);

	}

}
