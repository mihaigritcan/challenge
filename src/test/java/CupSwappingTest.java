import static org.junit.Assert.assertEquals;

import org.example.CupSwapping;
import org.junit.Test;

public class CupSwappingTest {
    @Test
    public void test01() {
        assertEquals("C", CupSwapping.cupSwapping(new String[] {"AB", "CA"}));
    }

    @Test
    public void test02() {
        assertEquals("C", CupSwapping.cupSwapping(new String[] {"AB", "CA", "AB"}));
    }

    @Test
    public void test03() {
        assertEquals("B", CupSwapping.cupSwapping(new String[] {"AC", "CA", "CA", "AC"}));
    }

    @Test
    public void test04() {
        assertEquals("A", CupSwapping.cupSwapping(new String[] {"BA", "AC", "CA", "BC"}));
    }

    @Test
    public void test05() {
        assertEquals("A", CupSwapping.cupSwapping(new String[] {"BC", "CB", "CA", "BA"}));
    }

    @Test
    public void test06() {
        assertEquals("C", CupSwapping.cupSwapping(new String[] {"BC"}));
    }

    @Test
    public void test07() {
        assertEquals("B", CupSwapping.cupSwapping(new String[] {"BA", "CA", "CB", "CA"}));
    }

    @Test
    public void test08() {
        assertEquals("B", CupSwapping.cupSwapping(new String[] {}));
    }
}