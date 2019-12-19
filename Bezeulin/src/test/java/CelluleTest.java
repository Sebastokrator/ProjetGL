import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CelluleTest {
    
    public CelluleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of getConcentrationH2S method, of class Cellule.
     */
    @Test
    public void testGetConcentrationH2S() {
        System.out.println("getConcentrationH2S");
        Cellule instance = new Cellule();
        float expResult = 0.0F;
        float result = instance.getConcentrationH2S();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConcentrationCH4 method, of class Cellule.
     */
    @Test
    public void testGetConcentrationCH4() {
        System.out.println("getConcentrationCH4");
        Cellule instance = new Cellule();
        float expResult = 0.0F;
        float result = instance.getConcentrationCH4();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemperature method, of class Cellule.
     */
    @Test
    public void testGetTemperature() {
        System.out.println("getTemperature");
        Cellule instance = new Cellule();
        float expResult = 0.0F;
        float result = instance.getTemperature();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHumidite method, of class Cellule.
     */
    @Test
    public void testGetHumidite() {
        System.out.println("getHumidite");
        Cellule instance = new Cellule();
        float expResult = 0.0F;
        float result = instance.getHumidite();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduit method, of class Cellule.
     */
    @Test
    public void testGetProduit() {
        System.out.println("getProduit");
        Cellule instance = new Cellule();
        lotCereales expResult = null;
        lotCereales result = instance.getProduit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nettoyer method, of class Cellule.
     */
    @Test
    public void testNettoyer() {
        System.out.println("nettoyer");
        Cellule instance = new Cellule();
        instance.nettoyer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ventiler method, of class Cellule.
     */
    @Test
    public void testVentiler() {
        System.out.println("ventiler");
        Cellule instance = new Cellule();
        instance.ventiler();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aspirer method, of class Cellule.
     */
    @Test
    public void testAspirer() {
        System.out.println("aspirer");
        Cellule instance = new Cellule();
        instance.aspirer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desinsectisation method, of class Cellule.
     */
    @Test
    public void testDesinsectisation() {
        System.out.println("desinsectisation");
        Cellule instance = new Cellule();
        instance.desinsectisation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alarme method, of class Cellule.
     */
    @Test
    public void testAlarme() {
        System.out.println("alarme");
        Cellule instance = new Cellule();
        instance.alarme();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
