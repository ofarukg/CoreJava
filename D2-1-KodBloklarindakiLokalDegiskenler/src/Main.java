
import java.util.Scanner;


public class Main {

    public static void toplama(int a, int b, int c){
    
        int deneme =10;
        
        System.out.println("Toplam: " + (a+b+c));
        
    }
    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        
        toplama(a, b, c);
        
        //yukaridaki a, b, c veya "deneme" degerlerini bagimsiz olarak kullanamayiz.
        
        System.out.println(deneme);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
    
}
