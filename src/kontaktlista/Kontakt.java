/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontaktlista;

/**
 *
 * @author shaot01
 */
public class Kontakt {
    private String Fornamn;
    private String Efternamn;
    private String Telefonnummer;
    
    
public Kontakt (String f, String e, String t){
    this.Fornamn = f;
    Efternamn =e;
    Telefonnummer = t;
}

public Kontakt (String f, String t){
    this.Fornamn = f;
    this.Telefonnummer = t;
    this.Efternamn="";
}
public void setTelefonnummer(String t){
 this.Telefonnummer=t;
}

public String getFornamn(){
    return this.Fornamn;
}
public String getEfternamn(){
    return this.Efternamn;
}
public String getTelefonnummer(){
    return this.Telefonnummer;
}
public void skrivUtf () {
    System.out.println(Fornamn);
    System.out.println(Efternamn);
    System.out.println(Telefonnummer);
}
public void skrivUte (){
    System.out.println(Efternamn);
    System.out.println(Fornamn);
    System.out.println(Telefonnummer);
}
 }

