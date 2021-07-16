
import java.util.Scanner;

public class prise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        if (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            System.out.println(name + " " + "зарабатывает $5000, молодец! Так держать!");
        } else {
            System.out.println("Вы ошиблись! Введите имя!");
        }
    }
}
