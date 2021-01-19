/*
1. Hozz létre egy tömböt: szamok néven!
2. A tömb elemszáma 20 legyen.
3. Az elemek a -50 és +50 értéktartományba essenek.
4. Írasd ki a tömb elemeit egy sorban.
5. Ekkor kérdezd meg a felhasználót, mit szeretne tenni az adatokkal:
     1 - összeget számoltatni: tömbök összegét kiíratni
     2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni
     3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?
     4 - 5-tel osztható páros számok db-száma: mennyi?
     5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.

!!!!!!! Adatbevitelnél mindig oldd meg, hogy csak azokkal az elemekkel engedje tovább a program a felhasználót, amelyek a tömb elemi között szerepelnek!
 */
package menu;
import java.util.Scanner;

public class MENU {

    public static void main(String[] args) {
        Scanner sc;
        System.out.println("\nMENŰ\n");
        sc = new Scanner(System.in);
        //1. Hozz létre egy tömböt: szamok néven!
        int szamok[] = new int [20];
        //2. A tömb elemszáma 20 legyen.
        for(int i =0;i<20;i++){
        //3. Az elemek a -50 és +50 értéktartományba essenek.
            szamok[i] = (int) (Math.random()*100)-50;
        }
        //4. Írasd ki a tömb elemeit egy sorban.
        for(int i =0;i<20;i++){
            System.out.print(szamok[i]+" ");
        }
        //5. Ekkor kérdezd meg a felhasználót, mit szeretne tenni az adatokkal:
        System.out.println("\nÍrj egy számot mi szeretnél az adatokkal \n");
        System.out.println("1 - Összeget számoltatni: tömbök összegét kiíratni");
        System.out.println("2 - Szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni");
        System.out.println("3 - Van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?");
        System.out.println("4 - 5-tel osztható páros számok db-száma: mennyi?");
        System.out.println("5 - Adott számot tartalmazza-e");
        
        int var = sc.nextInt();
        switch (var)
            {
                case 1:     //1 - összeget számoltatni: tömbök összegét kiíratni
                    //code
                    int sum=0;
                    for(int i =0;i<20;i++){
                        sum += szamok[i];
                    }
                    System.out.println(sum);
                    break;
                case 2:     //2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni
                    //code
                    int max =0;
                    int min = 51;
                    for(int i =0;i<20;i++){
                        if (min>szamok[i]){
                            min = szamok[i];
                        }
                        else{
                            max = szamok[i];
                        }
                                     
                    }
                    System.out.println("a maximum: "+max+" a minimum: "+min);
                    break;
                case 3:     //3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?
                    //code
                    int vane = 0;
                    for(int i =0;i<20;i++){
                        if(szamok[i]>=40){
                            vane = 1;
                            break;
                        }
                    }
                    if(vane==1){
                        System.out.println("Tartalmaz");
                    }
                    else{
                        System.out.println("Nem tartalmaz");
                    }
                    break;
                case 4:     //     4 - 5-tel osztható páros számok db-száma: mennyi?
                    int db = 0;
                    for(int i =0;i<20;i++){
                        if(szamok[i]%5==0&&szamok[i]%2==0){
                            db++;
                        }
                    }
                    if(db!=0){
                        System.out.println("Tartalmaz 5-tel osztható páros számot, ennyi db-ot: "+db);
                    }
                    else{
                        System.out.println("Nem tartalmaz 5-tel osztható páros számot");
                    }
                    break;
                    //code
                case 5:     //5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.
                    System.out.println("Add meg a számot amire kiváncsi vagy: ");
                    int szam = sc.nextInt();
                    int tart = 0;
                    for(int i =0;i<20;i++){
                        if(szam==szamok[i]){
                            tart++;
                            break;
                        }
                    }
                    if(tart!=0){
                        System.out.println("Tartalmazza");
                    }
                    else{
                        System.out.println("Nem tartalmazza");
                    }
                    break;
            }
    System.out.println("\nKészítette:Dandóczi Máté Attila 1/13c");   
    }
     
     
     
     
        
    }
    
