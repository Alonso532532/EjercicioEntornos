public class Figures {

    public static char Asterisk = '*';

    public static void writeSquare(int a) {
        writeSquare(a, '*');
    }
    public static void writeSquare(int a, char car) {

        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                System.out.print(car);
            }

            System.out.println();
        }
    }
    public static void writeInvertedPyramid() {
        System.out.println("Aqui se muestra un triangulo invertido");
    }
}