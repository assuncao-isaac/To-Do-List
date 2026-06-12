package Util;

import Model.Prioridade;
import Model.Status;
import Model.Tarefa;
import Repository.ListaTarefas;

import java.util.InputMismatchException;
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
        System.out.println("3 - BAIXA");
        int escolhas;
        try {
            escolhas = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("saída inesperada");
            scanner.next();
            return false;
        }

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
            int indexTarefa = 0;
            for (Tarefa tarefa : tarefas) {
                System.out.println("==============================");
                System.out.println("Número:    "+"["+indexTarefa+"]");
                System.out.println("TAREFA:    "+tarefa.getTitulo());
                System.out.println("DESCRIÇÃO:  "+tarefa.getDescricao());
                System.out.println("STATUS:    "+tarefa.getStatus());
                System.out.println("PRIORIDADE:"+tarefa.getPrioridade());
                System.out.println("CRIAÇÂO:   "+tarefa.getCriacao());
                System.out.println("PRAZO:     "+tarefa.getPrazo());
                System.out.println("==============================");
                indexTarefa++;
            }
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean concluirTarefa(Scanner scanner){
        List<Tarefa> tarefas = ListaTarefas.getTarefas();
        System.out.println("Qual o númeo da tarefa que deseja concluir? ");
        try {
            Tarefa tarefa = tarefas.get(scanner.nextInt());
            tarefa.concluirStatus();
            System.out.println("tarefa: "+tarefa.getTitulo()+" concluida!!!");
            return true;
        }catch (IndexOutOfBoundsException | InputMismatchException e){
            System.out.println("saída inesperada");
            return false;
        }

    }
    public static boolean imprimirTarefasStatus(Scanner scanner){
        if(!ListaTarefas.getTarefas().isEmpty()) {
            System.out.println("Pelo que você quer filtrar o Status?");
            System.out.println("1 - NOVO");
            System.out.println("2 - Concluído");

            try {
                int escolha = scanner.nextInt();
                Status statusPesquisa;
                switch (escolha){
                    case 1:
                        statusPesquisa = Status.NOVO;
                        break;
                    case 2:
                        statusPesquisa = Status.CONCLUIDO;
                        break;
                    default:
                        System.out.println("número inválido");
                        return false;
                }
                List<Tarefa> tarefas = ListaTarefas.getTarefas();
                int indexTarefa = 0;
                for (Tarefa tarefa : tarefas) {
                    if (tarefa.getStatus() == statusPesquisa) {
                        System.out.println("==============================");
                        System.out.println("Número:    " + "[" + indexTarefa + "]");
                        System.out.println("TAREFA:    " + tarefa.getTitulo());
                        System.out.println("DESCRIÇÃO:  " + tarefa.getDescricao());
                        System.out.println("STATUS:    " + tarefa.getStatus());
                        System.out.println("PRIORIDADE:" + tarefa.getPrioridade());
                        System.out.println("CRIAÇÂO:   " + tarefa.getCriacao());
                        System.out.println("PRAZO:     " + tarefa.getPrazo());
                        System.out.println("==============================");
                        indexTarefa++;
                    }
                }
                return true;
            }catch (IndexOutOfBoundsException | InputMismatchException e){
                System.out.println("saída inesperada");
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static boolean imprimirTarefasPrioridade(Scanner scanner){
        if(!ListaTarefas.getTarefas().isEmpty()) {
            System.out.println("Qual prioridade deseja filtrar?");
            System.out.println("1 - ALTA");
            System.out.println("2 - MÉDIA");
            System.out.println("3 - BAIXA");
            try {
                int escolha = scanner.nextInt();
                Prioridade prioridadePesquisa;
                switch (escolha){
                    case 1:
                        prioridadePesquisa = Prioridade.ALTA;
                        break;
                    case 2:
                        prioridadePesquisa = Prioridade.MEDIA;
                        break;
                    case 3:
                        prioridadePesquisa = Prioridade.BAIXA;
                        break;
                    default:
                        System.out.println("número inválido");
                        return false;
                }
                List<Tarefa> tarefas = ListaTarefas.getTarefas();
                int indexTarefa = 0;
                for (Tarefa tarefa : tarefas) {
                    if (tarefa.getPrioridade() == prioridadePesquisa) {
                        System.out.println("==============================");
                        System.out.println("Número:    " + "[" + indexTarefa + "]");
                        System.out.println("TAREFA:    " + tarefa.getTitulo());
                        System.out.println("DESCRIÇÃO:  " + tarefa.getDescricao());
                        System.out.println("STATUS:    " + tarefa.getStatus());
                        System.out.println("PRIORIDADE:" + tarefa.getPrioridade());
                        System.out.println("CRIAÇÂO:   " + tarefa.getCriacao());
                        System.out.println("PRAZO:     " + tarefa.getPrazo());
                        System.out.println("==============================");
                        indexTarefa++;
                    }
                }
                return true;
            }catch (IndexOutOfBoundsException | InputMismatchException e){
                System.out.println("saída inesperada");
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static boolean excluirTarefa(Scanner scanner){
        List<Tarefa> tarefas = ListaTarefas.getTarefas();
        System.out.println("Qual o númeo da tarefa que deseja excluir? ");
        try {
            Tarefa tarefa = tarefas.get(scanner.nextInt());
            tarefas.remove(tarefa);
            System.out.println("tarefa: "+tarefa.getTitulo()+" excluída!!!");
            return true;
        }catch (IndexOutOfBoundsException | InputMismatchException e){
            System.out.println("saída inesperada");
            return false;
        }

    }
}
