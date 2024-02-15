import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();


        users.add(new User("Коля", "kola@example.com"));
        users.add(new User("Діма", "dima@example.com"));
        users.add(new User("Катя", "kata@example.com"));
        users.add(new User("Олена","olena@example.com"));
        users.add(new User("Андрій","andriy@example.com"));


        printUserList(users);


        int index = 2;
        if (index >= 0 && index < users.size()) {
            User user = users.get(index);
            System.out.println("Користувач за індексом " + index + ": " + user.getName() + " (" + user.getEmail() + ")");
        } else {
            System.out.println("Немає користувача з індексом " + index);
        }
    }

    public static void printUserList(List<User> users) {
        System.out.println("Список користувачів:");
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println((i+1) + ". " + user.getName() + " (" + user.getEmail() + ")");
        }
    }
}

