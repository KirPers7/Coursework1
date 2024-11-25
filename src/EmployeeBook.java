public class EmployeeBook {

    private final Employee[] employee = new Employee[10];

    public void preAddEmployee() {
        employee[0] = new Employee("Иванов", "Иван", "Иванович", "2", 72_450);
        employee[1] = new Employee("Петров", "Пётр", "Петрович", "1", 68_100);
        employee[2] = new Employee("Сидоров", "Сидор", "Сидорович", "5", 101_089);
        employee[3] = new Employee("Дмитриев", "Дмитрий", "Дмитриевич", "4", 85_600);
        employee[4] = new Employee("Архипова", "Агрипина", "Астафьевна", "3", 150_420);
        employee[5] = new Employee("Булатов", "Булат", "Булатович", "4", 75_230);
        employee[6] = new Employee("Евгеньева", "Евгенья", "Евгеньевна", "4", 181_480);
    }

    //Получить список всех сотрудников со всеми имеющимися по ним данными
    public void getEmployeesInfo() {
        for (Employee value : employee) {
            if (value != null) {
                System.out.println(value);
            }
        }
    }

    //Посчитать сумму затрат на ЗП в месяц
    public double getEmployeesSalarySum() {
        double employeesSalary = 0;
        for (Employee value : employee) {
            if (value != null) {
                employeesSalary += value.getSalary();
            }
        }
        return employeesSalary;
    }

    //Найти сотрудника с минимальной ЗП
    public void getMinEmployeeSalary() {
        double minSalary = 1000_000;
        String surname = null;
        String name = null;
        String patronymic = null;
        for (Employee value : employee) {
            if (value != null && value.getSalary() < minSalary) {
                minSalary = value.getSalary();
                surname = value.getSurname();
                name = value.getName();
                patronymic = value.getPatronymic();
            }
        }
        System.out.println("Сотрудник с минимальной ЗП - " + surname + " " + name + " " + patronymic + ": " + minSalary);
    }

    //Найти сотрудника с максимальной ЗП
    public void getMaxEmployeeSalary() {
        double maxSalary = -1;
        String surname = null;
        String name = null;
        String patronymic = null;
        for (Employee value : employee) {
            if (value != null && value.getSalary() > maxSalary) {
                maxSalary = value.getSalary();
                surname = value.getSurname();
                name = value.getName();
                patronymic = value.getPatronymic();
            }
        }
        System.out.println("Сотрудник с максимальной ЗП - " + surname + " " + name + " " + patronymic + ": " + maxSalary);
    }

    //Подсчитать среднее значение зарплат
    public double getAverageSalary() {
        int recordsCount = 0;
        for (Employee value : employee) {
            if (value != null) {
                ++recordsCount;
            }
        }
        return getEmployeesSalarySum() / recordsCount;
    }

    //Распечатать ФИО всех сотрудников
    public void getEmployeesFIO() {
        for (Employee value : employee) {
            if (value != null) {
                System.out.println(value.getSurname() + " " + value.getName() + " " + value.getPatronymic());
            }
        }
    }

    //Проиндексировать зарплату
    public void indexEmployeeSalary(double percent) {
        double indexPercent = (100 + percent) / 100;
        for (Employee value : employee) {
            if (value != null) {
                value.setSalary(value.getSalary() * indexPercent);
            }
        }
        System.out.println("ЗП сотрудников проиндексирована на " + percent + "%");
    }

    //По наименованию отдела найти Сотрудника с минимальной зп
    public void getEmployeeWithMinSalaryByDepartment(String department) {
        double minSalary = 1000_000;
        String surname = null;
        String name = null;
        String patronymic = null;
        for (Employee value : employee) {
            if (value != null && value.getDepartment().equals(department) && value.getSalary() < minSalary) {
                minSalary = value.getSalary();
                surname = value.getSurname();
                name = value.getName();
                patronymic = value.getPatronymic();
            }
        }
        System.out.println("Минимальная ЗП в отделе " + department + " - у сотрудника "
                + surname + " " + name + " " + patronymic + " и равна: " + minSalary);
    }

    //По наименованию отдела найти  Сотрудника с максимальной зп
    public void getEmployeeWithMaxSalaryByDepartment(String department) {
        double maxSalary = -1;
        String surname = null;
        String name = null;
        String patronymic = null;
        for (Employee value : employee) {
            if (value != null && value.getDepartment().equals(department) && value.getSalary() > maxSalary) {
                maxSalary = value.getSalary();
                surname = value.getSurname();
                name = value.getName();
                patronymic = value.getPatronymic();
            }
        }
        System.out.println("Максимальная ЗП в отделе " + department + " - у сотрудника "
                + surname + " " + name + " " + patronymic + " и равна: " + maxSalary);
    }

    //По наименованию отдела найти Сумму затрат на зп по отделу
    public double getEmployeesSalarySumByDepartment(String department) {
        double employeesSalary = 0;
        for (Employee value : employee) {
            if (value != null && value.getDepartment().equals(department)) {
                employeesSalary += value.getSalary();
            }
        }
        return employeesSalary;
    }

    //По наименованию отдела найти Среднюю зп по отделу
    public double getAverageSalaryByDepartment(String department) {
        int recordsCount = 0;
        for (Employee value : employee) {
            if (value != null && value.getDepartment().equals(department)) {
                ++recordsCount;
            }
        }
        return getEmployeesSalarySumByDepartment(department) / recordsCount;
    }

    //Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
    public void indexEmployeeSalaryByDepartment(double percent, String department) {
        double indexPercent = (100 + percent) / 100;
        for (Employee value : employee) {
            if (value != null && value.getDepartment().equals(department)) {
                value.setSalary(value.getSalary() * indexPercent);
            }
        }
        System.out.println("ЗП сотрудников отдела " + department + " проиндексирована на " + percent + "%");
    }

    //Напечатать всех сотрудников отдела (все данные, кроме отдела)
    public void getEmployeesInfoByDepartment(String department) {
        for (Employee value : employee) {
            if (value != null && value.getDepartment().equals(department)) {
                System.out.println(value.getId() + ", " + value.getSurname() + " "
                        + value.getName() + " " + value.getPatronymic() + ", "
                        + value.getSalary());
            }
        }
    }

    //Распечатать всех сотрудников с зп меньше введенного числа (распечатать id, фио и зп в консоль)
    public void getSalariesGreaterInputNumber(double inputNumber) {
        for (Employee value : employee) {
            if (value != null && value.getSalary() < inputNumber) {
                System.out.println(value.getId() + ", " + value.getSurname() + " " + value.getName() + " "
                        + value.getPatronymic() + ", " + value.getSalary());
            }
        }
    }

    //Распечатать всех сотрудников с зп больше (или равно) введенного числа (распечатать id, фио и зп в консоль)
    public void getSalariesLessInputNumber(double inputNumber) {
        for (Employee value : employee) {
            if (value != null && value.getSalary() >= inputNumber) {
                System.out.println(value.getId() + ", " + value.getSurname() + " " + value.getName() + " "
                        + value.getPatronymic() + ", " + value.getSalary());
            }
        }
    }

    // Добавить нового сотрудника. (метод должен найти свободную ячейку в массиве и положить нового сотрудника в нее.
    // Поиск свободных ячеек происходит с начала массива. Если свободных мест для сотрудника нет, то
    // метод должен вернуть false, если для сотрудника нашлось место, то метод должен вернуть true)

    public void addNewEmployee(String surname, String name, String patronymic, String department, double salary) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = new Employee(surname, name, patronymic, department, salary);
                break;
            }
        }
    }

    //Удалить сотрудника (находим сотрудника по id, нуллим его ячейку в массиве)
    public void deleteEmployeeById(int employeeId){
        for (int i = 0; i < employee.length; i++){
            if (employee[i] != null && employee[i].getId() == employeeId) {
                employee[i] = null;
                break;
            }
        }
    }

    //Метод для получения сотрудника по id
    public void getEmployeeById(int employeeId){
        for (Employee value : employee) {
            if (value != null && value.getId() == employeeId) {
                System.out.println(value);
                break;
            }
        }
    }
}
