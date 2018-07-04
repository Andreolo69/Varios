package exercises;

import java.util.ArrayList;
import java.util.Scanner;

import jdk.nashorn.api.tree.WhileLoopTree;

public class Prezzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> al = new ArrayList<>();

		int z = 0;
		
		do {
			System.out.println("1. Nuevo precio");
			System.out.println("2. Precio medio");
			System.out.println("3. Precio maximo");
			System.out.println("4. Precio minimo");
			System.out.println("5. Mostrar los precios");
			System.out.println("6. Salir");
				
			System.out.print("Dame opcion: ");
			Scanner sc = new Scanner(System.in);
			z = sc.nextInt();
			switch (z) {
			case 1:
		nuevoPrecio(al);
		break;
			case 2:
		 precioMedio(al);
		 break;
			case 3:
		 precioMax(al);
		 break;
			case 4:
		 precioMin(al);
		 break;
			case 5:
		showPrecios(al);
		break;
			case 6:
				System.out.println("Saliendo...");
				z=7;
				break;
				default:
					System.out.println("Opcion errada");
			}
		}while (z <= 6);
	}
	
	public static void nuevoPrecio(ArrayList<Double> a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame nuevo precio: ");
		double precio = sc.nextDouble();
		a.add(precio);
	
	}

	public static void precioMedio(ArrayList<Double> a) {
		double suma = 0;
		for (Double d : a) {
			suma += d;
		}
		System.out.printf("Prezzo medio: %.2f\n", suma / a.size()); 
	}

	public static void precioMax(ArrayList<Double> a) {

		Double arr[] = new Double[a.size()];
		arr = a.toArray(arr);
		int i, j; double max =0;
		
		for (i = 0; i < arr.length; i++) {			
			for (j = 1; j < arr.length; j++) {
				if (arr[i] < arr[j])
					arr[i] = arr[j];
				max = arr[i];
				
			}
			
		}
		System.out.println("Max: "+max);
	}

	public static void precioMin(ArrayList<Double> a) {

		Double arr[] = new Double[a.size()];
		arr = a.toArray(arr);
		int i, j;	double min = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = 1; j < arr.length; j++) {
				if (arr[i] < arr[j])
					arr[j] = arr[i];
				min = arr[j];
			}
		}
		System.out.println("Min: "+min);
	}

	public static void showPrecios(ArrayList<Double> a) {
		for (Double d : a) {
			System.out.println("Todos los precios: " + d);
		}
	}

}
