package ExamenUnidad4;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		
		int num1, num2, resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero que quieras sumar");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero a sumar");
		num2 = sc.nextInt();
		
		resultado = num1 + num2;
		
		System.out.println("La suma total es de " + resultado);
		

	}

}
