import java.io.*; // Again we need package for system input and output through data streams
import java.net.URL; // Package thats allow dealing with URL addresses
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        String vFirstThreeDigit;
        try (Scanner vScanner = new Scanner(System.in)) {
            while (true) { // Simple loop for check input format
                System.out.print("Input only first three digit of account number: ");
                vFirstThreeDigit = vScanner.nextLine().trim();
                if (vFirstThreeDigit.matches("\\d{3}")) { // Regex for input
                    break;
                } else {
                    System.out.println("Input error, try again.");
                }
            }
        }
        String vInputFileUrl = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt"; // Link with source file
        try {
            URL vUrl = new URL(vInputFileUrl);
            try (BufferedReader vReader = new BufferedReader(new InputStreamReader(vUrl.openStream()))) { // Here we try open our file under given link
                String vLine;
                boolean vFoundFlag = false;
                while ((vLine = vReader.readLine()) != null) { // Iterate through lines in file
                    String[] vSplitted = vLine.split("\t", -1);
                    if (vSplitted.length > 4 && vSplitted[4].startsWith(vFirstThreeDigit)) { // Is account number starts from our input three digit
                        System.out.println("Shorter Bank Number: " + vSplitted[0]);
                        System.out.println("Bank Name: " + vSplitted[1]);
                        System.out.println("Account Number: " + vSplitted[4]);
                        System.out.println("\n");
                        vFoundFlag = true;
                    }
                }
                if (!vFoundFlag) {
                    System.out.println("Can't find number starting with " + vFirstThreeDigit + ".");
                }
            }
        // BTW it's very good pratcise to use Exceptions when we dealing with files
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
