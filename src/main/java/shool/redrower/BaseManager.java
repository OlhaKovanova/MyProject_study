package shool.redrower;

public abstract class BaseManager extends Employee{
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public BaseManager(String name, int age, String gender, int baseSalary, int numberOfSubordinates) {
        super(name, age, gender, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public abstract int getSalaryCoefficient();


    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return 0;
        }
         return getBaseSalary() * getSalaryCoefficient() * getNumberOfSubordinates()/100;
            }
}
