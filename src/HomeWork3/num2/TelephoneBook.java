package HomeWork3.num2;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TelephoneBook {
    private HashMap<String, List<String>> book;

    public TelephoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String name,String phone) {
        if (book.containsKey(name)) {
            List<String> numbers = book.get(name);
            if (!numbers.contains(phone)) {
                numbers.add(phone);
                System.out.println(String.format("Номер %s добавлен для фамилии %s",phone,name));

            } else {
                System.out.println(String.format("Номер %s уже существует для фамилии %s",phone,name));
            }
        } else {
            book.put(name, new ArrayList<>(Arrays.asList(phone)));
            System.out.println(String.format("Номер %s добавлен для фамилии %s",phone,name));
        }
    }

    public List<String> get (String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        } else {
            System.out.println(String.format("В справочнике нет записи для фамилии %s",name));
            return new ArrayList<>();
        }
    }
}
