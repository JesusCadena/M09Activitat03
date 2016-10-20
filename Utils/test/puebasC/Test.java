package puebasC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import utils.EdatError;
import utils.InverteixErrorException;
import utils.MyUtils;
import static utils.MyUtils.inverteix;

/**
 *
 * @author ALUMNEDAM
 */
@RunWith (Parameterized.class)
public class Test{
    private String palabra;
    private String error;
   
//    @Parameters
//    public static List<Object[][]> datos(){
//        return Arrays.asList(new Object[]){
//        {"hola"},{"hola"}
//           
//    });
//    }

    public Test(String palabra, String error) {
        this.palabra = palabra;
        this.error = error;
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
     public final void inverteix() throws InverteixErrorException {
         assertEquals("aloh",MyUtils.inverteix(palabra),"aloh");
     }
//     @Test
//     public final void edat() throws EdatError{
//         assertEquals();
//     }
}
