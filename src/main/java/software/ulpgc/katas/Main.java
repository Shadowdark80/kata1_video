package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("Jorge", LocalDate.of(2006, 9, 1));
        System.out.println(person);
    }
}
