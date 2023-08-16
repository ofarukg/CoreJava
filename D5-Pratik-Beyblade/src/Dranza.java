
public class Dranza extends Beyblade {

    private String kutsalCanavar;

    public Dranza(String kutsalCanavar, String beybladeci, int donus_hizi, int saldiri_gucu) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("Kutsal Canavar: " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " i ortaya cikariyor"); 
        System.out.println(getBeybladeci() + " in Saldirisi: Alev Kilici " );
    }
    
    
    
    
    
}
