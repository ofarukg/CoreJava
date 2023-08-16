
import java.util.Scanner;


public class Main {
    
    public static void selamlama(){
    
        System.out.println("Merhaba Nasilsiniz");
        System.out.println("Selamlar...");
        
        
    }
    
    public static void faktoriyel(){
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        
        int faktoriyel = 1;
        
        int ilksayi = sayi;
        
        while (sayi>1) {

            faktoriyel *= sayi;
            
            sayi--;
            
         }
            System.out.println(ilksayi + " Degeri icin hesaplanan faktoriyel degeri = " + faktoriyel);
            
        
        
    
    
    }
    
    public static void main(String[] args) {
        
        selamlama();
        
        faktoriyel();
        
        
    }
}
