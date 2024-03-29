import org.junit.Test;

import static org.example.SimpleClass.diff;
import static org.example.SimpleClass.sum;
import static org.junit.Assert.assertEquals;

public class SimpleClassTest {
    @Test
    public void test1(){
        assertEquals(5,sum(2,3));
    }
    @Test
    public void test2(){
        assertEquals(5,diff(5,10));
    }
}
