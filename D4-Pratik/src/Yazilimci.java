
public class Yazilimci extends Calisan {

    private String diller;
    
    
    public Yazilimci(String ad, String soyad, String ID, String diller) {
        super(ad, soyad, ID);
        this.diller=diller;
    }
    
    public void formatAt(String isletim_sistemi){
    
        System.out.println(getAd() +" Bilgisayari Guncelledi \n"
                + "Yeni Sistem: " + isletim_sistemi);
    }

    
    public void calis() {
        System.out.println(getAd() +" Adli Yazilimci Calisiyor"); 
    }
    
    

    
    public void bilgilerigoster() {
        
        System.out.println("Yazilimci Bilgileri");
        System.out.println("Calisan Adi: " + super.getAd());
        System.out.println("Calisan Soyadi: " + super.getSoyad());   /* veya direk [  super.bilgilerigoster();  ]  yazabiliriz*/
        System.out.println("Calisan ID No: " + super.getID());
        
        
        System.out.println("Calisan Bildigi Diller: " + diller);
        
        
    }
    
    
    
    
    

}
