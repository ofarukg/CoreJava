
import java.util.Scanner;


public class Deneme {

    public static int EBOBB (int sayi1, int sayi2){
    
        int ebob =1;
        
        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            
            if(sayi1%i==0 && sayi2%i==0){ebob=i;}
            
        }
         
    return ebob;
    
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int ilk = scanner.nextInt();
        int ikinci = scanner.nextInt();
        
        System.out.println(EBOBB(ilk, ikinci));
        
          
    }
     
}
