/**
  * DO NOT EDIT THIS FILE 
  * author: Ronny Hartanto (2022)
  */

  import static org.junit.jupiter.api.Assertions.assertEquals;
  import static org.junit.jupiter.api.Assertions.assertTrue;
  import static org.junit.jupiter.api.Assertions.assertFalse;
 
  import org.junit.jupiter.api.Test;
 
  import java.io.*;
 
  public class TestExercise03b {
 
    @Test
     public void test01()
     {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        CryptoCurrency CryptoCurrency = new CryptoCurrency("BTC", "Bitcoin");
        assertEquals("BTC", CryptoCurrency.getSymbol());
        assertEquals("Bitcoin", CryptoCurrency.getName());
        System.setOut(originalOut);
     } 
     @Test
     public void test02()
     {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        CryptoCurrency CryptoCurrency = new CryptoCurrency("BTC", "Bitcoin");
        assertEquals("BTC", CryptoCurrency.getSymbol());
        assertEquals("Bitcoin", CryptoCurrency.getName());
        CryptoCurrency.setSymbol("ETH");
        CryptoCurrency.setName("Ethereum");
        assertEquals("ETH", CryptoCurrency.getSymbol());
        assertEquals("Ethereum", CryptoCurrency.getName());
        System.setOut(originalOut);
     }      
     @Test
     public void test03()
     {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        CryptoCurrency CryptoCurrency = new CryptoCurrency("BTC", "Bitcoin");
        assertEquals("BTC", CryptoCurrency.getSymbol());
        assertEquals("Bitcoin", CryptoCurrency.getName());        
        CryptoCurrency.setCurrentPrice(34.5);
        CryptoCurrency.setCurrentPrice(34.35);
        assertEquals(34.5, CryptoCurrency.getPreviousClosingPrice());
        assertEquals(34.35, CryptoCurrency.getCurrentPrice());
        System.out.println(CryptoCurrency.getChangePercent());
        assertEquals(-0.434782087, CryptoCurrency.getChangePercent(), 0.0001);
        CryptoCurrency.setCurrentPrice(100);
        CryptoCurrency.setCurrentPrice(99.9);    
        assertEquals(-0.1, CryptoCurrency.getChangePercent(), 0.0001);
        System.setOut(originalOut);
     }
     @Test
     public void test04()
     {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        CryptoCurrency CryptoCurrency = new CryptoCurrency("BTC", "Bitcoin");
        assertEquals("BTC", CryptoCurrency.getSymbol());
        assertEquals("Bitcoin", CryptoCurrency.getName());        
        CryptoCurrency.setCurrentPrice(100.0);
        CryptoCurrency.setCurrentPrice(150.0);
        assertEquals(100.0, CryptoCurrency.getPreviousClosingPrice());
        assertEquals(150.0, CryptoCurrency.getCurrentPrice());
        assertEquals(125.0, CryptoCurrency.getAveragePrice());
        CryptoCurrency.setCurrentPrice(50.0);
        assertEquals(100.0, CryptoCurrency.getAveragePrice());
        System.out.println(CryptoCurrency.getChangePercent());
        CryptoCurrency.setCurrentPrice(75.0);
        CryptoCurrency.setCurrentPrice(125.0);
        assertEquals(100.0, CryptoCurrency.getAveragePrice());
        for(int i=1; i<=5; i++) {
            CryptoCurrency.setCurrentPrice(100*i/5);
        }
        assertEquals(80.0, CryptoCurrency.getAveragePrice());
        CryptoCurrency.setCurrentPrice(100);
        CryptoCurrency.setCurrentPrice(99.9);    
        assertEquals(-0.1, CryptoCurrency.getChangePercent(), 0.0001);
        System.setOut(originalOut);
     }         
}