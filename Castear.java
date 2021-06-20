import java.util.Scanner;
public class Castear {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double euro;
			double pesetas;
			double cantidad;
			int opcion;
			
			do {
				
					System.out.println("Presiona 1: Convertir pesetas a euros\nPresiona 2: Convertir euros a pesetas");
					opcion=sc.nextInt();
				if (opcion==1) {
					System.out.println("Introduzca la cantidad en Pesetas, con decimales si es necesario.");
					cantidad=sc.nextDouble();
					double valor=0.0060;
					euro=(valor*cantidad);
					System.out.println(euro+"€");
				}
				else if (opcion==2) {
					System.out.println("Introduzca la cantidad en Euros, con decimales si es necesario.");
					cantidad=sc.nextDouble();
					double valor=166.3860;
					pesetas=(valor*cantidad);
					System.out.println(pesetas+" pesetas");
				}else {
					System.out.println("Debes introducir una de las dos opciones");		
				}
			}while ( !( opcion ==1 || opcion == 2 ) );
		}
	}
}
