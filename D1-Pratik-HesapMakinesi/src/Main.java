
import java.util.Scanner;


public class Main {

    public static int cikarma(int a, int b){
    
    return(a-b);
    }
    
    public static double bolme(int a, int b){
    
    return((double)a/b);
    
    }
    
    public static int toplama(int a, int b){
    
    return (a+b);
    }
    
    public static int toplama(int a, int b, int c){
    
    return (a+b+c);
    }
    
    public static int carpma(int a, int b){
    
    return (a*b);
    }
    
    public static int carpma(int a, int b, int c){
    
    return (a*b*c);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String islemler =   "1. Toplama Islemi\n"
                +           "2. Cikarma Islemi \n"
                +           "3. Carpma Islemi \n"
                +           "4. Bolme Islemi \n"
                +           "Cikis icin q ya basiniz ";
        
                System.out.println("****************************************");
                System.out.println(islemler);
                System.out.println("****************************************");
        
        
                while (true) {
                    
                    System.out.println("Islemi Seciniz");
                    String islem = scanner.nextLine();
                    
                    if (islem.equals("q")) {
                    
                        System.out.println("Programdan Cikiliyor");
                        break;
                    
                    }
                    
                    else if (islem.equals("1")) {
                    
                        System.out.println("Kac deger toplayacaksiniz (2 veya 3)");
                        
                        String deger = scanner.nextLine();
                        
                        if (deger.equals("2")) {
                            
                            System.out.println("Lutfen Toplam Istediginiz Degerleri Giriniz");
                            int a = scanner.nextInt();
                            int b = scanner.nextInt();
                            scanner.nextLine();
                            
                            System.out.println("Sonuc: " + toplama(a, b));
                        } 
                        else if (deger.equals("3")) {
                            System.out.println("Lutfen Toplam Istediginiz Degerleri Giriniz");
                            int a = scanner.nextInt();
                            int b = scanner.nextInt();
                            int c = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Sonuc: " + toplama(a, b, c));
                        }
                    }
                    
                    
                    
                    
                    else if (islem.equals("2")) {
                        
                        System.out.println("Lutfen Cikarmak Istediginiz Degerleri Giriniz");
                        
                            int a = scanner.nextInt();
                            int b = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Sonuc: " + cikarma(a, b));
                    
                    }
                    
                    
                    
                    else if (islem.equals("3")) {
                    
                        System.out.println("Kac deger carpmak istiyorsunuz? (2 veya 3)");
                        String deger = scanner.nextLine();
                        if (deger.equals("2")) {
                            System.out.println("Lutfen Carpmak Istediginiz Degerleri Giriniz");
                            int a = scanner.nextInt();
                            int b = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Sonuc: " + carpma(a, b));
                            
                             
                        }
                        else if (deger.equals("3")) {
                            System.out.println("Lutfen Carpmak Istediginiz Degerleri Giriniz");
                            int a = scanner.nextInt();
                            int b = scanner.nextInt();
                            int c = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Sonuc: " + carpma(a, b, c));
                        }
                    }
                    
                    
                    
                    else if (islem.equals("4")) {
                    
                        System.out.println("Lutfen Bolmek Istediginiz degerleri giriniz");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Sonuc: " + bolme(a, b));
                    }
                    
                    else {System.out.println("Hatali Secim Yaptiniz");
                        System.out.println(islemler);
                            }
                    
            
        }
        
        
        
    }
    
    
}
