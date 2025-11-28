public class Titles {

    public static void writeTitle(String c) {

        for (int i = 0; i < c.length() + 8; i++) System.out.print("*");
        System.out.println();
        System.out.println("*** " + c + " ***");
        for (int i = 0; i < c.length() + 8; i++) System.out.print("*");
        System.out.println();

    }
}