import java.io.*; // Course we need package for system input and output through data streams

public class zad3 {
    public static void main(String[] args) {
        String vInputFile = "input.txt";
        String vOutputFile = "output.txt";
        try (BufferedReader vReader = new BufferedReader(new FileReader(vInputFile));
             BufferedWriter vWriter = new BufferedWriter(new FileWriter(vOutputFile))) {
            String vLine;
            while ((vLine = vReader.readLine()) != null) {
                String vModifiedLine = vLine.replace(" ", "-");
                vWriter.write(vModifiedLine);
                vWriter.newLine();
            }
            System.out.println("Success.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
