public class Test {
    public static void main(String[] args) {

       //Employee employee = new Employee("Пупкин Пётр Петрович", "программист", "Pupkin@mail.ru", 1111111, 100000, 30);
        
        Employee [] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Пупкин Пётр Петрович", "программист", "Pupkin@mail.ru", 1111111, 100000, 30);
        employeesArray[1] = new Employee("Сидоров Сергей Сергеевич", "сварщик", "Sidorov@mail.ru", 2222222, 90000, 45);
        employeesArray[2] = new Employee("Иванов Иван Иванович", "каменщик", "Ivanov@mail.ru", 3333333, 80000, 20);
        employeesArray[3] = new Employee("Козлов Кирил Константинович", "маляр", "Kozlov@mail.ru", 4444444, 70000, 40);
        employeesArray[4] = new Employee("Дубино Дмитрий Дмитриевич", "дворник", "Dyb@mail.ru", 5555555, 50000, 50);


            for (int i = 0; i < employeesArray.length; i++) {
                employeesArray[i].employeeInformation();

                System.out.println();
            }

    }
}
