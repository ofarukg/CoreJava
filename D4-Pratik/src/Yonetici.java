
public class Yonetici extends Calisan {
    
    private int sorumlu_kisi_sayisi;

    public Yonetici(int sorumlu_kisi_sayisi, String ad, String soyad, String ID) {
        super(ad, soyad, ID);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    
    
    public int getSorumlu_kisi_sayisi() {
        return sorumlu_kisi_sayisi;
    }

    public void setSorumlu_kisi_sayisi(int sorumlu_kisi_sayisi) {
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    
    public void bilgilerigoster() {
        System.out.println("Yonetici Bilgileri");
        System.out.println("Calisan Adi: " + getAd());
        System.out.println("Calisan Soyadi: " + getSoyad());
        System.out.println("Calisan ID No: " + getID()); 
        System.out.println("Yoneticinin Sorumlu oldugu kisi sayisi: " + sorumlu_kisi_sayisi);
    }
    
    
    
    
    public void zamYap(int zam_miktari){
        
        System.out.println("Yonetici "+getAd() +zam_miktari + " TL zam yapiyor");
    }
    
    
    

}
