/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kontaktlista;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author shaot01
 */
public class Kontaktlista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Kontakt> konlista = new ArrayList<>(); //Lagra kontakter
        int antalKontakter = 0; //Används som räknare i loopen
        int mer = 1; //Villkor i loopen

        do {
            System.out.println("Ange ett alternativ utifrån menyn: ");
            System.out.println("1. Ny kontakt");
            System.out.println("2. Skriv ut förnamn");
            System.out.println("3. Skriv ut efternamn");
            System.out.println("0 = Avsluta");

            int val = input.nextInt();

            switch (val) {
                //Val 1 - Skapa ny kontakt     
                case 1:

                    /*   System.out.println("Ange Förnamn: ");
        String Fornamn = input.nextLine();
        
        System.out.println("Ange Efternamn: ");
        String Efternamn = input.nextLine();
        
        System.out.println("Ange Telefonnummer: ");
        String Telefonnummer = input.nextLine();
        
      //  Kontakt kon1 = new Kontakt(Fornamn, Efternamn, Telefonnummer);
        konlista [antalKontakter] = new Kontakt(Fornamn, Efternamn, Telefonnummer);
        antalKontakter++;*/
            nyKontakt(konlista,antalKontakter, input);

                //Skriva ut alla kontakter i fältet - För1 Efter2 TelNr3
                case 2:
             
            skrivUtF(konlista, antalKontakter);
              
                //Skriva ut alla kontakter i fältet - Efter1 För2 TelNr3
                case 3:
                    
            skrivUtE(konlista, antalKontakter);        

                case 0:
                    break;
            }
        } while (konlista.size() < 100 && mer != 0);

    }
    //Val 2 - Skriv ut förnamn

    public static int nyKontakt(ArrayList konlista, int antalKontakter, Scanner input) {
        System.out.println("Ange Förnamn: ");
        String Fornamn = input.nextLine();

        System.out.println("Ange Efternamn: ");
        String Efternamn = input.nextLine();

        System.out.println("Ange Telefonnummer: ");
        String Telefonnummer = input.nextLine();

        //  Kontakt kon1 = new Kontakt(Fornamn, Efternamn, Telefonnummer);
        ArrayList <antalKontakter> konlista = new Kontakt(Fornamn, Efternamn, Telefonnummer);
        konlista.add
        return antalKontakter;
    }
    
    public static void skrivUtF (ArrayList konlista, int antalKontakter){
       
       for (int i = 0; i < konlista.size(); i++) {
      System.out.println(konlista.get(i));
      }
          }
    
    
    public static void skrivUtE (Kontakt[]konlista, int antalKontakter){
      
     for(int i = 0;i < antalKontakter ;i++){
           konlista[i].skrivUte();
          
      } 
        
    }
}


/* do{
        System.out.println("Ange Förnamn: ");
        String Fornamn = input.nextLine();
        
        System.out.println("Ange Efternamn: ");
        String Efternamn = input.nextLine();
        
        System.out.println("Ange Telefonnummer: ");
        String Telefonnummer = input.nextLine();
        
        
        
        Kontakt kon1 = new Kontakt (Fornamn, Efternamn, Telefonnummer);
        antalKontakter++;
        
        
       System.out.println("Vill du lägga till fler kontakter? (1- fler /0-avsluta)");
        mer = input.nextInt();
        input.nextLine();
        } while(antalKontakter < 100 && mer!=0 ); 
        /*
        System.out.println(kon1.getFornamn()+",  "
                +kon1.getEfternamn()+", "
                +kon1.getTelefonnummer());
   
        System.out.println(kon1);
 */
