package Model;

public enum Status {
    NOVO("Novo"),CONCLUIDO("Concluído");
    final String status;
    Status(String status) {
        this.status = status;
    }
}
