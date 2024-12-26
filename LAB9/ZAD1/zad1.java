public class zad1 {
    public static void main(String[] args) {
        MakeNullPointerException vException = new MakeNullPointerException();
        try {
            vException.MakeNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("We have NullPointerException");
            e.printStackTrace(); // Show StackTrace
            System.out.println(e.toString());
        }
    }
}
