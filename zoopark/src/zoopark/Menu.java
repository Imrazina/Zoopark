
package zoopark;

import java.util.Scanner;


public class Menu {
    public static int getChoise(){
        System.out.println("Choose the number");
        Scanner input = new Scanner(System.in);    
        int choise = -1;
        
        while(true){
        choise = input.nextInt();
        if(choise>=0 && choise<7){
        break;
        } else{
            System.out.println("Choose the number beetwen <0,9>");
        }
        }
    return choise;
    }
    
    public static void showCommands(){
        System.out.println("---------------------");
        System.out.println("0 - Konec programu");
        System.out.println("1 - Pridej zvire");
        System.out.println("2 - Odeber zvire");
        System.out.println("3 - Vypis zvire");
        System.out.println("4 - Sponsor ");
        System.out.println("5 - Read file with illness animals ");
        System.out.println("6 - Add to file animal with disease");
    
    }
    
    public static void ShowMenu(){
    int choise;
    boolean exit = false;
    Process pico = new Process("UTULEK", 10);
    Nemoc nemoc = new Nemoc();
    //Nemoc kva = new Nemoc ();
    //String filePath = ("Nemoc.rtf");
    
    while(!exit){
    showCommands();
    choise = getChoise();
    
    switch(choise){
        case 0:
            System.out.println("Konec programu");
            exit = true;
            break;
        case 1:
            pico.PridejZvire();
            break;
        case 2:
            pico.OdeberZvire();
            break;
        case 3:
            pico.VypisZvire();
            break;
        case 4:
            pico.Sponsor();
            break;
        case 5:
            String filePath = "Nemoc.txt";
            
            nemoc.FileDataReader(filePath);
            break;
            
        case 6:
            String filepath = "Nemoc.txt";
            nemoc.FileDataWriter(filepath);
            break;
            
    
    }
    
    
    
    
    }
    }
    
    
    
}
