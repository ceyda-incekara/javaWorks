package AccountOperations;

import Addresses.Address;
import Addresses.HomeAddress;
import UserOperations.User;
import Exception.InvalidAuthenticationException;

import java.util.TreeSet;

public class AccountManager {
    TreeSet<Account> users = new TreeSet<>();
    public void addUsers() throws ClassCastException {
        Address address = new HomeAddress("Çanakkale", "Merkez", "İsmetpasa mah.", "İzmir Caddesi Galaksi Kent Konutları ");
        User user1 = new User("Enes", "Enes", "oenes@gmail.com", "3113", "kriptograf", 22, address, "Individual");
        Account account = new Individual(user1);

        Address address2 = new HomeAddress("Kütahya", "Simav", "Fatih mah.", "Fatih mah. Barbaros cad. ");
        User user2 = new User("Ceyda", "İncekara", "ceyda@gmail.com", "6969", "mühendis", 22, address2, "Enterprise");
        Account account2 = new Enterprise(user2);
        users.add(account);
        users.add(account2);
    }
    public Account login(String email, String password) {
        addUsers();
        try {
            for (Account acc : users) {
                if (acc.getUser().getEmail().equals(email) && acc.getUser().getPassword().equals(password)) {
                    acc.login(email, password, acc);
                    return acc;
                }
            }
            throw new InvalidAuthenticationException("Şifre veya email yanlış girildi!");

        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
