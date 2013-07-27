import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LISNumberDivTwoTest {

    protected LISNumberDivTwo solution;

    @Before
    public void setUp() {
        solution = new LISNumberDivTwo();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] seq = new int[]{1, 4, 4, 2, 6, 3};

        int expected = 4;
        int actual = solution.calculate(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] seq = new int[]{5, 8, 9, 12, 16, 32, 50};

        int expected = 1;
        int actual = solution.calculate(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] seq = new int[]{1, 1, 9, 9, 2, 2, 3, 3};

        int expected = 6;
        int actual = solution.calculate(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] seq = new int[]{50, 40, 30, 20, 10};

        int expected = 5;
        int actual = solution.calculate(seq);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] seq = new int[]{42};

        int expected = 1;
        int actual = solution.calculate(seq);

        Assert.assertEquals(expected, actual);
    }

}
