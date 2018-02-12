import java.util.Scanner;
//Lo que seaaaaaaaaaaaaaaaaaaaaaa
public class Calculadora {
	double res=0;
	private static Scanner teclado;
	public static double suma (double num1, double num2){
		return num1+num2;
	}
	
	public static double resta (double num1, double num2){
		return num1-num2;
	}
	
	public static double multiplicacion (double num1, double num2) {
		return num1*num2;
	}
	
	public static double division (double num1, double num2){
		return num1/num2;
	}
	
	public static void main(String args[]){
		teclado = new Scanner (System.in);
		double x=0;
		double z=0;
		int w;
		double res=0;
		int c=0;
		do{
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Salir del programa");
			System.out.println("Elige operación");
			w=teclado.nextInt();
			
			if (w<5){
				if (c==0){
					System.out.println("Ingrese un valor numérico para x: ");
					x=teclado.nextDouble();
					System.out.println("Ingrese un valor numérico para z: ");
					z=teclado.nextDouble();
					
					switch(w){
					case 1: System.out.println("El resultado de la suma es "+suma(x,z));
					res=suma(x,z);
					break;
					case 2: System.out.println("El resultado de la resta es "+resta(x,z));
					res=resta(x,z);
					break;
					case 3: System.out.println("El resultado de la multiplicación es "+multiplicacion(x,z));
					res=multiplicacion(x,z);
					break;
					case 4: System.out.println("El resultado de la división es "+division(x,z));
					res=division(x,z);
					break;
					case 5: System.out.println("Good bye");
					break;
					default: System.out.println("El resultado no es válido");
					}
				}
				if (c==1){
						x=res;
						System.out.println("Ingrese un valor numérico para z: ");
						z=teclado.nextDouble();
						
						switch(w){
						case 1: System.out.println("El resultado de la suma es "+suma(x,z));
						res=suma(x,z);
						break;
						case 2: System.out.println("El resultado de la resta es "+resta(x,z));
						res=resta(x,z);
						break;
						case 3: System.out.println("El resultado de la multiplicación es "+multiplicacion(x,z));
						res=multiplicacion(x,z);
						break;
						case 4: System.out.println("El resultado de la división es "+division(x,z));
						res=division(x,z);
						break;
						case 5: System.out.println("Good bye");
						break;
						default: System.out.println("El resultado no es válido");
						}
				}
				c=1;
			}
			
		}while (w!=5);
	}
}
