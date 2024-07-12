package nelioAlves.heranca.entities;

public final class OutsourcedEmployee extends Employee {

    private Double additionalCharger;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharger) {
        super(name, hours, valuePerHour);
        this.additionalCharger = additionalCharger;
    }

    public Double getAdditionalCharger() {
        return additionalCharger;
    }

    public void setAdditionalCharger(Double additionalCharger) {
        this.additionalCharger = additionalCharger;
    }
    public final double payment(){
        return super.payment() + (additionalCharger * 1.1);

    }



}
