import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EscreverArquivos {
    
    public static void main(String[] args) {
        String caminho = args[0];
        String arquivo = args[1];
        String voltas = args[2];
        String ordem = args[3];

        ArrayList<String> lista = retornaListaAsc(caminho, arquivo, voltas);

        imprimeLista(lista, ordem);
       
    }

    public static ArrayList<String> retornaListaAsc(String caminho, String arquivo, String voltas) {
        ArrayList<String> lista = new ArrayList<String>();
        for (int i = 1; i <= Integer.parseInt(voltas); i++) {
            lista.add("touch " + caminho + "/" + arquivo + i);
            //System.out.println("touch " + caminho + "/" + arquivo + i);
        }
        return lista;
    }

    public static void imprimeLista(List<String> lista, String ordem) {
        if (ordem.equals("desc")) { Collections.reverse(lista); }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}


