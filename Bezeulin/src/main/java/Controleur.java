
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controleur  implements ActionListener{
    
    private Silo silo;

    public Controleur(Silo s) {
        this.silo = s;
    }

    public Silo getSilo() {
        return silo;
    }

    public void setSilo(Silo s) {
        this.silo = s;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(((Component)e.getSource()).getName().equals("Plus Orge")){          
                System.out.println("plus");
                silo.ajouterCereales(new Orge());
                System.out.println("cellules"+silo.getCellulesDisponibles());
            }else if(((Component)e.getSource()).getName().equals("Plus Ble")){      
                System.out.println("plus");
                silo.ajouterCereales(new Ble());
            }else if(((Component)e.getSource()).getName().equals("Plus Colza")){          
                System.out.println("plus");
                silo.ajouterCereales(new Colza());  
            }else if(((Component)e.getSource()).getName().equals("Plus Avoine")){      
                System.out.println("plus");
                silo.ajouterCereales(new Avoine());
                
            }else{
                //System.out.println("moins");
                //silo.retire();
            }
        } catch (Exception ex) {
           System.out.println("le silo est plein");
        }
    }

    
}