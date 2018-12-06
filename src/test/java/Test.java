
import exception.PolicyPasswordException;
import model.User;

public class Test {
    public static void main(String[] args) throws PolicyPasswordException {
        char[] password = {'1', '2', 't', 'S', '5', '6', '7', 'a'};
        User Dima = new User(1, "Dima", "Ivanov", password);

        System.out.println(Dima.getId() + " " + Dima.getName() + " " + Dima.getSurname() + " " + Dima.getDepartment());
    }
}
