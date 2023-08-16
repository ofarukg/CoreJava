
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Welcome to Istanbul International Airport");
        String sartlar ="Yurt Disi Cikis Kurallari...\n"
                + "Herhangi bir siyasi yasak olmamalidir  \n"
                + "15 TL harc bedelinizi tam olarak yatiriniz   \n"
                + "Vizenizin olmasi lazim...";
        
        String message ="Yurtdisi sartlarinden hepsini saglamaniz gerekiyor...";
        
        
        while (true) {            
            
            System.out.println("*********************");
            System.out.println(message);
            System.out.println("**********************");
            System.out.println(sartlar);
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harc kontrol ediliyor");
            
            Thread.sleep(3000); //bu program uc saniye bekleyecek
            try {
                yolcu.YurtDisiHarci();
            } catch (HarcException ex) {
                ex.printStackTrace();
            continue;}
            
        
            System.out.println("Siyasi Yasak kontrol ediliyor");
            Thread.sleep(3000);
            
            try {
                yolcu.SiyasiYasakKontrol();
            } catch (SiyasiException ex) {
            ex.printStackTrace(); continue;}
            
            
            
            System.out.println("Vize kontrol ediliyor");
            Thread.sleep(3000);
            
            try {
                yolcu.VizeDurumuKontrol();
            } catch (VizeException ex) {
            ex.printStackTrace();continue;            }
        
            System.out.println("Islemleriniz tamam yurtdisina cikabilirsiniz"); break;
            }
        
       
    }
}
