
public class Dragon extends Beyblade {

    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String kutsalCanavar, String gizliYetenek, String beybladeci, int donus_hizi, int saldiri_gucu) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("Kutsal Canavar: " + kutsalCanavar);
        System.out.println("Gizli Yetenek: " + gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " i ortaya cikariyor"); 
        System.out.println(getBeybladeci() + " in Saldirisi: Hayalet Kasirga " );
        
        
    }
    
    
    
    
    
    
}
