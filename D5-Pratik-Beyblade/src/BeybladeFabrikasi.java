
public class BeybladeFabrikasi {

    public Beyblade beybladeUret(String beyblade_turu){
    
            if(beyblade_turu.equals("Dragon")){
                return new Dragon("Mavi Ejderha", "Kutsal Canavarla Konus", "Takao", 800, 300);
            }
        
            else if(beyblade_turu.equals("Dranza")){
                return new Draciel("Mamut", "Ash Ketchum", 25000, 950);
            }
            
            
            
            else if(beyblade_turu.equals("Draciel")){
                
                return new Drayga("Aslan", "Rock", 95000, 1);
            }
            
            
            
            else if(beyblade_turu.equals("Drayga")){
                System.out.println("Uretildi");
                return new Dranza("Penguen", "Eren Yeager", 50, 10000);
            }
                        
            else{System.out.println("Hatali Secim Yaptiniz"); return null;}
    
    }
    
    
}
