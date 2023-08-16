
import java.util.Scanner;


public class Main {
    
    public static void toplam (int a, int b, int c){
    
        System.out.println("Giridiginiz degerlerin toplami = " + (a+b+c));
    
    }
    
    public static void selamlama(String isim){
    
        System.out.println("Selamlar... " + isim );
        
        
    
    
    }
    
    
    

    public static void main(String[] args) {
        
        selamlama("Omer");
        
        System.out.println("Lutfen toplamak istediginiz degerleri giriniz");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        toplam(a, b, c);
        
    }
}
