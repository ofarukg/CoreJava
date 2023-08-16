
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Calisan personel_batuhan = new Calisan("Batuhan", "Demir", "101");
        Calisan personel_beyto = new Calisan("Beytullah", "Simsek", "102");
        Calisan personel_burak = new Calisan("Burak", "Arpa", "104");
        Yazilimci personel_eto = new Yazilimci("Ertugrul", "Karamagara", "105", "Ingilizce");
        Yazilimci personel_muco = new Yazilimci("Mucahit", "Simsek", "106", "Fransizca");
        Yonetici personel_ekrem =new Yonetici(4, "Ekrem", "Arpa", "103");
        
        
        System.out.println("**************************************");
        System.out.println("Personel Kontrol Sistemine Hosgeldiniz");
        System.out.println("**************************************");
        
        String islemler = "**** \n"
                + "1. Iscileri Gor \n"
                + "2. Yazilimcilari Gor \n"
                + "3. Yoneticiyi Gor \n"
                + "4. Cikis Yap";
        
        while (true) {            
            
            System.out.println(islemler);
            System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz");
            
            int islem = scanner.nextInt();
            
            if(islem ==1){
                
                while(true){
                
                    System.out.println("1. Batuhan Demir \n"
                        + "2. Beytullah Simsek \n"
                        + "3. Burak Arpa \n"
                        + "4. Geri Don");
                    int buton = scanner.nextInt();
                
                    if(buton==1){
                        personel_batuhan.bilgilerigoster();
                        System.out.println("Pezevengi Calistirmak Icin 1, Isci listesine tekrar donmek icin 2 ye basiniz ");
                        int bas = scanner.nextInt();
                            if(bas ==1){personel_batuhan.calis(); break;}
                            else if(bas == 2){break;}
                            else{System.out.println("Hatali Secim");}
                            }
                    
                    
                    if(buton==2){
                        personel_beyto.bilgilerigoster();
                        System.out.println("Pezevengi Calistirmak Icin 1, Isci listesine tekrar donmek icin 2 ye basiniz ");
                        int bas = scanner.nextInt();
                            if(bas ==1){personel_beyto.calis(); break;}
                            else if(bas == 2){break;}
                            else{System.out.println("Hatali Secim");}
                            }
                    
                    if(buton==3){
                        personel_burak.bilgilerigoster();
                        System.out.println("Pezevengi Calistirmak Icin 1, Isci listesine tekrar donmek icin 2 ye basiniz ");
                        int bas = scanner.nextInt();
                            if(bas ==1){personel_burak.calis(); break;}
                            else if(bas == 2){break;}
                            else{System.out.println("Hatali Secim");}
                            }
                    
                    if(buton==4){break;}
                    else{System.out.println("Hatali Secim");}
                }
            }
            
            else if(islem==2){
                
                while(true){
                    System.out.println("Yazilimcilar \n"
                            + "1. Ertugrul Karamagara \n"
                            + "2. Mucahit Simsek \n"
                            + "3. Geri Don");
                    int buton = scanner.nextInt();
                    
                    if(buton==1){
                    personel_eto.bilgilerigoster();
                        System.out.println("Ne yapsin bu pezevenk: \n"
                                + "1. Calissin \n"
                                + "2. Format Atsin \n"
                                + "3. Geri Don");
                        int bas = scanner.nextInt();
                            if(bas==1){personel_eto.calis();}
                            else if(bas==2){personel_eto.formatAt("Linux"); break;}
                            else if(bas==3){break;}
                            else{System.out.println("Hatali Islem");}
                    }
                    else if(buton==2){
                    
                    personel_muco.bilgilerigoster();
                        System.out.println("Ne yapsin bu pezevenk: \n"
                                + "1. Calissin \n"
                                + "2. Format Atsin \n"
                                + "3. Geri Don");
                        int bas = scanner.nextInt();
                            if(bas==1){personel_muco.calis();}
                            else if(bas==2){personel_muco.formatAt("Windows"); break;}
                            else if(bas==3){break;}
                            else{System.out.println("Hatali Islem");}
                    }
                    else if(buton==3){break;}
                    else{System.out.println("Hatali Secim Yaptiniz");}
                
                
                }
            
            }
            
            else if(islem==3){
                personel_ekrem.bilgilerigoster();
                System.out.println("Zam Yapsin mi pezo? \n"
                        + "1. evet \n"
                        + "2. hayir");
                int bas=scanner.nextInt();
                    
                    if(bas==1){ personel_ekrem.zamYap(500); }
                    else if(bas==2){System.out.println("Zam yapmadi pezo :( "); }
                    else{System.out.println("Hatali Secim");}
            
            }
            
            else if(islem==4){return;}
            else{System.out.println("Hatali Secim");}
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            }
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
    }
    
    
    

