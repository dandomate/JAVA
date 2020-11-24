package meg;


public class Meg {

    
    public static void main(String[] args) {
        System.out.println("\n\tMEGSZÁMLÁLÁS TÉTELE\n");
        int[] tomb=new int[5];
        
        int szamlalo=0;
        int parosSzamlalo=0;
        int paratlanSzamlalo=0;
        for (int i=0; i <5; i++) {
            tomb[i]=(int)(Math.random()*99)+1;
            szamlalo++;
            
            if (tomb[i]%2==0) {
               parosSzamlalo++;
            }
            else if (tomb[i]%2==1){
                paratlanSzamlalo++;
        }      
        }
        System.out.print("A tömb elemei: \n");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+". elem: "+" ");
            if(tomb[i]%2!=0){
                System.out.println("páratlan");
            }
            else
            System.out.print(String.format("%,8d",tomb[i])+" \n");
        }
        System.out.println("");
        System.out.println(szamlalo+" elemű a tömbünk\n");
        System.out.println("Ebből a tömbből "+parosSzamlalo+" db páros szám van");
        System.out.println("Ebből a tömbből "+paratlanSzamlalo+" db páratlan szám van\n");
        System.out.println("Készítette: Dandóczi Máté");
        }
       }
    