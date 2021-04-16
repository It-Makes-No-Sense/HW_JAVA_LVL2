package HomeWork3.num2;

public class MainClass {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("Петров","2221312321"); //Заполнение
        telephoneBook.add("Кузнецов","3444212312");
        telephoneBook.add("Василенко","123123123");
        telephoneBook.add("Пупкин","12312321");
        telephoneBook.add("Петров","1111111112");

        System.out.println("\nПетров: " + telephoneBook.get("Петров")); // Проверка на одну фамилию
        System.out.println("Василенко: " + telephoneBook.get("Василенко")); // Вывод номера

        System.out.println();
        System.out.println(telephoneBook.get("ФамилияКоторойТутНет")); //Нету записи

        System.out.println();
        telephoneBook.add("Петров", "1111111112"); //попытка записать номер который уже есть у такой фамилии
    }
}
