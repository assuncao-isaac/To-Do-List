package Model;



import static Util.Data.dataAtual;

public class Tarefa {
    private final String titulo;
    private final String descricao;
    private final Prioridade prioridade;
    private Status status;
    private final String criacao;
    private final String prazo;

    public Tarefa(String titulo, String descricao, Prioridade prioridade, String prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = Status.NOVO;
        criacao = dataAtual();
        this.prazo = prazo;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public String getCriacao() {
        return criacao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void concluirStatus() {
        status = Status.CONCLUIDO;
    }
}
