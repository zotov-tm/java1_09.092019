package lesson5_1;

public class Main {
    public static void main(String[] args) {

      /*  Staff staff = new Staff("Иванов Иван Иванович", "слесарь 4-го разряда", "Ivanov@yandex.ru",
                "89163256982", 20000, 20);

        staff.employeeInformation();

        Staff staff2 = new Staff("Сидоров Сидор Сидорович", "слесарь 1-го разряда",
                "Sidorov@yandex.ru", "89163256981", 25000, 30);
        staff2.employeeInformation(); */




        Staff[] persStaff = new Staff[5];
        persStaff[0] = new Staff("Иванов Иван Иванович", "начальник слесарного отдела",
                "Ivanov@yandex.ru", "8916010101", 80000, 60);
        persStaff[1] = new Staff("Сидоров Сидор Сидорович", "слесарь 1-го разряда",
                "Sidorov@yandex.ru", "89163256981", 25000, 30);
        persStaff[2] = new Staff("Семенов  Семен Семеныч", "слесарь 3-го разряда",
                "Semenov@yandex.ru", "89163256980", 21000, 20);
        persStaff[3] = new Staff("Алексеев Алексей Алексеевич", "слесарь 2 разряда",
                "Alexeev@yandex.ru", "89163256984", 23000, 31);
        persStaff[4] = new Staff("Иванова Наталья Ивановна", "зам. начальника слесарного отдела",
                "Ivanova@yandex.ru", "8916010102", 75000, 42);

        for (int i = 0; i < persStaff.length; i++) {
            if (persStaff[i].age > 40) {

                persStaff[i].employeeInformation();
            }


        }
    }
}
