
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.println("Idman Programina Hosgeldiniz");
        
        String idmanlar = "Gecerli Hareketler \n"
                        + "Burpee \n"
                + "pushup \n"
                + "situp \n"
                + "squat";
        
        System.out.println(idmanlar);
        
        System.out.println("Bir idman olusturun");
        
        System.out.println("burpee sayisi");
        int burpee = scanner.nextInt();
        scanner.nextLine();
                System.out.println("pushup sayisi");
        int pushup = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("situp sayisi");
        int situp = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("squat sayisi");
        int squat = scanner.nextInt();
        scanner.nextLine();
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        
        System.out.println("Idman basliyor");
        
        while (idman.idmanBittimi()==false) {
            
            System.out.println("Hareket Turunu Sec (Pushup, Squat, Burpee, Situp)");
            
            String tur = scanner.nextLine();
            
            System.out.println("Bu hareketten kac tane yapacaksiniz");
            
            int sayi = scanner.nextInt();
            scanner.nextLine();
            
            idman.hareketyap(tur, sayi);
        }
        
        
    }
    
    
    
}
