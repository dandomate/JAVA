package sorbarendezesnegativ;

import java.util.Scanner;

public class Sorbarendezesnegativ {
  
    public static void main(String[] args) {
        System.out.println("\nSORBARENDEZÉS TÉTELE (buborékos módszer)\n");
        
        System.out.print("Hány elemű tömböt szeretne létrehozni? ");
        Scanner bemenet=new Scanner(System.in);
        int elemSzam=bemenet.nextInt();
        int[] szamok=new int[elemSzam];
        
        //tömb feltöltése - elemek random értéket kapnak
        for (int i = 0; i < elemSzam; i++) {
            szamok[i]=(int)(Math.random()*50)-50;
        }
        
        //tömb kiíratása
        System.out.println("\nTömbünk elemei:");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
        
        //tömb sorbarendezett kiíratása: buborékos rendezés
        for (int i = 0; i < elemSzam-1; i++) {
            for(int j = 0; j < elemSzam-i-1; j++) {
                if (szamok[j]>szamok[j+1]) {
                    int temp=szamok[j];
                    szamok[j]=szamok[j+1];
                    szamok[j+1]=temp;
                }
            }
        }
        System.out.println("\nRendezett tömbünk:");
        for (int i = 0; i < elemSzam; i++){
            System.out.print(szamok[i]+" ");
        }
        System.out.println("");
    }
}