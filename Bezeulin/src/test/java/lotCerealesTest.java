
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class lotCerealesTest {
    
    public lotCerealesTest() {
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
     * Test of getIdProduit method, of class lotCereales.
     */
    @Test
    public void testGetIdProduit() {
        System.out.println("getIdProduit");
        lotCereales instance = new lotCerealesImpl();
        int expResult = 0;
        int result = instance.getIdProduit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProvenance method, of class lotCereales.
     */
    @Test
    public void testGetProvenance() {
        System.out.println("getProvenance");
        lotCereales instance = new lotCerealesImpl();
        String expResult = "";
        String result = instance.getProvenance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class lotCereales.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        lotCereales instance = new lotCerealesImpl();
        String expResult = "";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class lotCereales.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        lotCereales instance = new lotCerealesImpl();
        int expResult = 0;
        int result = instance.getVolume();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdProduit method, of class lotCereales.
     */
    @Test
    public void testSetIdProduit() {
        System.out.println("setIdProduit");
        int id = 0;
        lotCereales instance = new lotCerealesImpl();
        instance.setIdProduit(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProvenance method, of class lotCereales.
     */
    @Test
    public void testSetProvenance() {
        System.out.println("setProvenance");
        String p = "";
        lotCereales instance = new lotCerealesImpl();
        instance.setProvenance(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination method, of class lotCereales.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String d = "";
        lotCereales instance = new lotCerealesImpl();
        instance.setDestination(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVolume method, of class lotCereales.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        int v = 0;
        lotCereales instance = new lotCerealesImpl();
        instance.setVolume(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class lotCerealesImpl implements lotCereales {

        public int getIdProduit() {
            return 0;
        }

        public String getProvenance() {
            return "";
        }

        public String getDestination() {
            return "";
        }

        public int getVolume() {
            return 0;
        }

        public void setIdProduit(int id) {
        }

        public void setProvenance(String p) {
        }

        public void setDestination(String d) {
        }

        public void setVolume(int v) {
        }
    }
    
}
