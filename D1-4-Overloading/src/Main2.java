
public class Main2 {

    public static void skorhesapla(String isim, int puan){
    
        System.out.println(isim + " Adli oyuncu " + puan + " puana sahiptir");
    
    
    }
    public static void skorhesapla(String isim){
    System.out.println(isim + " Adli oyuncunun " + " puani belirsizdir");
    
    }
    
    
    public static void skorhesapla(int puan){
    
        
        System.out.println("Isimsiz oyuncu " + puan + " puana sahiptir");
    
    }
    
    
    
    public static void main(String[] args) {
        
        skorhesapla("Omer");
        
        
        skorhesapla(50);
        
        
        skorhesapla("omer", 25);
        
    }
}
