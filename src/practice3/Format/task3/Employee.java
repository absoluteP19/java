package practice3.Format.task3;

public class Employee {
    private final String fullname;
    private Integer salary;

    public Employee(String fullname, Integer salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}