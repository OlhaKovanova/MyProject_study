package shool.redrower;

public final class Director extends BaseManager {
    public static final int COFICIENT_D= 9;

    public Director(String name, int age, String gender, int baseSalary, int numberOfSubordinates) {
        super(name, age, gender, baseSalary, numberOfSubordinates);
    }
    public int getSalaryCoefficient() {
        return COFICIENT_D;
    }

}
