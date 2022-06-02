public class Main {
    public static void main(String[] args) {
        // №1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника - " + fullName);
        // №2
        fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        // №3
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'e');
        System.out.println(fullName2);


    }
}