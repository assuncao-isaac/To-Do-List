package Model;

public enum Prioridade {
    ALTA("Alta"),MEDIA("Média"),BAIXA("Baixa");
    final String prioridade;
    Prioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}
