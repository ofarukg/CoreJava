
public class Account {

    private String hesapno;
    private double bakiye;
    private String isim;
    private String email;
    private String telefon;

    
    //burada constructor yazacaz
    
    
    
    public Account(String isim, String email, String telefon){
        
        
        this("Bilgi yok", 0.0, isim, email, telefon);
        
    }
    
    
    //overloading yapiyoruz
    public Account(String hesapno, double bakiye, String isim, String email, String telefon){  
    
        this.hesapno = hesapno;
        this.bakiye=bakiye;
        this.email=email;
        this.isim=isim;
        this.telefon=telefon;
    
    }
    
    public void bilgigoster(){
    
        System.out.println("Hesap No: " + hesapno);
        System.out.println("Bakiye: " + bakiye);
        System.out.println("Email: " + email);
        System.out.println("Isim: " + isim);
        System.out.println("Telefon: " + telefon);
        
    
    }
    
    public  void parayatir(double miktar){
    
        bakiye+=miktar;
        System.out.println("Guncel Bakiyeniz: " + bakiye);
    
    }
    
    public void paracek(double miktar){
    
        if (miktar>bakiye) {System.out.println("Yeterli Bakiyeniz Bulunmamaktadir. Guncel Bakiyeniz: " + bakiye);
            }
        else if(miktar>1500){System.out.println("Gunluk Islem Limitiniz Yetersiz.");}
        
        else{ bakiye -=miktar;
            System.out.println("Guncel Bakiyeniz: " + bakiye);
        }

    }
    
    
    
    
    
    public String getHesapno() {
        return hesapno;
    }
    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    
    public double getBakiye() {
        return bakiye;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
    
    
    
    
    
    
    
    
}
