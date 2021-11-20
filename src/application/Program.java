package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enttities.Circle;
import enttities.Rectangle;
import enttities.Shape;
import enttities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Shape> list = new ArrayList<>();
		
		
		
		System.out.print("Enter the number of shaper: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" +i+ " Data: ");
			System.out.print("Rectangle or Circle (r/c) ? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("widht: ");
				double widht = sc.nextDouble();
				System.out.print("height ");
				double height = sc.nextDouble();
			list.add (new Rectangle(color, widht, height));
			
		}
		else {
				System.out.print("Redius: ");
				double redius = sc.nextDouble();
			list.add(new Circle(color, redius));
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for ( Shape shape : list) 
			System.out.println(String.format("%.2f", shape.area()));
		
			
			sc.close();
			}
		}
	}
}
