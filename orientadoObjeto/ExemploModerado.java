package nelioAlves.orientadoObjeto;

public class ExemploModerado {
    private static int contador;

    static {
        // Bloco estático
        contador = 3;
        System.out.println("Bloco Estático: Inicializando Contador");
    }

    // Construtor


    public ExemploModerado() {
        contador++;
        System.out.println("Construtor: Incrementando Contador - " + contador);
    }
}



