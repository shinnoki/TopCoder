import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PiecewiseLinearFunctionDiv2Test {

    protected PiecewiseLinearFunctionDiv2 solution;

    @Before
    public void setUp() {
        solution = new PiecewiseLinearFunctionDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] Y = new int[]{1, 4, -1, 2};
        int[] query = new int[]{-2, -1, 0, 1};

        int[] expected = new int[]{0, 1, 2, 3};
        int[] actual = solution.countSolutions(Y, query);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] Y = new int[]{0, 0};
        int[] query = new int[]{-1, 0, 1};

        int[] expected = new int[]{0, -1, 0};
        int[] actual = solution.countSolutions(Y, query);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] Y = new int[]{2, 4, 8, 0, 3, -6, 10};
        int[] query = new int[]{0, 1, 2, 3, 4, 0, 65536};

        int[] expected = new int[]{3, 4, 5, 4, 3, 3, 0};
        int[] actual = solution.countSolutions(Y, query);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] Y = new int[]{-178080289, -771314989, -237251715, -949949900, -437883156, -835236871, -316363230, -929746634, -671700962};
        int[] query = new int[]{-673197622, -437883156, -251072978, 221380900, -771314989, -949949900, -910604034, -671700962, -929746634, -316363230};

        int[] expected = new int[]{8, 6, 3, 0, 7, 1, 4, 8, 3, 4};
        int[] actual = solution.countSolutions(Y, query);

        Assert.assertArrayEquals(expected, actual);
    }

}
