

Problem Statement

     Alice and Bob are playing a game on a rectangular board. Rows and columns are both
     numbered starting from 0. We will use (i, j) to denote the cell in row i, column j. The
     cell (0, 0) is in the top left corner of the board. Some cells contain walls, others are
     empty. The game is played on empty cells only.
     The game is played as follows: Each player has one piece on the board. Initially, each
     piece occupies a different cell. The players take alternating turns, Alice starts. In each
     turn, the player moves his/her piece onto one of the adjacent empty cells. (Note that
     moving the piece is mandatory, it is not allowed to keep it in its current cell.)
     If at any moment the two tokens occupy the same cell, Alice wins. If Alice gives up
     (described below), Bob wins.
     You are given a String[] field that describes the game board. Character j of element i of
     field describes the initial content of the cell (i, j). The character '.' represents an
     empty cell, '#' represents a wall, 'A' is an empty cell where Alice's piece starts, and
     'B' is an empty cell where Bob's piece starts.
     Here is the twist: The game board is completely in the dark. Alice and Bob each know the
     initial location of both pieces. During the game, Alice has no idea how Bob moves his
     piece. However, Bob knows exactly how Alice will play the game. (Note that this is
     actually possible: as Alice does not gain any information during the game, she may as well
     determine her entire strategy in advance.)
     You are given a String[] moves that represents Alice's strategy. Concatenate all elements
     of moves to obtain a String M. For each i, in her i-th turn, Alice will move her piece
     according to the character M[i-1]. Assume that before Alice's i-th turn her piece was at
     (y, x). In the i-th turn she moves as follows:

     * If M[i-1] is 'U' (quotes for clarity): she moves to (y-1, x).
     * If M[i-1] is 'R' (quotes for clarity): she moves to (y, x+1).
     * If M[i-1] is 'L' (quotes for clarity): she moves to (y, x-1).
     * If M[i-1] is 'D' (quotes for clarity): she moves to (y+1, x).

     It is guaranteed that M will represent a valid sequence of moves that only uses empty
     cells and never leaves the board. If Alice gets to the situation where she has to make a
     move but has no more letters in M, she gives up and Bob wins the game.
     Bob can use his knowledge of M and his knowledge of the game board when planning his own
     moves. If it is possible for Bob to win the game, return "Bob wins" (quotes for clarity).
     Otherwise, return "Alice wins".

Definition


     Class:            GameInDarknessDiv2
     Method:           check
     Parameters:       String[], String[]
     Returns:          String
     Method signature: String check(String[] field, String[] moves)
     (be sure your method is public)

    

Notes

  -  Note that the return value is case sensitive.

Constraints

  -  field and moves will contain between 1 and 50 elements, inclusive.
  -  Each element of field and moves will contain between 1 and 50 characters, inclusive.
  -  Each element of field will contain the same number of characters.
  -  Each character of each element of field will be either '.', '#', 'A' or 'B' (quotes for
     clarity).
  -  field will contain exactly one 'A' and 'B' each.
  -  Each character of moves will be either 'U', 'D', 'L' or 'R' (quotes for clarity).
  -  The sequence of moves represented by moves will be a valid sequence of moves for Alice's
     piece.
  -  In the starting position each player will have at least one possible move.

