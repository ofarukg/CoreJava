
import java.util.*;


public class Main {

    public static void main(String[] args) {
        
        Queue<Hasta> acil_servis = new PriorityQueue<Hasta>();
        
        
        acil_servis.offer(new Hasta("Murat", "Yanik"));
        acil_servis.offer(new Hasta("Okan", "Bas Agrisi"));
        acil_servis.offer(new Hasta("Elif", "Apandisit"));
        acil_servis.offer(new Hasta("Oguz", "Yanik"));
        acil_servis.offer(new Hasta("Merve", "Yanik"));
        acil_servis.offer(new Hasta("Gizem", "Apandisit"));
        
        int i = 1;
        
        while (acil_servis.isEmpty() != true) {            
            System.out.println("*******************************************");
            System.out.println(i + ". sirada");
            System.out.println(acil_servis.poll());
            i++;
        }
        
        
    }
    
}
