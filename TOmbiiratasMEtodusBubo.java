
package tombiiratasmetodusbubo;

public class TOmbiiratasMEtodusBubo {

    //KIIRATÁS
    public static void kiiratas(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(String.format("%,3d", tomb[i]) + " ");
        }
        System.out.println("");
    }
    //SORBARENDEZÉS BUBOREKOS MODSZERREL
    private static void buborek(int tomb[]) {
        int n = tomb.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tomb[j] > tomb[j + 1]) {
                    int temp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int elemszam = 10;
        int tomb1[] = new int[elemszam];
        int tomb2[] = new int[elemszam];
        int tomb3[] = new int[elemszam];

        System.out.println("\nTÖMB KIÍRATÁS METODUSSAL(BUBORÉKOS)\n");
        System.out.println("Készítette: DANDÓCZI MÁTÉ ATTILA\n");
        //TÖMB FELTÖLTÉS
        for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random() * 200) - 100;
        }
        for (int i = 0; i < elemszam; i++) {
            tomb2[i] = (int) (Math.random() * 200) - 100;
        }
        for (int i = 0; i < elemszam; i++) {
            tomb3[i] = (int) (Math.random() * 200) - 100;
        }
        //KIIRATÁS
        //1.
        System.out.println("\nAz első tömbünk elemei: ");
        System.out.println("Rendezetlenül: ");
        kiiratas(tomb1);
        buborek(tomb1);
        System.out.println("Rendezve: ");
        kiiratas(tomb1);
        //2.
        System.out.println("\nA második tömbünk elemei: ");
        System.out.println("Rendezetlenül: ");
        kiiratas(tomb2);
        buborek(tomb2);
        System.out.println("Rendezve: ");
        kiiratas(tomb2);
        //3.
        System.out.println("\nA harmadik tömbünk elemei: ");
        System.out.println("Rendezetlenül: ");
        kiiratas(tomb3);
        buborek(tomb3);
        System.out.println("Rendezve: ");
        kiiratas(tomb3);

    }

}