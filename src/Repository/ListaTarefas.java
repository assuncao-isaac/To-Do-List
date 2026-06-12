package Repository;

import Model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private static final List<Tarefa> tarefas = new ArrayList<>();

    public static List<Tarefa> getTarefas() {
        return tarefas;
    }

    public static void addTarefa(Tarefa tarefa) {
        ListaTarefas.tarefas.add(tarefa);
    }


}
