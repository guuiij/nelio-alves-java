package nelioAlves.heranca.entities;

public class PessoaFisica extends Contribuinte {

    private Double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
        super(name, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double valorImposto() {
        double rendaAnual = getRendaAnual();
        double imposto;

        if (getRendaAnual() < 20000.00) {
            imposto = rendaAnual * 0.15;
        } else {
            imposto = rendaAnual * 0.25;
        }

        if (gastoSaude > 0) {
            imposto -= gastoSaude * 0.50;
        }

        return imposto;

    }
}