import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import java.util.*;



public class CalculatriceTest {

    private Calculatrice calculatrice;
    @BeforeEach
    public void setUp(){
        calculatrice = new Calculatrice();
    }

    @Test
    public void testAdd() {
        
        float result = calculatrice.add(2.0f, 2.0f);
        assertEquals(4.0f, result);
        System.out.println("test addition ok");
    }

    @Test 
    public void testMult() {
        float result = calculatrice.mult(2.0f, 2.0f);
        assertEquals(4.0f, result);
        System.out.println("test multiplication ok");

    }

    @Test
    public void testDiv() {
        float result = calculatrice.div(2.0f, 2.0f);
        assertEquals(1.0f, result);
        System.out.println("test division ok");

    }
    @Test
    public void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculatrice.div(5.0f, 0.0f);
        });
        System.out.println("Test sur la division par 0 ok");
    }
    @Test
    public void testMinus(){
        float result = calculatrice.minus(4.0f, 2.0f);
        assertEquals(2.0f, result);
        System.out.println("test minus ok");
    }

}

