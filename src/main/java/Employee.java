public class Employee {
      String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

        public Employee(String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInformation() {
            if (age > 40) {
                System.out.println("Меня зовут " + fullName + ", я " + position + ", мне " + age + " лет;");
                System.out.println("моя почта " + email + ", мой телефон " + phone + ";");
                System.out.println("моя зарплата " + salary);
            }
    }
}

