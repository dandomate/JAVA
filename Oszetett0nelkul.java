
package oszetett0nelkul;

import java.util.Scanner;

public class Oszetett0nelkul {

    
    public static void main(String[] args) {
        System.out.println("\n ÖSSZETETT FELADATSOR");
        Scanner bemenet = new Scanner(System.in);
        char valasz = 0;
        do{
            
        //2.tömb hossza
            int darabszam = (int) (Math.random() * 10) + 20;
            
        //1. két tömb létrehozása
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam];
        
        //3. tömb értékei
        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * 100) - 50;
            szamok2[i] = (int) (Math.random() * 100) - 50;
        }
        
        //4.A két tömb kiiratása
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " ");
        }
            System.out.println("");
            
        //5. Áthelyezés 5-el osztható páros szám
        int ujTomb[] = new int[darabszam];
        int ujTombdb = 0;
        for (int i = 0; i < darabszam; i++) {
            if ((szamok1[i] % 5 == 0) && (szamok1[i]%2==0)) {
                ujTomb[ujTombdb++] = szamok1[i];
            }
            if ((szamok2[i] % 5 == 0) && (szamok2[i]%2==0)) {
                ujTomb[ujTombdb++] = szamok2[i];
            }

        }
        
         for (int i = 0; i < ujTombdb-1; i++) {
            for(int j = 0; j < ujTombdb-i-1; j++) {
                if (ujTomb[j]>ujTomb[j+1]) {
                    int temp=ujTomb[j];
                    ujTomb[j]=ujTomb[j+1];
                    ujTomb[j+1]=temp;
                }
            }
        }
        
        System.out.println("\nAz ujTomb elemei: ");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
        }
            System.out.println("");
            
        //6.Legkisebb, legnagyobb szám
        int legnagyobb=ujTomb[0];
        int legkisebb=ujTomb[ujTombdb-1];
        System.out.println("\nA legkisebb szám az ujTomb-ben: "+legnagyobb);
        System.out.println("A legnagyobb szám az ujTomb-ben: "+legkisebb);
        
        //7.többszöröse-e
        if ( ujTomb[ujTombdb-1]%ujTomb[0] == 0) {
            System.out.println("\nAz ujTomb legnagyobb eleme a legkisebb elemének a többszöröse");
        }
        else {
            System.out.println("\nAz ujTomb legnagyobb eleme nem többszöröse a legkisebbnek elemének");
        }
        
        //8.Tartalmaz-e nullát
        for (int i = 0; i < ujTombdb; i++) {
            if (ujTomb[i] == 0) {
                System.out.println("\nAz ujTomb 0-t tartalmaz");
                 break;
            }
        }
        
 //9.Futtatni akarod még 1x?
            System.out.print("\nSzeretné újra lefuttatni a programot? i/n: ");
            valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));
        System.out.println("\nKészítette: Dandóczi Máté Attila");
}
}
