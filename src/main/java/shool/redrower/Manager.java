package shool.redrower;

public final class Manager extends BaseManager {
    public static final int COFICIENT_M= 3;

    public Manager(String name, int age, String gender, int baseSalary, int numberOfSubordinates) {
        super(name, age, gender, baseSalary, numberOfSubordinates);
    }
    @Override
    public int getSalaryCoefficient() {
        return COFICIENT_M;
    }

}





