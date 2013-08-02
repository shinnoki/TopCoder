import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThreeColorabilityEasyTest {

    protected ThreeColorabilityEasy solution;

    @Before
    public void setUp() {
        solution = new ThreeColorabilityEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] cells = new String[]{"Z"};

        String expected = "Yes";
        String actual = solution.isColorable(cells);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] cells = new String[]{"NZ", "NZ"};

        String expected = "Yes";
        String actual = solution.isColorable(cells);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] cells = new String[]{"ZZZ", "ZNZ"};

        String expected = "No";
        String actual = solution.isColorable(cells);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] cells = new String[]{"NZNZNNN", "NNZNNNZ", "NNNNZZZ", "ZZZNZZN", "ZZNZNNN", "NZZZZNN", "ZZZNZNN"};

        String expected = "No";
        String actual = solution.isColorable(cells);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] cells = new String[]{"ZZZZ", "ZZZZ", "ZZZZ"};

        String expected = "Yes";
        String actual = solution.isColorable(cells);

        Assert.assertEquals(expected, actual);
    }

}