Examples

 0)



       {&quot;A.B..&quot;,
        &quot;##.##&quot;,
        &quot;##.##&quot;}


       {&quot;RRDUR&quot;}



       Returns: &quot;Alice wins&quot;


     In this game, M="RRDUR". In this case Alice can always win regardless of how Bob
     moves. One possible game is as follows:

     * Alice moves her piece to (0, 1).
     * Bob moves his piece to (0, 3).
     * Alice moves to (0, 2).
     * Bob moves to (0, 4).
     * Alice moves to (1, 2).
     * Bob moves to (0, 3).
     * Alice moves to (0, 2).
     * Bob moves to (0, 4).
     * Alice moves to (0, 3).
     * Bob moves to (0, 3). Alice and Bob are on the same cell, so Alice wins.

     Note that Alice has used up all characters of M. Even so, Alice doesn't give up unless
     she needs to make her 6-th move.


 1)



       {&quot;A.B..&quot;,
        &quot;##.##&quot;,
        &quot;##...&quot;}


       {&quot;RRRLD&quot;}



       Returns: &quot;Bob wins&quot;




 2)



       {&quot;###.#&quot;,
        &quot;###..&quot;,
        &quot;A..B#&quot;,
        &quot;###..&quot;,
        &quot;###.#&quot;}

    
       {&quot;RR&quot;, &quot;R&quot;, &quot;UDD&quot;}



       Returns: &quot;Alice wins&quot;


     Make sure to concatenate the elements of moves.


 3)



       {&quot;A.###&quot;,
        &quot;.B...&quot;}


       {&quot;RDRRRLLLLUDUDRLURDLUD&quot;}



       Returns: &quot;Bob wins&quot;




 4)



       {&quot;.....&quot;,
        &quot;.#.#.&quot;,
        &quot;##.#.&quot;,
        &quot;A###.&quot;,
        &quot;B....&quot;}

    
       {&quot;D&quot;}



       Returns: &quot;Alice wins&quot;




 5)



       {&quot;.#...#....#.......#....#......&quot;,
        &quot;...###.#.#..#.#.#..###...#.#.#&quot;,
        &quot;.#.#...#...#..#..#.....##.#...&quot;,
        &quot;#..#.##..##..#.#..###.#....#.#&quot;,
        &quot;..#..#..#...#...#....#..##.#..&quot;,
        &quot;#..##..#..##.#.#.####..#.#...#&quot;,
        &quot;.#....##.#.....#......##.#.#..&quot;,
        &quot;.###.#...#.#.#..#.#.##...##.#.&quot;,
        &quot;.....#.#.##..#.#..##...##...#.&quot;,
        &quot;#.#.#...#...#.#.#...#.#.#.##.#&quot;,
        &quot;.#..##.#..##..#.###...........&quot;,
        &quot;..##.....####.......##.#.#.##.&quot;,
        &quot;#....##.#.#...####.#...#.#.#..&quot;,
        &quot;#.#.#......##.#...#..#.#..#..#&quot;,
        &quot;..#..#.#.##...#.#..#..#..#..#.&quot;,
        &quot;.#..#...#...#..#..#.#..#..#A#.&quot;,
        &quot;..#..#.#.B##.##..#...#.#.##...&quot;,
        &quot;#.#.##..#......#.#.#.#.#...#.#&quot;,
        &quot;#.#...#.######...#.#.#.#.#.#..&quot;,
        &quot;..#.##.#.....#.##..#...#.#.#.#&quot;,
        &quot;.#..#..#.#.#.#.#..#.#####..#.#&quot;,
        &quot;..#.#.##.#.#.##.#......#..#...&quot;,
        &quot;#..#.....#.#.....#.#.##..##.#.&quot;,
        &quot;##..###.#..#.#.#.#..##..#...##&quot;,
        &quot;##.#...#..##.#.#..#.#..#.#.#..&quot;,
        &quot;#..#.#.####..#..#..#..#......#&quot;,
        &quot;..#..#.....####..#.##.#.###.#.&quot;,
        &quot;.#..#.####.#.#..#.....#...#...&quot;,
        &quot;..##.......#...#..####.##.#.#.&quot;,
        &quot;#....#.#.#..#.###....#....#..#&quot;}


       {&quot;UURURUULLLLLLLLLLDLLLLUDLLUDDLRDDDULLDLLDDRRRRRDDU&quot;,&quot;RRUUURUULLD&quot;}



       Returns: &quot;Alice wins&quot;





This problem statement is the exclusive and proprietary property of TopCoder,
Inc. Any unauthorized use or reproduction of this information without the prior
written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder,
Inc. All rights reserved.
