import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeamsSelectionTest {

    protected TeamsSelection solution;

    @Before
    public void setUp() {
        solution = new TeamsSelection();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] preference1 = new int[]{1, 2, 3, 4};
        int[] preference2 = new int[]{1, 2, 3, 4};

        String expected = "1212";
        String actual = solution.simulate(preference1, preference2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] preference1 = new int[]{3, 2, 1};
        int[] preference2 = new int[]{1, 3, 2};

        String expected = "211";
        String actual = solution.simulate(preference1, preference2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] preference1 = new int[]{6, 1, 5, 2, 3, 4};
        int[] preference2 = new int[]{1, 6, 3, 4, 5, 2};

        String expected = "212211";
        String actual = solution.simulate(preference1, preference2);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] preference1 = new int[]{8, 7, 1, 2, 4, 5, 6, 3, 9};
        int[] preference2 = new int[]{7, 2, 4, 8, 1, 5, 9, 6, 3};

        String expected = "121121212";
        String actual = solution.simulate(preference1, preference2);

        Assert.assertEquals(expected, actual);
    }

}
