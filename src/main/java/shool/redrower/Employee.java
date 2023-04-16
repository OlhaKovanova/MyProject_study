package shool.redrower;

public abstract class Employee {
    private String name;
    private int age;
    private String gender;
    private int baseSalary;

    public Employee(String name, int age, String gender, int baseSalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getBaseSalary() {

        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {

        this.baseSalary = baseSalary;
    }

    public abstract int getSalary();


}
