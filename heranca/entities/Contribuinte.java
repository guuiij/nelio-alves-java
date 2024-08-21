package nelioAlves.heranca.entities;

import java.util.List;

public abstract class Contribuinte {

    private String name;
    private Double rendaAnual;



    public Contribuinte() {
        super();
    }

    public Contribuinte(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }


    public abstract double valorImposto();

    @Override
    public String toString() {
        return "Contribuinte{" +
                "name='" + name + '\'' +
                ", rendaAnual=" + rendaAnual +
                '}';
    }
}
