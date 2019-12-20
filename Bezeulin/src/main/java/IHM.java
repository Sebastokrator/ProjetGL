import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class IHM extends javax.swing.JFrame implements Observer{
    
    public static void main(String args[]) throws Exception {
        IHM fenetre = new IHM();
        fenetre.setVisible(true);
    }
    
    public IHM() throws Exception{
        initComponents();
        comboBox.addItem("Blé");
        comboBox.addItem("Orge");
        comboBox.addItem("Colza");
        comboBox.addItem("Avoine");
        
        this.btPlus.setName("Plus Orange");
        this.btMoins.setName("Moins");
        
        Silo s = new Silo(1,10,10);
        s.addObserver(this);
        for(int i=0; i< s.getCellulesDisponibles();i++)
            s.ajoute(new Cellule());

        this.ajoutControlleur(new Controleur(s));
        System.out.println(s.toString());
    }
    
    private void initComponents() {

        btMoins = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        affichage = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btPlus = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox();
        btMoins.setText("-");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(btMoins, java.awt.BorderLayout.SOUTH);

        affichage.setColumns(20);
        affichage.setRows(5);
        jScrollPane1.setViewportView(affichage);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        btPlus.setText("+");
        jPanel1.add(btPlus);

        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(comboBox);

        this.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }
    
    private javax.swing.JTextArea affichage;
    private javax.swing.JButton btMoins;
    private javax.swing.JButton btPlus;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   


    public void update(Observable o, Object o1) {
        Silo s = (Silo)o;
        int nbCellules = s.getNbElements();
        int orge = 0;
        int ble = 0;
        int colza = 0;
        int avoine = 0;
        
        
        for(lotCereales lc : s.getCereales()){
            if(lc instanceof Orge)
                orge++;
            if(lc instanceof Ble)
                ble++;
            if(lc instanceof Colza)
                colza++;
            if(lc instanceof Avoine)
                avoine++;
        }
        
        String txt = nbCellules + " Cellules dans ce silo\n"
                + orge + " orge\n"
                + ble + " blé\n"
                + colza + " colza\n"
                + avoine + " avoine";
        this.affichage.setText(txt);
    }
    
    public void ajoutControlleur(Controleur c){
        this.btPlus.addActionListener(c);
        this.btMoins.addActionListener(c);
    }
    
    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
        btPlus.setName("Plus "+comboBox.getSelectedItem().toString());
    } 
}

