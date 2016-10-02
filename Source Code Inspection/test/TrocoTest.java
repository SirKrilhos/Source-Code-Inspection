/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.calebe.ticketmachine.core.PapelMoeda;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leo_f
 */
public class TrocoTest {
    
    public TrocoTest() {
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
     * Test of getIterator method, of class Troco.
     */
    
    @Test
    public void Troco(){
        
    }
    
    
    
    
    @Test
    public void testGetIterator() {
        System.out.println("getIterator");
        Troco troco = new Troco(20);
        Troco instance = troco;
        Iterator<PapelMoeda> expResult = ;
        Iterator<PapelMoeda> result = instance.getIterator();




//        assertEquals(, );
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
