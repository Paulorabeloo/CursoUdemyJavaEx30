package application;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários vão ser registrados? ");
        int n = sc.nextInt();
        Funcionarios funcionarios = new Funcionarios(n);

        System.out.print("Digite o id do funcionário que vai ter o salário aumentado: ");
        int id = sc.nextInt();
        System.out.println("Digite a porcentagem: ");
        double porcentagem = sc.nextDouble();
        funcionarios.aumentoSalarial(id, porcentagem);

        funcionarios.exibir();


    }
}