
import java.util.Scanner;

class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {

        System.out.println("Siyasi Yasaginiz Bulunuyor");
        
    }    
}

class VizeException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Gideceginiz Ulkeye Vizeniz Bulunmamaktadir");
    }
}

class HarcException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Lutfen yurtdisi harcini tam yatirin");
    }
}



public class Yolcu {

    private int Harc;
    private boolean SiyasiYasak;
    private boolean VizeDurumu;
    
    public Yolcu(){
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Harc Miktarini Giriniz");
        this.Harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Siyasi Yasaginiz Var mi?");
        String cevap =scanner.nextLine();
        cevap =cevap.toUpperCase();
        
        if(cevap.equals("EVET")){this.SiyasiYasak = true;}
        else if(cevap.equals("HAYIR")){this.SiyasiYasak=false;}
        
        
        System.out.print("Vize Var Mi?");
        
        String cevap2 = scanner.nextLine();
        cevap2=cevap2.toUpperCase();
        
        if(cevap2.equals("EVET")){this.VizeDurumu = true;}
        else if(cevap2.equals("HAYIR")){this.VizeDurumu=false;}
        
    }
    
    
    public void YurtDisiHarci() throws HarcException {
    if(this.Harc <15){
        throw new HarcException();
    }
    
    else{System.out.println("Yurtdisi harci yatirilmistir");}    
        
    }

    
    public void SiyasiYasakKontrol() throws SiyasiException {
        
        if(this.SiyasiYasak==true){
            throw new SiyasiException();
        }
        
        
        else{System.out.println("Yasak yok gule gule"); }
        
    }

   
    public void VizeDurumuKontrol() throws VizeException {
        
        if(this.VizeDurumu==true){
            System.out.println("Vize islemleri tamam");
        }
        else{throw new VizeException();}
        
    }

    
    
}
