package entities;

public class DataProcessor {

    public String name;
    public double salary;
    public double tax;

    public double NetSalary(){
        return salary - tax;
    }

    public void IncreaseSalary(double percentage){
        this.salary = (percentage / 100) * this.salary + this.salary;
    }
}
