package lesson5_1;

public class Staff {

    String initial;
    String position;
    String email;
    String phone;
    int salary;
    int age;


    public Staff(String initial, String position, String email, String phone, int salary, int age) {
        this.initial = initial;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInformation() {
        System.out.println("Ф.И.О.: " + initial + ",  должность: " + position +
                ", эл.почта: " + email + ", телефон: " + phone + ", зарплата: " + salary + ", возраст: " + age);
    }
}
