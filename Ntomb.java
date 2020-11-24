package ntomb;

import java.util.Scanner;
public class Ntomb{

    
    public static void main(String[] args) {
        System.out.println("\n TÖMBMŰVELETEK \n");
        int elsotomb=0;
        int masodiktomb=0;
        Scanner bemenet;
        bemenet=new Scanner(System.in);
        System.out.print("Hány elemű legyen a 2 tömb? ");
        int a = bemenet.nextInt();
        int[] tomb=new int[a];
        int[] tomb2=new int[a];
        
        for (int i=0; i <a; i++) {
            tomb[i]=(int)(Math.random()*999)+1;
            tomb2[i]=(int)(Math.random()*999)+1;
           
        }
        
        System.out.print("A tömb elemei: \n");
        
        for (int i = 0; i < a; i++) {
            int sorOsszeg=0;
            
            sorOsszeg=tomb[i]+tomb2[i];
            System.out.print(i+1+". elem: "+" ");
            elsotomb+=tomb[i];
            masodiktomb+=tomb2[i];
            
            System.out.print(String.format("%,3d",tomb[i])+" + ");
            System.out.print(String.format("%,3d",tomb2[i])+" = ");
            System.out.print(String.format("%,5d",sorOsszeg));
            System.out.println("");
            
        }
        System.out.println("\nAz első tomb összege: "+elsotomb);
        System.out.println("A masodik tomb összege: "+masodiktomb);
        System.out.println("\n Készítette: Dandóczi Máté \n");
    bemenet.close();
    }
       
     
  

}
