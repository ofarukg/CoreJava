
public class Idman {

    private int burpee;
    private int pushup;
    private int situp;
    private int squat;

    public Idman(int burpee, int pushup, int situp, int squat) {
        this.burpee = burpee;
        this.pushup = pushup;
        this.situp = situp;
        this.squat = squat;
    }

    public int getBurpee() {
        return burpee;
    }

    public void setBurpee(int burpee) {
        this.burpee = burpee;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }
    
    
    public void hareketyap(String hareket, int sayi){
    
        if(hareket.equals("Burpee")){
            burpeeYap(sayi);
        }
        else if(hareket.equals("Pushup")){
            pushupYap(sayi);
        }
        else if(hareket.equals("Squat")){
            squatYap(sayi);
        }
        else if(hareket.equals("Situp")){
            situpYap(sayi);
        }
        else{System.out.println("Gecersiz Hareket");}
    }
    
    public void burpeeYap(int sayi){
    
        if(burpee==0){System.out.println("Burpee bitti");}
        if(burpee<sayi){System.out.println("Hedefinin onundesin");
        burpee=0; 
        }
    
        else{burpee-=sayi;
            System.out.println("Kalan Burpee: " + burpee);}
    }
    
    public void pushupYap(int sayi){
    
        if(pushup==0){System.out.println("pushup bitti");}
        if(pushup<sayi){System.out.println("Hedefinin onundesin");
        pushup=0; 
        }
    
        else{pushup-=sayi;
            System.out.println("Kalan pushup: " + pushup);}
    }
    public void squatYap(int sayi){
    
        if(squat==0){System.out.println("squat bitti");}
        if(squat<sayi){System.out.println("Hedefinin onundesin");
        squat=0; 
        }
    
        else{squat-=sayi;
            System.out.println("Kalan squat: " + squat);}
    }
    public void situpYap(int sayi){
    
        if(situp==0){System.out.println("situp bitti");}
        if(situp<sayi){System.out.println("Hedefinin onundesin");
        situp=0; 
        }
    
        else{situp-=sayi;
            System.out.println("Kalan situp: " + situp);}
    }
    
    
    public boolean idmanBittimi(){
    
        return (burpee==0) && (situp==0) && (squat==0)  && (pushup==0);
        
    }
    
    
    
    
    
    
}
