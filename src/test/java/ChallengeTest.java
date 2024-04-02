
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
    @Test
    public void test11() {
        assertEquals("Boom!", Challenge.sevenBoom(new int[]{2, 6, 7, 9, 3}));
    }

    @Test
    public void test12() {
        assertEquals("there is no 7 in the array", Challenge.sevenBoom(new int[]{33, 68, 400, 5}));
    }

    @Test
    public void test13() {
        assertEquals("there is no 7 in the array", Challenge.sevenBoom(new int[]{86, 48, 100, 66}));
    }

    @Test
    public void test14() {
        assertEquals("Boom!", Challenge.sevenBoom(new int[]{76, 55, 44, 32}));
    }

    @Test
    public void test15() {
        assertEquals("Boom!", Challenge.sevenBoom(new int[]{35, 4, 9, 37}));
    }
    private String[] strVector = new String[] {"rascal", "racecar", "madam", "adieu", "radar", "rotor", "abacus", "rotator", "scholars"};
    private boolean[] resVector = new boolean[] {false, true, true, false, true, true, false, true, false};

    @Test
    public void test01() {
        assertEquals(resVector[0],Challenge.isPalindrome(strVector[0]));
    }

    @Test
    public void test02() {
        assertEquals(resVector[1],Challenge.isPalindrome(strVector[1]) );
    }

    @Test
    public void test03() {
        assertEquals(Challenge.isPalindrome(strVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(Challenge.isPalindrome(strVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(Challenge.isPalindrome(strVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(Challenge.isPalindrome(strVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(Challenge.isPalindrome(strVector[6]), resVector[6]);
    }

    @Test
    public void test08() {
        assertEquals(Challenge.isPalindrome(strVector[7]), resVector[7]);
    }

    @Test
    public void test09() {
        assertEquals(Challenge.isPalindrome(strVector[8]), resVector[8]);
    }
}