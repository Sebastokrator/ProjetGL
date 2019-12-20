
import java.awt.*;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author af433882
 */
public class VueGAWT extends java.awt.Frame implements Observer{
    private Button dec;
    private Button inc;
    private Label affiche;

    public Button getDec() {
        return dec;
    }

    public Button getInc() {
        return inc;
    }

    public Label getAffiche() {
        return affiche;
    }

    public void setAffiche(Label affiche) {
        this.affiche = affiche;
    }
    
    
    public VueGAWT(){
        this.inc = new Button("+");
        this.inc.setName("Plus");
        this.dec = new Button("-");
        this.dec.setName("Moins");
        this.affiche = new Label("non initialiser");
        this.setTitle("Silo");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3,1));
        this.add(this.inc);
        this.add(this.affiche);
        this.add(this.dec);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        this.pack();
        this.setVisible(true);
    }   

    @Override
    public void update(Observable o, Object arg) {
        this.affiche.setText(""+((Silo)o).getNbElements());
    }
    public void ajoutControlleur(Controleur c){
        this.getInc().addActionListener(c);
        this.getDec().addActionListener(c);
    }
}
