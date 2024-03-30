import org.example.RemoveDups;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RemoveDupsTest {
    @Test
    public void test0(){assertArrayEquals(new int[]{1, 0}, RemoveDups.removeDups(new int[]{1, 0, 1, 0}));}
    @Test
    public void test1(){assertArrayEquals(new String[]{"John", "Taylor"}, RemoveDups.removeDups(new String[]{"John", "Taylor", "John"}));}

}
