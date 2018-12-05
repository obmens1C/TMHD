
import model.Department;
import model.User;

public class Test {
    public static void main(String[] args) {
        User Dima = new User(1, "Dima");

        System.out.println(Dima.getId() + Dima.getName() + Dima.getDepartment());
    }
}
