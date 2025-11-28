public class Titles {

    public static void writeTitle(String c) {

        for (int i = 0; i < c.length() + 8; i++) System.out.print("*");
        System.out.println();
        System.out.println("*** " + c + " ***");
        for (int i = 0; i < c.length() + 8; i++) System.out.print("*");
        System.out.println();

    }

    static void writeHeader(){
        writeHeader(80);
    }

    static void writeHeader(int cant){
        for (int i = 0; i < cant; i++) System.out.print("<");
        System.out.println();
    }
}