package modules;

import java.util.Scanner;

import modules.shapes.Rectangle;
import modules.shapes.Square;
import modules.shapes.Triangle;

public class MenuGeometry {
    Scanner input = new Scanner(System.in);

    public void getMenu() {
        try {
            String select = input.nextLine();
            switch (select) {
                case "1":
                    this.getSquare();
                    break;

                case "2":
                    this.getTriangle();
                    break;

                case "3":
                    this.getRectangle();
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }

    protected void getSquare() throws Exception {
        System.out.println("\n+++ Persegi +++");

        System.out.print("Input sisi : ");
        Float s = Float.parseFloat(input.nextLine());

        Square square = new Square(s);

        System.out.println("\n=== Hasil ===\n");
        square.gambarGeometry();
        System.out.println("Luas : " + square.luasGeometri());
        System.out.println("Keliling : " + square.kelilingGeometry());
    }

    protected void getTriangle() throws Exception {
        System.out.println("\n+++ Segitiga +++");

        System.out.print("Input alas : ");
        Float a = Float.parseFloat(input.nextLine());
        System.out.print("Input tinggi : ");
        float t = Float.parseFloat(input.nextLine());

        Triangle triangle = new Triangle(a, t);

        System.out.println("\n=== Hasil ===\n");
        triangle.gambarGeometry();
        System.out.println("Luas : " + triangle.luasGeometri());
        System.out.println("Keliling : " + triangle.kelilingGeometry());
    }

    protected void getRectangle() {
        System.out.println("\n+++ Persegi Pangjang +++");

        System.out.print("Input panjang : ");
        Float p = Float.parseFloat(input.nextLine());
        System.out.print("Input lebar : ");
        Float l = Float.parseFloat(input.nextLine());

        Rectangle rectangle = new Rectangle(p, l);

        System.out.println("\n=== Hasil ===\n");
        rectangle.gambarGeometry();
        System.out.println("Luas : " + rectangle.luasGeometri());
        System.out.println("Keliling : " + rectangle.kelilingGeometry());
    }
}
