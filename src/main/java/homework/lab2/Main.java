package homework.lab2;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client(12, 14, "Vasya", 100);
        //todo this is ugly!!!! find solution for creating a client
        // with more readable way
        ProxyBuild clientManager = new ProxyBuild();
        clientManager.setName("Bob");
        clientManager.setDebt(9999);
        clientManager.setBonus(0);
        clientManager.setSalary(99999999);
        Client new_client = clientManager.fillTheContent();
        System.out.println(new_client);
    }
}
