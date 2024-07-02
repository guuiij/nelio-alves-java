package nelioAlves.composicao.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerhour;
    private Integer hour;

    public HourContract() {
    }

    public HourContract(Date date, double valuePerhour, Integer hour) {
        this.date = date;
        this.valuePerhour = valuePerhour;
        this.hour = hour;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerhour() {
        return this.valuePerhour;
    }

    public void setValuePerhour(Double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    public Integer getHour() {
        return this.hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public double totalValue() {
        return this.valuePerhour * (double)this.hour;
    }
}
