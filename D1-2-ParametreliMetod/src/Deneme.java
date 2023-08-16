
import java.util.Scanner;


public class Deneme {

        public static void faktoriyel(int sayi){
        
            Scanner scanner = new Scanner(System.in);
        
        
        
        int faktoriyel = 1;
        
        int ilksayi = sayi;
        
        while (sayi>1) {

            faktoriyel *= sayi;
            
            sayi--;
            
         }
            System.out.println(ilksayi + " Degeri icin hesaplanan faktoriyel degeri = " + faktoriyel);
        
        }
    
    
    public static void main(String[] args) {
        
        System.out.print("Faktoriyel degerini bulmak istediginiz sayiyi giriniz lutfen: ");
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        faktoriyel(a);
        
    }
}
