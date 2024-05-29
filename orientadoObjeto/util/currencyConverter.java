package nelioAlves.orientadoObjeto.util;

public class currencyConverter {

    double cotac = 0;

    public static double cotacao(double price, double dolar) {
        dolar += dolar *0.06;
        return dolar* price ;
    }
}
