/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Ejemplo.Prueba;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author JoséIgnacio
 */
public class PruebaTest {
    private Prueba prueba = new Prueba();
    public PruebaTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        prueba.setRut(null);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void Nulo(){
    assertNotNull("Valor Nulo", prueba.getRut());
    }
    
    @Test
    public void ComparacionBolean(){
    boolean retorno = prueba.ValidaRUT();
    assertEquals(true, retorno);
    }
}