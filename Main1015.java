import java.util.Scanner;

class Pontos{
    
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Pontos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distancia(){
        double distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
        return distancia;
    }

    
}
public class Main1015 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();

    Pontos ponto = new Pontos(x1, x2, y1, y2);
    System.out.printf("%.4f", ponto.distancia());

    sc.close();
 }
    
}
