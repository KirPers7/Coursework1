public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.preAddEmployee();

        System.out.println("Список всех сотрудников:");
        employeeBook.getEmployeesInfo();
        System.out.println();

        System.out.println("Сумма затрат на ЗП в месяц (руб.): " + employeeBook.getEmployeesSalarySum());
        System.out.println();

        employeeBook.getMinEmployeeSalary();
        System.out.println();

        employeeBook.getMaxEmployeeSalary();
        System.out.println();

        System.out.println("Среднее значение зарплат (руб.): " + employeeBook.getAverageSalary());
        System.out.println();

        System.out.println("ФИО всех сотрудников:");
        employeeBook.getEmployeesFIO();
        System.out.println();

        employeeBook.indexEmployeeSalary(10);
        System.out.println("Список всех сотрудников после индексации ЗП:");
        employeeBook.getEmployeesInfo();
        System.out.println();

        employeeBook.getEmployeeWithMinSalaryByDepartment("4");
        System.out.println();

        employeeBook.getEmployeeWithMaxSalaryByDepartment("4");
        System.out.println();

        System.out.println("Сумму затрат на зп по отделу (руб.): " + employeeBook.getEmployeesSalarySumByDepartment("4"));
        System.out.println();

        System.out.println("Среднее значение зарплат по отделу (руб.): " + employeeBook.getAverageSalaryByDepartment("4"));
        System.out.println();

        employeeBook.indexEmployeeSalaryByDepartment(5, "4");
        System.out.println();

        employeeBook.getEmployeesInfoByDepartment("4");
        System.out.println();

        employeeBook.getSalariesGreaterInputNumber(100_000);
        System.out.println();

        employeeBook.getSalariesLessInputNumber(165_462);
        System.out.println();

        System.out.println("Добавление нового сотрудника");
        employeeBook.addNewEmployee("Svenson", "Christer", null, "5", 205_340);
        System.out.println();

        System.out.println("Список всех сотрудников после добавления нового сотрудника:");
        employeeBook.getEmployeesInfo();
        System.out.println();

        System.out.println("Удаление сотрудника по id записи");
        employeeBook.deleteEmployeeById(8);
        System.out.println();

        System.out.println("Список всех сотрудников после удаления сотрудника по id записи:");
        employeeBook.getEmployeesInfo();
        System.out.println();

        System.out.println("Получение сотрудника по id записи");
        employeeBook.getEmployeeById(4);
    }
}