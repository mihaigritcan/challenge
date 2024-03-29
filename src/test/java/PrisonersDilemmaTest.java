import static org.junit.Assert.assertArrayEquals;
import org.example.PrisonersDilemma;
import org.junit.Test;

public class PrisonersDilemmaTest {
    @Test
    public void test01() {
        assertArrayEquals(new int[] {5, 5}, PrisonersDilemma.getCoinBalances(new String[] {"share"}, new String[] {"share"}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[] {6, 2}, PrisonersDilemma.getCoinBalances(new String[] {"steal"}, new String[] {"share"}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[] {2, 6}, PrisonersDilemma.getCoinBalances(new String[] {"share"}, new String[] {"steal"}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[] {3, 3}, PrisonersDilemma.getCoinBalances(new String[] {"steal"}, new String[] {"steal"}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[] {3, 11}, PrisonersDilemma.getCoinBalances(new String[] {"share", "share", "share"}, new String[] {"steal", "share", "steal"}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[] {0, 12}, PrisonersDilemma.getCoinBalances(new String[] {"share", "share", "steal", "share"}, new String[] {"steal", "steal", "steal", "steal"}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[] {12, 0}, PrisonersDilemma.getCoinBalances(new String[] {"steal", "steal", "steal"}, new String[] {"share", "share", "share"}));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[] {7, 7}, PrisonersDilemma.getCoinBalances(new String[] {"share", "share"}, new String[] {"share", "share"}));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[] {11, 3}, PrisonersDilemma.getCoinBalances(new String[] {"share", "steal", "steal", "steal"}, new String[] {"share", "share", "steal", "share"}));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[] {3, 11}, PrisonersDilemma.getCoinBalances(new String[] {"share", "share", "steal", "share"}, new String[] {"steal", "share", "steal", "steal"}));
    }

    @Test
    public void test11() {
        assertArrayEquals(new int[] {3, 3}, PrisonersDilemma.getCoinBalances(new String[] {"steal", "steal", "steal", "steal"}, new String[] {"steal", "steal", "steal", "steal"}));
    }

    @Test
    public void test12() {
        assertArrayEquals(new int[] {8, 4}, PrisonersDilemma.getCoinBalances(new String[] {"steal", "share", "steal", "steal"}, new String[] {"share", "share", "steal", "steal"}));
    }

    @Test
    public void test13() {
        assertArrayEquals(new int[] {9, 1}, PrisonersDilemma.getCoinBalances(new String[] {"steal", "steal"}, new String[] {"share", "share"}));
    }

    @Test
    public void test14() {
        assertArrayEquals(new int[] {5, 5}, PrisonersDilemma.getCoinBalances(new String[] {"steal", "share"}, new String[] {"share", "steal"}));
    }
}
// credit goes to the original author/publisher @Joshua Señoron