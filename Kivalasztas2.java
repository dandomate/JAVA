package kivalasztas2;
import java.util.Scanner;

public class Kivalasztas2 {

   
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        System.out.println("\nKIVÁLASZTÁS TÉTELE\n");
        int elemszam = 20;
                
        int tomb1[] = new int [elemszam];
        
        for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random()*100)+1;
        }
        System.out.println("Eredeti:");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(tomb1[i]+" ");
        }
        System.out.println("\n3-asával");
        for (int i = 3; i < elemszam; i+=3) {
            System.out.print(tomb1[i]+" ");
        }
        System.out.println("");
        System.out.print("\nMelyik elem sorszámára kíváncsi? ");
        int keresettSzam = bemenet.nextInt();
        
        System.out.println("\n");
        int j = 0;
        for (int i = 0; i < elemszam; i++) {
            if (tomb1[i] == keresettSzam){
                System.out.print("A keresett szám indexe: "+(i+1));
                break;
            }   
            j++;
            
        }
        
        if (elemszam == j){
            System.out.println("Nem volt benne.");
        }
        
        
        
        
        System.out.println("\n");
        int i = 0;
        while(tomb1[i] != keresettSzam){
            i++;
        }
        System.out.print("A keresett szám indexe: "+(i+1));
        
        
        bemenet.close();
        System.out.println("\nKészítette:Dandóczi Máté Attila 1/13c");
    }
        
}