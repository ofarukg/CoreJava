public class Deneme{

  
    public static boolean asal(int sayi){
    
        for (int i = 2; i <sayi; i++) {
            
            if(sayi%i==0){return false;}
            
        }
        
    return true;
    
    }
    
    public static void main(String[] args) {
   
        for (int b = 2; b < 1000; b++) {
            
            if(asal(b)){System.out.println(b+" asal sayidir");}
            
        }
        
}
    
    
}