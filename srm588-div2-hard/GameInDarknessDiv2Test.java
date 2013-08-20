import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameInDarknessDiv2Test {

    protected GameInDarknessDiv2 solution;

    @Before
    public void setUp() {
        solution = new GameInDarknessDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] field = new String[]{"A.B..", "##.##", "##.##"};
        String[] moves = new String[]{"RRDUR"};

        String expected = "Alice wins";
        String actual = solution.check(field, moves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] field = new String[]{"A.B..", "##.##", "##..."};
        String[] moves = new String[]{"RRRLD"};

        String expected = "Bob wins";
        String actual = solution.check(field, moves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] field = new String[]{"###.#", "###..", "A..B#", "###..", "###.#"};
        String[] moves = new String[]{"RR", "R", "UDD"};

        String expected = "Alice wins";
        String actual = solution.check(field, moves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] field = new String[]{"A.###", ".B..."};
        String[] moves = new String[]{"RDRRRLLLLUDUDRLURDLUD"};

        String expected = "Bob wins";
        String actual = solution.check(field, moves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] field = new String[]{".....", ".#.#.", "##.#.", "A###.", "B...."};
        String[] moves = new String[]{"D"};

        String expected = "Alice wins";
        String actual = solution.check(field, moves);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] field = new String[]{".#...#....#.......#....#......", "...###.#.#..#.#.#..###...#.#.#", ".#.#...#...#..#..#.....##.#...", "#..#.##..##..#.#..###.#....#.#", "..#..#..#...#...#....#..##.#..", "#..##..#..##.#.#.####..#.#...#", ".#....##.#.....#......##.#.#..", ".###.#...#.#.#..#.#.##...##.#.", ".....#.#.##..#.#..##...##...#.", "#.#.#...#...#.#.#...#.#.#.##.#", ".#..##.#..##..#.###...........", "..##.....####.......##.#.#.##.", "#....##.#.#...####.#...#.#.#..", "#.#.#......##.#...#..#.#..#..#", "..#..#.#.##...#.#..#..#..#..#.", ".#..#...#...#..#..#.#..#..#A#.", "..#..#.#.B##.##..#...#.#.##...", "#.#.##..#......#.#.#.#.#...#.#", "#.#...#.######...#.#.#.#.#.#..", "..#.##.#.....#.##..#...#.#.#.#", ".#..#..#.#.#.#.#..#.#####..#.#", "..#.#.##.#.#.##.#......#..#...", "#..#.....#.#.....#.#.##..##.#.", "##..###.#..#.#.#.#..##..#...##", "##.#...#..##.#.#..#.#..#.#.#..", "#..#.#.####..#..#..#..#......#", "..#..#.....####..#.##.#.###.#.", ".#..#.####.#.#..#.....#...#...", "..##.......#...#..####.##.#.#.", "#....#.#.#..#.###....#....#..#"};
        String[] moves = new String[]{"UURURUULLLLLLLLLLDLLLLUDLLUDDLRDDDULLDLLDDRRRRRDDU", "RRUUURUULLD"};

        String expected = "Alice wins";
        String actual = solution.check(field, moves);

        Assert.assertEquals(expected, actual);
    }

}
