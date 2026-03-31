import java.util.Scanner;

class Funcionario{
    private String nome;
    
    private double salarioFixo;
    private double totalVendas;
    private final int percentual = 15;
    public Funcionario(String nome, double salarioFixo, double totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public double salarioComBonus(){
        return salarioFixo + ((totalVendas*percentual)/100);
    }
    
}
public class Main1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine().toUpperCase();
        double salario = sc.nextDouble();
        double venda = sc.nextDouble();

        Funcionario func = new Funcionario(nome, salario, venda);
        System.out.printf("TOTAL = R$ %.2f", func.salarioComBonus());

        sc.close();
    }
    
}
