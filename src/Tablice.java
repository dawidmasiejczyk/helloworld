public class Tablice {
    public static void main(String[] args) {
        int[] tablica = new int[3];
        tablica[0] = 1999;
        tablica[1] = 2000;
        tablica[2] = 3000;

        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);

        String[] tablicaStringow = new String[10];
        for( int i = 0; i < tablicaStringow.length; i++) {
            System.out.println(tablicaStringow[i]);
        }

        for( int i = 0; i < tablicaStringow.length; i++) {
            tablicaStringow[i] = "Tekst " + i;
        }


        for( int i = 0; i < tablicaStringow.length; i++) {
            System.out.println(tablicaStringow[i]);
        }

        System.out.println("1"+2);
        System.out.println("1"+2+3);
        System.out.println(1+2+"3");
    }
}
