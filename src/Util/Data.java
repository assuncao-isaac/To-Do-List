package Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static String dataAtual() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formato);
    }
}
