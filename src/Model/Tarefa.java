package Model;

import Util.Data;

import static Util.Data.dataAtual;

public class Tarefa {
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private Status status;
    private String criacao;
    private String prazo;

    public Tarefa(String titulo, String descricao, Prioridade prioridade, String prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = Status.NOVO;
        criacao = dataAtual();
        this.prazo = prazo;
    }
}
