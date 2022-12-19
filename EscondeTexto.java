public class EscondeTexto {

    public static void main(String[] args) {
        String text = "abacaxi";
        System.out.println("texto original: " + text);
        System.out.println("texto escondido: " + hideChars(text));
    }

    public static String hideChars(String text) {
        String hiddenText = "";
        for (int i = 0; i < text.length(); i++) {
            hiddenText += "* ";
        }
        return hiddenText;
    }

}
