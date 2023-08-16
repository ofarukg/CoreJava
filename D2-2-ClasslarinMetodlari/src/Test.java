
public class Test {

    public static void main(String[] args) {
        
        Araba araba1 = new Araba();
        
        
        araba1.setModel("Renault");
        System.out.println("Arabanin Modeli: " + araba1.getModel());
        
        araba1.setKapilar(-5);
        System.out.println("Kapi sayisi: " + araba1.getKapilar());
        
        
        
        /*Araba araba2;
        
        araba2.setKapilar(0); // araba2 icin bir obje belirtilmedi*/
        
        Araba araba3 = null;  //null --> bu referans henuz belirli bir yeri gostermiyor
        
    }
    
    
}
