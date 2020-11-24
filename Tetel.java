
package tetel;


public class Tetel {

   
    public static void main(String[] args) {
    int elemszam = (int) (Math.random()*10)+10;
       int tomb1 [] = new int [elemszam];
       int tomb2 [] = new int [elemszam];
       int negativ [] = new int [elemszam*2];
       System.out.println("\nTételek Gyakorlása\n");
       
       for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random()*200)-100;           
            tomb2[i] = (int) (Math.random()*200)-100;               
        }
       
       System.out.print("A tömb1 elemei:");
       for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d", tomb1[i])+" ");
        }
       
       System.out.print("\nA tömb2 elemei:");
       for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d", tomb2[i])+" ");
        }
       
       int negativDb=0;
       for (int i = 0; i < elemszam; i++) {
            if (tomb1[i]<0) {
                negativ[negativDb++]=tomb1[i];
            }
            if (tomb2[i]<0) {
                negativ[negativDb++]=tomb2[i];
            }
        }
       
       
       System.out.print("\n\nNegatív tömb elemei: ");
       int negativOsszeg=0; 
            if (negativDb > 0){
                for (int i = 0; i < negativDb; i++) {
                    System.out.print(negativ[i]+" ");
                    negativOsszeg = negativOsszeg+negativ[i];
                }
            }
            else {
                System.out.print("nincs negativ");
            }
        System.out.println("\nA negatív tömb összege: "+negativOsszeg);
        System.out.println("A negatív tömb átlaga: "+(double) negativOsszeg/negativDb);
        System.out.println("\nKészítette: Dandóczi Máté Attila");
    }
    
}