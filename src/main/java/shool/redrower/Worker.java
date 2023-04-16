package shool.redrower;

public class Worker extends Employee{

    public Worker(String name, int age, String gender, int baseSalary) {

        super(name, age, gender, baseSalary);
    }

    public final int getSalary() {

        return getBaseSalary();
    }

}
