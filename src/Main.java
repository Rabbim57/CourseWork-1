import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Григорьев Архип Иосифович", 1, 80000);
        employees[1] = new Employee("Муравьёв Виталий Кириллович", 2, 100000);
        employees[2] = new Employee("Нестеров Максим Филатович", 3, 90000);
        employees[3] = new Employee("Орехов Климент Егорович", 4, 75000);
        employees[4] = new Employee("Овчинников Азарий Демьянович", 5, 95000);
        employees[5] = new Employee("Виноградов Егор Филиппович", 1, 85000);
        employees[6] = new Employee("Комиссаров Платон Адольфович", 2, 65000);
        employees[7] = new Employee("Королёв Парамон Юрьевич", 3, 60000);
        employees[8] = new Employee("Буров Владимир Иванович", 4, 110000);
        employees[9] = new Employee("Тихонов Исак Антонович", 5, 120000);
        printEployees(employees);
        int salarySum = calculateSalarySum(employees);
        System.out.println("Сумма зарпалт = " + salarySum);
        Employee employeeWithMinSalary = findEmployeeWithMinSalary(employees);
        System.out.println("Сотрдник с минимальной зарплатой: "+ employeeWithMinSalary);
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary(employees);
        System.out.println("Сотрдник с максимальной зарплатой: "+ employeeWithMaxSalary);
        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Средняя зарплата = " + averageSalary);
        printFullName(employees);
    }
    private static void printEployees(Employee[] employees) {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static int calculateSalarySum(Employee[] employees) {
        int totalSalarySum = 0;
        for (Employee employee : employees) {
            totalSalarySum += employee.getSalary();
        }
        return totalSalarySum;
    }
    private static Employee findEmployeeWithMinSalary(Employee[] employees){
        int index = 0;
        for (int i = 0; i < employees.length; i++){
            if ((employees[i].getSalary() <employees [index].getSalary())){
                index = i;
            }
        }
        return employees[index];
    }
    private static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i].getSalary() > employees[index].getSalary())) {
                index = i;
            }
        }
        return employees[index];
    }

    private static double calculateAverageSalary(Employee[] employees){
        return (double) calculateSalarySum(employees) / employees.length;

        //int salarySum = calculateSalarySum(employees);
        //double averageSum = (double) salarySum / employees.length;
        //return averageSum;
    }

    private static void  printFullName (Employee [] employees){
        System.out.println("Ф. И. О всех сотрудников: ");
        for (Employee employee: employees){
            System.out.println(employee.getFullName());
        }
    }
}

