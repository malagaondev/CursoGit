import java.util.Scanner;

public class Entradas {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n1;
		double n2;
		System.out.println("Ingresa un valor para el primer numero");
		n1=sc.nextDouble();
		System.out.println("Ingresa un valor para el segundo numero");
		n2=sc.nextDouble();
		System.out.println(n1*n2);
	}
	
}
