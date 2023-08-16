
public class Calisan {

    private String ad;
    private String soyad;
    private String ID;

    public Calisan(String ad, String soyad, String ID) {
        this.ad = ad;
        this.soyad = soyad;
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
    public void bilgilerigoster(){
    
        System.out.println("Calisan Bilgileri");
        System.out.println("Calisan Adi: " + ad);
        System.out.println("Calisan Soyadi: " + soyad);
        System.out.println("Calisan ID No: " + ID);
    }
    
    public void calis(){
        System.out.println(getAd() + " adli  kole pardon... personel calisiyor");
    }
}
