import java.util.Scanner;
class Automovel{
    private int ditanciaTotal;
    private double totalCombustivel;
    public Automovel(int ditanciaTotal, double totalCombustivel) {
        this.ditanciaTotal = ditanciaTotal;
        this.totalCombustivel = totalCombustivel;
    }

    public double consumo(){
        return ditanciaTotal/totalCombustivel;
    }
}

public class Main1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        double combustivel = sc.nextDouble();

        Automovel automovel = new Automovel(distancia, combustivel);

        System.out.printf("%.3f km/l\n", automovel.consumo());
        sc.close();


    }
    
}
