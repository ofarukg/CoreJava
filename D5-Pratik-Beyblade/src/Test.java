
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*************************************************");
        System.out.println("Beyblade Fabrikasina Hosgeldiniz");
        System.out.println("Cikis icin q'ya basiniz.");
        System.out.println("*************************************************");
        
        
        
       
        
        while (true) {            
            System.out.println("Hangi Beyblade i uretmek istiyorsunuz?");
            String beyblade_turu = scanner.nextLine();
            
            if(beyblade_turu.equals("q")){System.out.println("Programdan cikiliyor"); break;}
            
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                
                Beyblade beyblade = fabrika.beybladeUret(beyblade_turu);
                
                if(beyblade == null){ System.out.println("Lutfen gecerli bir secim yapiniz");}
                
                else{
                    beyblade.bilgileri_goster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
            }
            
            
            }
        
        }
        
    }
    
}    

