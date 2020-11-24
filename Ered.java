
package ered;


public class Ered {

 
    public static void main(String[] args) {
        System.out.println("\nKIVÁLOGATÁS TÉTELE\n");
        int eredmenyek[]=new int [5];
        int masolat[]= new int [5];
        
        
        eredmenyek[0]=1;
        eredmenyek[1]=2;
        eredmenyek[2]=3;
        eredmenyek[3]=4;
        eredmenyek[4]=5;
        
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+". jegy: "+String.format("%,d",eredmenyek[i]));
            
        }
        System.out.println("");
        int kettesek=0;
        for (int i = 0; i < 5; i++) {
            if (eredmenyek[i]==2){
                masolat[kettesek++]=eredmenyek[i];
            }
            
        }
        System.out.print("Másolat tömb elemei: ");
        for (int i = 0; i < kettesek; i++) {
            System.out.print(masolat[i]+" ");
            
        }
        System.out.println("\nKettesek száma: "+kettesek);
    }
    
}
