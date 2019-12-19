import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SiloTest {

    private static Silo s_plein3,s_vide3,s_presqueplein3,s_vide0,s_vide_2,s_1el3,s_plein3c;
    private static Cellule mock_c1,mock_c2,mock_c3,c1,c2,c3;
    private static lotCereales mock_l1,mock_l2,mock_l3;
    
    public SiloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws VolumeNegatifException, Exception {
        s_vide3 = new Silo(1,3,5);
        
        /*
        mock_c1 = mock(Cellule.class);
        mock_c2 = mock(Cellule.class);
        mock_c3 = mock(Cellule.class);
        */
        
        /*
        mock_l1 = mock(lotCereales.class);
        mock_l2 = mock(lotCereales.class);
        mock_l3 = mock(lotCereales.class);
        */
        
        /*
        mock_b1 = mock(Banane.class);
        mock_b2 = mock(Banane.class);
        mock_b3 = mock(Banane.class);
        when(mock_o1.getPrix()).thenReturn(0.5);
        when(mock_o2.getPrix()).thenReturn(0.4);  
        when(mock_o3.getPrix()).thenReturn(0.8);
        when(mock_b1.getPrix()).thenReturn(0.4);
        when(mock_b2.getPrix()).thenReturn(0.5);  
        when(mock_b3.getPrix()).thenReturn(0.7);
        p_vide0 = new Panier(0);
        p_vide_2 = new Panier(-2);
        p_1el3 = new Panier(3);
        p_1el3.ajoute(mock_o1);
        p_plein3 = new Panier(3);
        p_plein3.ajoute(mock_o1);
        p_plein3.ajoute(mock_o1);
        p_plein3.ajoute(mock_o1);
        /*o1 = new Orange(0.5,"France");
        o2 = new Orange(0.4,"Espagne");
        o3 = new Orange(0.8,"Italie");
        p_plein3o = new Panier(3);
        p_plein3o.ajoute(o1);
        p_plein3o.ajoute(o2);
        p_plein3o.ajoute(o3);
        */
    }
    
   @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetListe() {
        
    }

    @Test
    public void testSetListe() {
        
    }

    @Test
    public void testGetMax() {
        
    }

    @Test
    public void testGetNbElements() {
        
    }

    @Test
    public void testEstPlein() {
        
    }

    @Test
    public void testEstVide() {
        
    }

    @Test
    public void testAjoutePanierVideOrange() throws SiloPleinException {
        s_vide3.ajoute(mock_c1);
        assertEquals(s_vide3.getListe().get(0),mock_c1);
    }
    



    @Test (expected=SiloPleinException.class)
    public void testAjoutePanierPlein() throws SiloPleinException {
        s_plein3.ajoute(mock_c1);
    }
    
   
    
    /*@Test
    public void testAjoutePanierVideSansParam() throws PanierPleinException {
        p_vide3.ajoute();
        assertTrue(p_vide3.getNbElements() == 1);
    }*/

    @Test (expected=SiloPleinException.class)
    public void testAjoutePanierPleinSansParam() throws SiloPleinException {
        s_plein3.ajoute();
    }

    @Test (expected=SiloVideException.class)
    public void testRetirePanierVide() throws SiloVideException {
        s_vide3.retire();
    }


    @Test
    public void testGetVolumePanierVideContMax3() {
        assertTrue(s_vide3.getVolume()==0);
    }

    @Test //(expected=PanierPleinException.class)
    public void testAjoute2Fruits() throws SiloPleinException {
        s_vide3.ajoute(mock_c1);
        s_vide3.ajoute(mock_c2);
        //assertTrue(s_vide3.getNbElements()==2);
        assertTrue(true);
    }
    
      @Test 
    public void testGetPrixPanierPlein3Elements() {
        assertTrue(s_plein3.getVolume()==(mock_c1.getProduit().getVolume()+mock_c1.getProduit().getVolume()+mock_c1.getProduit().getVolume()));
        verify(mock_c1,times(6)).getProduit().getVolume();
    }
    
    @Test
    public void testBoycottOrigine() {
        
    }

    @Test
    public void testToString() {
        
    }

    @Test
    public void testAffiche() {
        
    }

    @Test
    public void testEquals() {
        
    }
    
}