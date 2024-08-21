package nelioAlves.heranca.entities;

public class PessoaJuridica extends Contribuinte {
    private Integer numeroFuncionario;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionario) {
        super(name, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    public Integer getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(Integer numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public double valorImposto() {
        double rendaAnual = getRendaAnual();
        double imposto;

        if (numeroFuncionario > 10) {
            imposto = rendaAnual * 0.14;

        } else {
            imposto = rendaAnual * 0.16;
        }

        return imposto;

    }
}
