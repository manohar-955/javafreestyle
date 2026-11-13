package test.java.com.example;

import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;
    
public class test {
    

    
        @Test
        public void testAddition() {
    
            App obj = new App();
    
            int result = obj.add(10, 20);
    
            assertEquals(30, result);
    

}
    }
