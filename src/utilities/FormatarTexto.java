package utilities;

public class FormatarTexto {
    public static String capitalizar(String texto) {
        if (texto == null || texto.isEmpty())
            return texto;
        String lower = texto.toLowerCase();
        return Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
    }
}