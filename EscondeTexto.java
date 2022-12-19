public class EscondeTexto {

    public static void main(String[] args) {
        String texto = "abacaxi";
        System.out.println("texto original: " + texto);
        System.out.println("texto escondido: " + hideChars(texto));
    }

    public static String hideChars(String texto) {
        String textoEscondido = "";
        for (int i = 0; i < texto.length(); i++) {
            textoEscondido += "* ";
        }
        return textoEscondido;
    }

}
