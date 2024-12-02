import java.util.Locale;
import java.util.Scanner;

public class PruebaFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el radio del círculo: ");
        int radioCirculo = sc.nextInt();
        Circulo figura1 = new Circulo(radioCirculo);

        System.out.print("Ingrese la base del rectángulo: ");
        int baseRectangulo = sc.nextInt();
        System.out.print("Ingrese la altura del rectángulo: ");
        int alturaRectangulo = sc.nextInt();
        Rectangulo figura2 = new Rectangulo(baseRectangulo, alturaRectangulo);

        System.out.print("Ingrese el lado del cuadrado: ");
        int ladoCuadrado = sc.nextInt();
        Cuadrado figura3 = new Cuadrado(ladoCuadrado);


        System.out.print("Ingrese el primer cateto del triángulo: ");
        int cateto1 = sc.nextInt();
        System.out.print("Ingrese el segundo cateto del triángulo: ");
        int cateto2 = sc.nextInt();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(cateto1, cateto2);


        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();

        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();

        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();

        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();

    }
}