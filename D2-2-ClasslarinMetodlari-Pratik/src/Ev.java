
public class Ev {

    private String yuzolcumu;
    private int pencere;
    private int katsayisi; 
    private String balkonsayisi;
    private String bahcevarmi;
    private int maliyet;
    
    
    
    public void setYuzolcumu(String yuzolcumu){
        this.yuzolcumu = yuzolcumu;
    }
    public String getYuzolcumu(){
        return this.yuzolcumu;
    }
    
    
    public void setPencere(int pencere){
        if(pencere <5){System.out.println("Pencere sayisi yetersiz");}
        else{this.pencere = pencere;}
    
    }
    public int getPencere(){
        return this.pencere;
    }
    
    
    public void setKatsayisi(int katsayisi){
        this.katsayisi = katsayisi;
    }
    public int getKatsayisi(){
        return this.katsayisi;
    }
    
    
    public void setBalkonsayisi(String balkonsayisi){
        this.balkonsayisi = balkonsayisi;
    }
    public String getBalkonsayisi(){
        return this.balkonsayisi;
    }
    
    
    public void setBahcevarmi(String bahcevarmi){
        this.bahcevarmi = bahcevarmi;
    }
    public  String getBahcevarmi(){
        return this.bahcevarmi;
    }
    
    
    public void setMaliyet(int maliyet){
        this.maliyet = maliyet;
    }
    public int getMaliyet(){
        return this.maliyet;
    }
    
}
