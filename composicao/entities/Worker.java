package nelioAlves.composicao.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import nelioAlves.composicao.entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return this.level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return this.contracts;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = this.baseSalary;
        Calendar cal = Calendar.getInstance();
        Iterator var6 = this.contracts.iterator();

        while(var6.hasNext()) {
            HourContract c = (HourContract)var6.next();
            cal.setTime(c.getDate());
            int c_year = cal.get(1);
            int c_month = cal.get(2);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }

        return sum;
    }
}
