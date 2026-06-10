package Util;

import Model.Prioridade;
import Model.Tarefa;
import Repository.ListaTarefas;

import java.util.List;
import java.util.Scanner;

public class AuxiliarTarefa {

    public static boolean criacaoTarefa(Scanner scanner){
        scanner.nextLine();
        System.out.println("Como vai se chamar a tarefa?");
        String titulo = scanner.nextLine();
        System.out.println("Dê a descrição da tarefa:");
        String descricao = scanner.nextLine();
        System.out.println("Qual a prioridade da tarefa?");
        System.out.println("1 - ALTA");
        System.out.println("2 - MÉDIA");
        System.out.println("3 - ALTA");
        int escolhas = scanner.nextInt();
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
        scanner.nextLine();
        System.out.println("Em quanto tempo deseja concluir a tarefa?");
        String prazo = scanner.nextLine();
        ListaTarefas.addTarefa(new Tarefa(titulo,descricao,prioridade,prazo));
        return true;
    }

    public static boolean imprimirTarefas(){
        if(!ListaTarefas.getTarefas().isEmpty()) {
            List<Tarefa> tarefas = ListaTarefas.getTarefas();
            for (Tarefa tarefa : tarefas) {
                System.out.println("==============================");
                System.out.println("TAREFA:    "+tarefa.getTitulo());
                System.out.println("DESCIÇÂO:  "+tarefa.getDescricao());
                System.out.println("STATUS:    "+tarefa.getStatus());
                System.out.println("PRIORIDADE:"+tarefa.getPrioridade());
                System.out.println("CRIAÇÂO:   "+tarefa.getCriacao());
                System.out.println("PRAZO:     "+tarefa.getPrazo());
                System.out.println("==============================");
            }
            return true;
        }
        else {
            return false;
        }
    }
}
