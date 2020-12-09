
package keresztmetszet;

import java.util.Scanner;


public class Keresztmetszet {

   
    public static void main(String[] args) {
        System.out.println("\nKERESZTMETSZET\n");
        
        Scanner bemenet;
        bemenet=new Scanner(System.in);
        char val;
        do{

//2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 5 és 10 között.
//elemszam megadas
        int elemszam=(int) (Math.random()*6)+5;                
        
//1. Hozz létre HÁROM azonos elemszámú tömböt: szamtomb1, szamtomb2, szamtomb3 néven!  
        int [] szamtomb1=new int[elemszam];                   
        int [] szamtomb2=new int[elemszam];
        int [] szamtomb3=new int[elemszam];
        
//3. Az elemek a -100 és +100 értéktartományba essenek.
//Számok generálása -100 és 100 között
         for (int i = 0; i < elemszam; i++) {
           szamtomb1[i] = (int) (Math.random()*201)-100;           
           szamtomb2[i] = (int) (Math.random()*201)-100;   
           szamtomb3[i] = (int) (Math.random()*201)-100;   
        }
//4. Írasd ki a három tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
        //1 tomb elemeinek kiirasa
        System.out.println("Szamtomb1 tömb elemei:");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%,4d",  szamtomb1[i])+" ");    
        }
        System.out.println("\n");
        //2 tomb elemeinek kiirasa
        System.out.println("Szamtomb2 tömb elemei:");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%,4d",  szamtomb2[i])+" ");   
        }
        System.out.println("\n");
        //3 tomb elemeinek kiirasa
        System.out.println("Szamtomb3 tömb elemei:");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%,4d", szamtomb3[i])+" ");    
        }
        System.out.println("\n");
        
//5. Írasd ki az azonos indexű tömbelemeket egymás mellé az összegükkel az alábbi módon (az 1. index esetén):  1. számok: 98 + 65 + 34 = 197
//szamlalo létrehozása
        int db=1;                           
        for (int i = 0; i < elemszam; i++) {
            int osszeg=szamtomb1[i]+szamtomb2[i]+szamtomb3[i];
            System.out.println(db++ +".számok:"+szamtomb1[i]+"+"+szamtomb2[i]+"+"+szamtomb3[i]+"="+osszeg );
            
        }
        System.out.println("\n");
       
//  6. Írasd ki a páros indexű tömbelemek legkisebb elemét.  Legkisebb számok:  56 (2. ), -44 (4.), -5 (6.), ...
        int index=2;                    
        System.out.println("Legkisebb számok (indexenként):");
        for (int i = 0; i <=elemszam; i++) {
            if(index>elemszam || index>elemszam-1  ){break;}
            else if (szamtomb1[index]<szamtomb2[index] && szamtomb1[index]<szamtomb3[index]){
              System.out.println(String.format("Legkisebb:"+szamtomb1[index])+" ("+index+".)");
              index+=2;
            }
            else if (szamtomb2[index]<szamtomb1[index] && szamtomb2[index]<szamtomb3[index]){
               System.out.println(String.format("Legkisebb:"+szamtomb2[index])+" ("+index+".)");
               index+=2;
            }
            else if (szamtomb3[index]<szamtomb1[index] && szamtomb3[index]<szamtomb2[index]){
               System.out.println(String.format("Legkisebb:"+szamtomb3[index])+" ("+index+".)");
               index+=2;
            }

        }
        
 //  7. Fésüld össze a három tömböt egy közös tömbbe teljesTomb néven és írasd ki az elemeket sorbarendezve! 
            int [] teljes=new int [elemszam*3];    
            int teljesTombdb = 0;                  
          
            
            for (int i = 0; i < elemszam; i++) {
               teljes[teljesTombdb++] += szamtomb1[i];
               teljes[teljesTombdb++] += szamtomb2[i];
               teljes[teljesTombdb++] += szamtomb3[i];
            }
            
//Sorbarendezzük a tömböket
            for (int i = 0; i < teljesTombdb-1; i++) {
                for (int j = 0; j <teljesTombdb-i-1 ; j++) {
                     if (teljes[j]>teljes[j+1]){
                         int csere=teljes[j];                           
                         teljes[j]=teljes[j+1];
                         teljes[j+1]=csere;
                 }           
            }
        }
//kiiratjuk a teljesTomb nevű tömböt (az összes elemét)
            System.out.println("\nA teljesTomb elemei:");   
            for (int i = 0; i < teljesTombdb; i++) {
               System.out.print(String.format("%,4d", teljes[i]) + " ");

      }
            
// 8. Írasd ki azokat az elemeket, melyekből több is található a teljesTombben! (sorbarendezés tételét gondold újra....)
            System.out.println("\n");
            System.out.println("Több is szerepel belőlük a teljes tömbben:");
            
            int len=-1;                                              
            int ho=0;                                               
            for (int j = 0; j < teljesTombdb-1 ; j++) {
                if (teljes[j]==teljes[j+1]){
                     len+=1;   
                     ho+=1;
                     int tobb [] =new int[ho];
                     tobb[len]+=teljes[j];
                     System.out.println(tobb[len]+" ");
                 }
                     }
            if (len==-1){System.out.println("Nincs ilyen szám!");
            } 
               
//  9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
            System.out.println("\n");
            System.out.print("Szeretné a programot újból lefuttatni? (i-igen n-nem) ");
            val = bemenet.nextLine().toLowerCase().charAt(0);
            }while (val == 'i');  
            bemenet.close();
            System.out.println("Készítette: Dandóczi Máté Attila 1/13c");
         
    }
}