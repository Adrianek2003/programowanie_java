public class zad3 {
    public static void main(String[] args) {
        accounts vAccount = new accounts("Jan Bogdan", 100, "666999"); // Create new account obj with some params
        try {
            vAccount.transferMoney(99); // Method that simulate transfer money
        } catch (notenoughmoney e) {
            System.out.println("Not enough money! \n" + e.getMessage()); // Our Exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Our others Exception
        } finally {
            System.out.println("Your founds: " + vAccount.getBalance() + "$");
        }
    }
}
