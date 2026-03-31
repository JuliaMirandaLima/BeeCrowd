import java.util.Scanner;
 class Funcionario {
    private int idFuncionario;
    private int horasTrbalahdas;
    private double valorHora;
    
    public Funcionario(int idFuncionario, int horasTrbalahdas, double valorHora) {
        this.idFuncionario = idFuncionario;
        this.horasTrbalahdas = horasTrbalahdas;
        this.valorHora = valorHora;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public double calcularSalario(){
        return horasTrbalahdas*valorHora;
    }

    
    


    
} public class Main1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idFuncionario= sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        
        Funcionario func = new Funcionario(idFuncionario, horasTrabalhadas, valorHora);

        System.out.println("NUMBER = " + func.getIdFuncionario());
        System.out.printf("SALARY = U$ %.2f\n", func.calcularSalario());
       
        sc.close();
        
    }

    
}
