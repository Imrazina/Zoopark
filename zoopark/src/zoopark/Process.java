
package zoopark;

import java.util.Scanner;

public class Process {
    private Cat[] kocky;
    private Dog[] dog;
    private Crocodile[] croci;
    private int pocetcat, pocetdog, pocetcroc;
    private String jmeno;
    Scanner input = new Scanner(System.in);
    private int sponsor;
  

    public Process(String jmeno, int kapacita) {
        this.kocky = new Cat[kapacita];
        this.dog = new Dog[kapacita];
        this.croci = new Crocodile[kapacita];
        this.pocetcat = 0;
        this.pocetdog = 0;
        this.pocetcroc = 0;
        this.jmeno = jmeno;
        this.input = input;
        this.sponsor = 0;
        
    }

    public void PridejZvire(){
    while(true){
        System.out.println("1 -- cat");
        System.out.println("2 -- dog");
        int choise = input.nextInt();
        input.nextLine();
        if(choise ==1 || choise == 2){
            switch(choise){
                case 1:
                    System.out.println("Zadej jmeno: ");
                    String namecat = input.nextLine();
                    
                    System.out.println("Zadej jmeno majitela: ");
                    String majitelcat = input.nextLine();
                   // input.nextLine();
                    System.out.println("Zadej address");
                    String addresscat = input.nextLine();
                    
                    Cat newcat = new Cat(majitelcat, addresscat, namecat);
                    
                    //for(int i =0; i<kocky.length; i++){
                      //  if(kocky!=null){
                            kocky[pocetcat] = newcat;
                            pocetcat++;
                        //}
                    
                   // }
                    
                    break;
                case 2:
                    System.out.println("Zadej jmeno: ");
                    String jmenodog = input.nextLine();
                    //input.nextLine();
                    System.out.println("Zadej jmeno majitela: ");
                    String majiteldog = input.nextLine();
                    System.out.println("Zadej address");
                    String addressdog = input.nextLine();
                    
                    Dog newdog = new Dog(majiteldog, addressdog, jmenodog);
                    
                    //for(int i =0; i<pocetdog; i++){
                      //  if(dog!=null){
                            dog[pocetdog] = newdog;
                            pocetdog++;
                        //}
                   
                   // }
                    break;
        }
        break;         
        } else{
            System.out.println("Choose number <1,2>");
        }
        }
    }
    
    public void OdeberZvire(){
    while(true){
        System.out.println("1 -- cat");
        System.out.println("2 -- dog");
        int choise  = input.nextInt();
        input.nextLine();
        if (choise == 1 || choise == 2){
            switch (choise){
                case 1:
                    System.out.println("Say cats name: ");
                    boolean foundcat = false;
                    String namecat = input.nextLine();
                    for(int i =0; i<pocetcat; i++){
                        if(namecat.equals(kocky[i].getName())){
                            kocky[i] = null;
                            pocetcat --;
                            foundcat = true;
                            System.out.println("Congratulation! You have a new small friend");
                            break;
                        }
                        if(!foundcat){
                            System.out.println("We do not have a cat with the name " + namecat);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Say dogs name: ");
                    boolean founddog = false;
                    String namedog = input.nextLine();
                    for(int i =0; i<pocetdog; i++){
                        if(namedog.equals(dog[i].getName())){
                            dog[i] = null;
                            pocetdog --;
                            founddog = true;
                            System.out.println("Congratulation! You have a new small friend " + namedog);
                            break;
                        
                        } 
                        if(!founddog){
                            System.out.println("We do not havr a dog with the name " + namedog);
                        }
                    
                    }
                    break;
                    
            }
            break;
        } else { System.out.println("Coose number <1,2>"); }
                    
    
    }
    }
    
    public void VypisZvire(){
    while(true){
        System.out.println("1 -- cat");
        System.out.println("2 -- dog");
        System.out.println("3 -- vsech");
        int choise = input.nextInt();
        
        if(choise == 1 || choise == 2 || choise == 3){
            switch(choise){
                case 1:
                    System.out.println(jmeno + " KOCKY: ");
                    boolean havecat = false;
                    for(int i =0; i<pocetcat; i++){
                        if(kocky[i]!=null){
                        System.out.println(kocky[i]);
                        havecat = true;
                    
                        } 
                        
                        
                    }
                    if(!havecat){
                       System.out.println("We do not have cats to show you");
                        }
                    break;
                case 2:
                    System.out.println(jmeno + " DOGS: ");
                    boolean havedog = false;
                    for(int i = 0; i<pocetdog; i++){
                        if(dog[i]!=null){
                        System.out.println(dog[i]);
                        havedog = true;
                        } 
                        
                    }
                    if(!havedog){
                            System.out.println("We do not have dogs to show you");
                        }
                    break;
                    
                    
                    
                case 3:
                    System.out.println(jmeno);
                    boolean haveanimal = false;
                    for(int i =0; i<pocetdog || i<pocetcat; i++){
                     if(dog[i]!=null || kocky[i]!=null){
                         System.out.println(dog[i]);
                         System.out.println(kocky[i]);
                         haveanimal = true;
                     }
                    
                    }
                    
                    
                    if(!haveanimal){
                        System.out.println("We do not have animals to show you: ");
                    }
                    break;
            }
        break;
        } else {
        System.out.println("Choose number mezi <1,3>");
        }
    }
    }

    
    public int Sponsor(){
   
        while(true){
        System.out.println("Hello! You are so nice");
        System.out.println("Choose the sum");
        System.out.println("-----------------------");
        System.out.println("1. 100\n"
                + "2. 200\n"
                + "3. 500\n"
                + "4. 1000\n"
                + "5. other");
        int choose = input.nextInt();
        if(choose>=1 && choose<=5){
        switch(choose){
            case 1:
                sponsor +=100;
                System.out.println("Congratulation! Donation ammount " + sponsor);
                break;
            case 2:
                sponsor +=200;
                System.out.println("Congratulation! Donation ammount " + sponsor);
                break;
            case 3:
                sponsor +=500;
                System.out.println("Congratulation! Donation ammount " + sponsor);
                break;
            case 4:
                sponsor +=1000;
                System.out.println("Congratulation! Donation ammount " + sponsor);
                break;
            case 5:
                System.out.println("Input the sum: ");
                int sum = input.nextInt();
                sponsor +=sum;
                System.out.println("Congratulation! Donation ammount " + sponsor);
                break;
        }
        break;
        } 
        else{
            System.out.println("Choose the number <1,5>");
        }
        }
    return sponsor;
    }
    
    
    
    public static String PridejNemocneneZvire(){
        String inputString;
        Scanner input = new Scanner(System.in);
        System.out.println("Zadej Vid: ");
        String choisevid = input.nextLine();
        
        System.out.println("Person Name: ");
        String choisename = input.nextLine();
        
        System.out.println("Address: ");
        String choiseadd = input.nextLine();
        
        System.out.println("Name of animal");
        String choisenameanimal = input.nextLine();
        
        int treatmentcost;
        treatmentcost = (int) (1000 +(Math.random()*10000));
        
        return choisenameanimal +  " (" + "Vid = " + choisevid + ", person Name = " + choisename + ", address = " + choiseadd + ", treatment cost = " + treatmentcost +" }";
      //  return name + " {" + "Vid = " + this.getVid() + ", personName = " + personName + ", address = " + address + ", pronauns = " + this.getPronauns() +'}';
    }
}

