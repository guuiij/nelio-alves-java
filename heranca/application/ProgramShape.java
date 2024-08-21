package nelioAlves.heranca.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import nelioAlves.heranca.entities.Circle;
import nelioAlves.heranca.entities.Shape;
import nelioAlves.heranca.entities.Rectangle;
import nelioAlves.heranca.entities.enums.Color;


public class ProgramShape {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter ther number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + "data: ");
            System.out.print("Rectangle or Circle (r/c) ? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACk/BLUE/RED: ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double with = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapeList.add(new Rectangle(color, with, height));
            } else {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));

            }

        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapeList) {
            System.out.println(String.format("%.2f%n",shape.area()));
        }


        sc.close();
    }
}
