
import org.example.Challenge;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ChallengeTest {
    @Test
    public void test1() {
        assertEquals(7, Challenge.towerHanoi(3));
    }

    @Test
    public void test2() {
        assertEquals(31, Challenge.towerHanoi(5));
    }

    @Test
    public void test3() {
        assertEquals(255, Challenge.towerHanoi(8));
    }

    @Test
    public void test4() {
        assertEquals(524287, Challenge.towerHanoi(19));
    }

    @Test
    public void test5() {
        assertEquals(511, Challenge.towerHanoi(9));
    }

    @Test
    public void test6() {
        assertEquals(8191, Challenge.towerHanoi(13));
    }

    @Test
    public void test7() {
        assertEquals(0, Challenge.towerHanoi(0));
    }

    @Test
    public void test8() {
        assertEquals(5, Challenge.missingNum(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}));
    }

    @Test
    public void test9() {
        assertEquals(10, Challenge.missingNum(new int[]{7, 2, 3, 6, 5, 9, 1, 4, 8}));
    }

    @Test
    public void test10() {
        assertEquals(1, Challenge.missingNum(new int[]{7, 2, 3, 9, 4, 5, 6, 8, 10}));

    }
}