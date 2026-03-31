import java.util.Scanner;
import java.util.Locale; // 1. Importando o Locale

class Peca {
    private int codigo;
    private int qtdPeca;
    private double valor;

    public Peca(int codigo, int qtdPeca, double valor) {
        this.codigo = codigo;
        this.qtdPeca = qtdPeca;
        this.valor = valor;
    }

    public double calcularValorPorPeca() {
        return qtdPeca * valor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int qtdPeca1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();
        
        int codigo2 = sc.nextInt();
        int qtdPeca2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        Peca primeiraPeca = new Peca(codigo1, qtdPeca1, valorUnitario1);
        Peca segundPeca = new Peca(codigo2, qtdPeca2, valorUnitario2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", primeiraPeca.calcularValorPorPeca() + segundPeca.calcularValorPorPeca());
        
        sc.close();
    }
}