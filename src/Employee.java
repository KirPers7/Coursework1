import java.util.Objects;

public class Employee {

    static int idCounter = 0;
    private final int id;
    private String surname;
    private String name;
    private String patronymic;
    private String department;
    private double salary;

    public Employee(String surname, String name, String patronymic, String department, double salary) {
        this.id = ++idCounter;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id: " + id +
                " ФИО: '" + surname + ' ' + name + ' ' + patronymic + '\'' +
                " Отдел: '" + department + '\'' +
                " Зарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, department, salary);
    }
}
