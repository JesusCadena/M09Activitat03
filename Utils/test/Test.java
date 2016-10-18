/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import utils.EdatError;
import utils.InverteixError;
import static utils.MyUtils.inverteix;

/**
 *
 * @author ALUMNEDAM
 */
public class Test {
    
    public Test() {
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    
     @Test
     public final void inverteix() throws InverteixError {
         assertEquals("alohh",utils.MyUtils.inverteix("hola"));
     }
     @Test
     public final void edat() throws EdatError{
         assertEquals("30-12-2000",16,utils.MyUtils.edat(30, 12, 2000));
     }
}
