
package tombkiiratasmetodussal;


public class TombKiiratasMetodussal {
    //egymás mellé helyezés
   private static void kiir(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(String.format("%,3d",tomb[i])+" ");
        }
        System.out.println("");
    }
   //Feltöltés számokkal
    private static void feltolt(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int) (Math.random()*200)-100;
        }
    }
   
    public static void main(String[] args) {
        System.out.println("\nTÖMB KIIRATÁS METODUSSAL\n");
        System.out.println("Klszítette: DANDÓCZI MÁTÉ\n");
        
        int elemszam = 10;
        //Tömb létrehozása
        int tomb1[] = new int [elemszam];
        int tomb2[] = new int [elemszam];
        int tomb3[] = new int [elemszam];
        
        //Feltöltés simán
        
        /*for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random()*200)-100;
        }
        for (int i = 0; i < elemszam; i++) {
            tomb2[i] = (int) (Math.random()*200)-100;
        }
        for (int i = 0; i < elemszam; i++) {
            tomb3[i] = (int) (Math.random()*200)-100;
        }*/
        
        //Feltöltés metodussal
        
        feltolt(tomb1);
        feltolt(tomb2);
        feltolt(tomb3);
        
        //Kiiratás
        System.out.println("Az első tömb elemei: ");
        kiir(tomb1);
        System.out.println("A második tömb elemei: ");
        kiir(tomb2);
        System.out.println("A harmadik tömb elemei: ");
        kiir(tomb3);
        
        
        
    }
    
}