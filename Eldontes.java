
package eldontes;


public class Eldontes {

   
    public static void main(String[] args) {
        int elemszam = (int) (Math.random()*10)+10;
       int tomb1 [] = new int [elemszam];
       int tomb2 [] = new int [elemszam];
       int negativ [] = new int [elemszam*2];
       System.out.println("\nELDÖNTÉS\n");
       
       for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random()*200)-100;           
            tomb2[i] = (int) (Math.random()*200)-100;               
        }
       
       System.out.print("A tömb1 elemei:");
       for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d", tomb1[i])+" ");
        }
       //eldöntés: van e benne 0
       boolean szerepelE1=false;
        for (int i = 0; i < elemszam; i++) {
            if (tomb1[i]==0) {
                szerepelE1=true;
                break;
            }
        }
        if (szerepelE1) {
            System.out.println("\nAz 1. tömb tartalmaz nullát.");
        }
       
       System.out.print("\nA tömb2 elemei:");
       for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d", tomb2[i])+" ");
        }
       
       //eldöntés: van e benne 0
       boolean szerepelE2=false;
        for (int i = 0; i < elemszam; i++) {
            if (tomb2[i]==0) {
                szerepelE2=true;
                break;
            }
        }
        
        if (szerepelE2) {
            System.out.println("\nA 2. tömb tartalmaz nullát.");
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
        boolean oszthatoE1=false;
        for (int i = 0; i < elemszam; i++) {
            if (negativ[i]%5==0) {
                oszthatoE1=true;
                
            }
        }
        if (oszthatoE1){
            System.out.println("\nVan 5-el osztható negatív szám.");
        }
        
        System.out.println("\nA negatív tömb összege: "+negativOsszeg);
        System.out.println("A negatív tömb átlaga: "+(double) negativOsszeg/negativDb);
        System.out.println("\nKészítette: Dandóczi Máté Attila");
    }
    

}
    

