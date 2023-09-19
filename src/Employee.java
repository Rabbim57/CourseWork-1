public class Employee {

    private String fullName;

    private int departmenr;

    private int salary;

    private int id;

    private static int counter = 0;

    public Employee(String fullName, int departmenr, int salary) {
        chekDepartment(departmenr);
        this.fullName = fullName;
        this.departmenr = departmenr;
        this.salary = salary;

        id = ++counter;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartmenr() {
        return departmenr;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartmenr(int departmenr) {
        this.departmenr = departmenr;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    private void chekDepartment(int departmenr) {
        if (departmenr <1 || departmenr >5) {
            throw new IllegalArgumentException("Wrong department number! Should be form 1 to 5. Try again");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName=" + fullName +
                ", departmenr=" + departmenr +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
