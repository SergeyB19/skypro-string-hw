public class Main {
    public static void main(String[] args) {
        // №1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        // №2
        String fullName2 = " Ivanov Ivan Ivanovich";
        String upperFullName2 = fullName2.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName2);
        // №3
        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace('ё', 'e');
        System.out.println("Данные ФИО сотрудника — " + fullName3);


    }
}