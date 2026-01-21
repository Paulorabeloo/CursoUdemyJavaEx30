package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionarios {

    List<String> nomes = new ArrayList<>();
    List<Integer> ids = new ArrayList<>();
    List<Double> salarios = new ArrayList<>();
    int numFuncionarios;
    Scanner sc = new Scanner(System.in);

    public Funcionarios(int n) {
        for(int i=1; i<=n; i++) {

            System.out.println("");
            System.out.println("Empregado #" + i);
            System.out.print("Id: ");
            int id = Integer.parseInt(sc.nextLine());
            ids.add(id);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            nomes.add(nome);
            System.out.print("Salario: ");
            double salario = Double.parseDouble(sc.nextLine());
            salarios.add(salario);
            numFuncionarios++;

        }
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public List<Double> getSalarios() {
        return salarios;
    }

    public void setSalarios(List<Double> salarios) {
        this.salarios = salarios;
    }



    public void aumentoSalarial(int id, double porcentagem) {
        for(int i=0; i < ids.size(); i++) {
            if(ids.get(i) == id) {
                double salarioAtual = salarios.get(i);
                double novoSalario = salarioAtual + (salarioAtual * porcentagem / 100);
                salarios.set(i, novoSalario);
                return;
            }
        }
        System.out.println("ID não encontrado. Operação Aboratada.");
    }

    public void exibir() {
        System.out.println("Lista de empregados: ");
        for (int i=0; i<numFuncionarios; i++) {
            System.out.printf("%d , %s , $d", getIds(), getNomes(), getSalarios());
        }
    }

}
