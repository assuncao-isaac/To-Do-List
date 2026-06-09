package Util;

import Model.Prioridade;
import Model.Tarefa;

import java.util.Scanner;

public class AuxiliarTarefa {

    public static boolean criacaoTarefa(Scanner scanner){
        int escolhas = scanner.nextInt();

        System.out.println("Como vai se chamar a tarefa?");
        String titulo = scanner.next();
        System.out.println("Dê a descrição da tarefa:");
        String descricao = scanner.next();
        System.out.println("Qual a prioridade da tarefa?");
        System.out.println("1 - ALTA");
        System.out.println("2 - MÉDIA");
        System.out.println("3 - ALTA");

        Prioridade prioridade;
        switch (escolhas){
            case 1:
                prioridade = Prioridade.ALTA;
                break;
            case 2:
                prioridade = Prioridade.MEDIA;
                break;
            case 3:
                prioridade = Prioridade.BAIXA;
                break;
            default:
                System.out.println("resposta inválida");
                return false;
        }

        System.out.println("Em quanto tempo deseja comcluir a tarefa?");
        String prazo = scanner.nextLine();
        Tarefa tarefa = new Tarefa(titulo,descricao,prioridade,prazo);
        return true;
    }

}
