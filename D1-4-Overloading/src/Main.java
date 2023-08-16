
public class Main {
    
    public static void toplama(String a, String b){
    
        System.out.println(a+ " ve " + b);
    
    }

    public static void toplama(int a, int b, int c){
    
        System.out.println("Toplam: " + (a+b+c));
    
    }
    
    public static void toplama(int a, int b){
    
        System.out.println("toplam: " + (a+b));
    
    }
    
    
    
    public static void main(String[] args) {
        
        
        toplama(3, 4, 5);
        
        toplama(45, 45);
        
        toplama("Omer", "Faruk");
        
    }
    
    
}
