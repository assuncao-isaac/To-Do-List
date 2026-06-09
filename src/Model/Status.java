package Model;

public enum Status {
    NOVO("Novo"),PENDENTE("Pendente"),CONCLUIDO("Concluído");
    final String status;
    Status(String status) {
        this.status = status;
    }
}
