package ket;
//Létrehozol egy tömböt 5 elemet veszel fel  1 és száz között, készitunk egy véletlen szám generátorral  egy másikat
// irasd ki a tomb elemeket egymással párhuzamosan
//5 - 5 elem 

public class Ket {

    public static void main(String[] args) {

       
    int tomb1[]=new int [5];
    tomb1[0]=21;
    tomb1[1]=32;
    tomb1[2]=53;
    tomb1[3]=75;
    tomb1[4]=12;
    int tomb2[]= new int [5];
    int osszeg1=0;
    int osszeg2=0;
    System.out.println("Tömbös feladat(két tömb)"+"\n");
    System.out.println("készítette Dandóczi Máté Attila"+"\n");
    
    for(int i=0; i < 5 ; i++){
        tomb2[i]=(int)(Math.random()*99);
    
        
    }
    
    
   for (int i = 0; i < 5; i++) {  
            System.out.print("A tömbök "+(i+1)+". elemei: ");
            if (tomb1[i]>=10){
                System.out.print(tomb1[i]+" ");               
            }
            else{
                System.out.print(" "+tomb1[i]+" ");  
            }
            if (tomb2[i]>=10){
                System.out.print(tomb2[i]+" ");
            }
            else {
                System.out.print(" "+tomb2[i]+" ");
            }
            
            if(tomb1[i]>tomb2[i]){
            System.out.println("Az első a nagyobb. "+"Ennyivel: "+(tomb1[i]-tomb2[i]));
            }
            else if (tomb1[i]<tomb2[i]){
            System.out.println("A második a nagyobb. "+"Ennyivel: "+(tomb2[i]-tomb1[i]));
            }
            else{
                System.out.println("Egyenlő");
            }
            osszeg1=osszeg1+tomb1[i];
            osszeg2=osszeg2+tomb2[i];
            }
           
            System.out.println("\n"+"Az első tömb összege: "+osszeg1);
            System.out.println("Az első tömb összege: "+osszeg2);
            System.out.println("\n"+"Az első tömb átlaga: "+(osszeg1/tomb1.length));
            System.out.println("Az második tömb átlaga: "+(osszeg2/tomb2.length));
            
    }
    

}

