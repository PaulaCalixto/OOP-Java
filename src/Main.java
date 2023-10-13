import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Forma {
    abstract double calcularArea();
}
class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    double calcularArea() {
        return largura * altura;
    }
}

class Circulo extends Forma {
    private double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Forma> formas = new ArrayList<>();

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        formas.add(new Retangulo(largura, altura));

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        formas.add(new Circulo(raio));

        scanner.close();

        for (Forma forma : formas) {
            System.out.println("Área da forma: " + forma.calcularArea());
        }
    }
}