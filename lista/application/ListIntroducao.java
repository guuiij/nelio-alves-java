package nelioAlves.lista.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListIntroducao {
    public static void main(String[] args) {

        // DECLARANDO UMA LISTA DE STRINGS
        // List não aceita tipos primitivos diretamente
        // AQUI ESTÁ APENAS DECLARANDO   ---->List<Integer> list;
        List<String> list = new ArrayList<>(); // Aqui estamos instanciando uma implementação da interface List

        // Lista instancia CLASSE que implementa interface --> Interface   List<>
        // ArrayList é classe que implementa interface List

        // ADICIONANDO ELEMENTOS
        System.out.println("ADICIONANDO ELEMENTOS");
        list.add("Nami ");
        list.add("Brook");
        list.add("FLuffy D");
        list.add("FRank");
        list.add("Robbie");

        list.add(2, "FR NOBODY"); // Adicionando "FR NOBODY" na posição 2 da lista, deslocando os elementos subsequentes
        list.add(1, "NomoTchan"); // Adicionando "FR NOBODY" na posição 2 da lista, deslocando os elementos subsequentes

        /*
         * Com List em Java, é possível adicionar um elemento em uma posição específica sem substituir o elemento existente.
         * Isso ocorre porque a estrutura da lista permite que cada elemento aponte para o próximo, então ao adicionar um novo elemento,
         * o elemento existente naquela posição é movido para a próxima posição.
         * Por exemplo, se X[1] = "Love", e então X[1] = "HOPE", "Love" ainda estará na posição X[2], pois foi movido para o próximo nó.
         */


        System.out.println("\n" + list.size() + " --  TAMANHO DA LISTA ");  // Retorna o tamanho da lista

        //list.remove("Robbie"); // Funciona tanto com o conteúdo quanto com a posição
        // list.remove(1);

        for (String lista : list) {
            System.out.println(lista);
        }

         /* REMOVENDO POR UM PREDICADO
         REMOVER TODO MUNDO QUE COMECE COM A LETRA M "BOOLEANO"
         list.removeif() */
        System.out.println("------------------");
        System.out.println("REMOVENDO POR UM PREDICADO");
        list.removeIf(x -> x.charAt(0) == 'N');  // remover todo String x, tal que x.charAt(0); seja igual a M
        for (String x : list) {                  // PEGA UM VALOR X tipo String e retorna se o X.chart(0) for igual a M
            System.out.println(x);              // Predicado porque é uam funação que devolve verdadeiro ou falso
        }
        System.out.println();

        // ** ENCONTRAR A POSIÇÃO DE UM ELEMENTO
        System.out.println("------------------ ");
        System.out.println("POSIÇÂO DO ELEMENTO");
        System.out.println("Index of Fluffy D: " + list.indexOf("FLuffy D"));
        System.out.println();

        // ** SE PROCURAR ALGUEM QUE NÂO EXISTE
        System.out.println("------------------ "); // QUANDO NAO ENCONTRA RETORNA -1
        System.out.println("CASO PROCURE ALGUEM QUE NAO EXISTE");
        System.out.println("Index of Marconi: " + list.indexOf("Marconi"));
        System.out.println();

        // DEIXAR APENAS quem tem o Nome COMEÇADO COM N
        System.out.println("------------------ ");  // Declara uma nova lista String
        System.out.println(" APENAS COM A LETRA ESCOLHIDA 'N' ");
        /*   Pega a lista list ( original)
        Filtrar apenas os elementos que comece com F
         devolver uma nova lista  chamada "result"  com esses elementos

        1º Converte para ||    list.stream().
        2º RECEBE UM PREDICATO  || filter(arg0) ------>  filter(x -> x.charAt(0) == 'F').
        3º stream() não é compativel com list. então
         converte e Volta ele para a lista ||   collect(Collectors.toList())
        */

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);

        }
        System.out.println();

        // Primeiro ELEMENTO que comece com a LETRA F
        System.out.println("------------------ ");
         /* Declara variavel e coloca um comando para encontar quem começa com a letra F
         findFirst()      chama o primeiro elemento da stream que atende o predicato
        .orElse(null);   Se não existie retorna NULL */

        System.out.println("RETORNA PRIMEIRO ELEMENTO QUE COMEÇA COM A LETRA 'F'  ou 'NULL'  ");
        String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
        System.out.println(name);
        System.out.println();


    }
}
