
public class EvYap {

    public static void main(String[] args) {
        
    
        Ev mustakilev = new Ev();
        
        mustakilev.setYuzolcumu("250 metrekare");
        System.out.println("Evin yuz olcumu ne kadar? "+mustakilev.getYuzolcumu());
        
        mustakilev.setPencere(7);
        System.out.println("Evde kac pencere var? "+mustakilev.getPencere());
        
        mustakilev.setMaliyet(25000000);
        System.out.println("Evin maliyeti ne kadar? "+mustakilev.getMaliyet());
        
        mustakilev.setKatsayisi(3);
        System.out.println("Ev kac katli? "+mustakilev.getKatsayisi());
        
        mustakilev.setBalkonsayisi("7");
        System.out.println("Evde kac balkon var? "+mustakilev.getBalkonsayisi());
        
        mustakilev.setBahcevarmi("Cok var");
        System.out.println("Evin bahcesi var mi? " +mustakilev.getBahcevarmi());
        
        
        
        
        
        
        
        
        
        
        
    }
       
}
