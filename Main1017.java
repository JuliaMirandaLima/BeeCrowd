import java.util.Scanner;

class Dados{
    private int horas; 
    private int velociadeMedia;

    public Dados(int horas, int velociadeMedia) {
        this.horas = horas;
        this.velociadeMedia = velociadeMedia;
    }

    public double calcularDistancia(){
        return horas*velociadeMedia;
}
    
}
public class Main1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int kmPorLitro = 12;

        int tempo = sc.nextInt();
        int celocidade = sc.nextInt();

        Dados dados = new Dados(tempo, celocidade);
        System.out.printf("%.3f\n", dados.calcularDistancia()/kmPorLitro);
    }
    
    

    
}
