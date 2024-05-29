package nelioAlves.orientadoObjeto.entites;

public class Employee {

    public String name;
    public double grossSalary; // Salário Bruto
    public double tax; // imposto

    public double netSalary() { // Salário liquido
        return grossSalary - tax;
    }

    public void increseSalary(double percentage) {

        this.grossSalary +=  this.grossSalary * percentage /100;
    }

    public String toString() {
        return this.name +
                ", " + "$ " + String.format("%.2f%n" ,netSalary());
    }


}
