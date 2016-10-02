/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.calebe.ticketmachine.core.Troco;
import java.util.Iterator;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author leo_f
 */
public class TrocoTest {
    
    @Test 
    public void Troco(){
       Troco troco = new Troco(20);
       
    }
    
    
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
        public void testGetIterator() {
            System.out.println("getIterator");
            Troco troco = new Troco(20);
            Troco instance = troco;
            Iterator<PapelMoeda> expResult = null;
            Iterator<PapelMoeda> result = instance.getIterator();
    
            Assert.assertEquals(expResult, result);
            
            fail("The test case is a prototype.");
        }
    
}
