

Problem Statement

     Fox Ciel is going to play Gomoku with her friend Fox Jiro. Ciel plays
     better, so before they start she allowed Jiro to put some of his pieces on
     the board.


     You are given a String[] board that represents a square board. The
     character board[i][j] represents the cell with coordinates (i,j). Each of
     those characters is either '.' (representing an empty cell) or 'o'
     (representing a cell with Jiro's piece).
    

     Of course, Ciel does not want Jiro to win the game before she has a chance
     to play. Thus she now has to check the board and determine whether there
     are five consecutive tokens somewhere on the board.


     Determine whether there are 5 consecutive cells (horizontally, vertically,
     or diagonally) that contain Jiro's tokens. Return "found" (quotes for
     clarity) if there are five such cells anywhere on the board. Otherwise,
     return "not found".

Definition


     Class:            FoxAndGomoku
     Method:           win
     Parameters:       String[]
     Returns:          String
     Method signature: String win(String[] board)
     (be sure your method is public)

    

Constraints

  -  n will be between 5 and 15, inclusive.
  -  board will contain exactly n elements.
  -  Each element in board will contain exactly n characters.
  -  Each character in board will be 'o' or '.'.

Examples

 0)



       {&quot;....o.&quot;,
        &quot;...o..&quot;,
        &quot;..o...&quot;,
        &quot;.o....&quot;,
        &quot;o.....&quot;,
        &quot;......&quot;}
    


       Returns: &quot;found&quot;


     There is five continue pieces
     diagonally.


 1)



       {&quot;oooo.&quot;,
        &quot;.oooo&quot;,
        &quot;oooo.&quot;,
        &quot;.oooo&quot;,
        &quot;.....&quot;}
    


       Returns: &quot;not found&quot;


     There is no five-in-a-row on this
     board.


 2)



       {&quot;oooo.&quot;,
        &quot;.oooo&quot;,
        &quot;oooo.&quot;,
        &quot;.oooo&quot;,
        &quot;....o&quot;}
    


       Returns: &quot;found&quot;


     Five consecutive tokens can be found in the following cells: (0,0),
     (1,1), (2,2), (3,3), and (4,4).


 3)



       {&quot;o.....&quot;,
        &quot;.o....&quot;,
        &quot;..o...&quot;,
        &quot;...o..&quot;,
        &quot;....o.&quot;,
        &quot;......&quot;}



       Returns: &quot;found&quot;




 4)



       {&quot;o....&quot;,
        &quot;o.o..&quot;,
        &quot;o.o.o&quot;,
        &quot;o.o..&quot;,
        &quot;o....&quot;}



       Returns: &quot;found&quot;




 5)



       {&quot;..........&quot;,
        &quot;..........&quot;,
        &quot;..oooooo..&quot;,
        &quot;..o.......&quot;,
        &quot;..o.......&quot;,
        &quot;..oooooo..&quot;,
        &quot;.......o..&quot;,
        &quot;.......o..&quot;,
        &quot;..oooooo..&quot;,
        &quot;..........&quot;}




       Returns: &quot;found&quot;




 6)



       {&quot;..........&quot;,
        &quot;..........&quot;,
        &quot;..oooo.o..&quot;,
        &quot;..o.......&quot;,
        &quot;..o.......&quot;,
        &quot;..o.oooo..&quot;,
        &quot;.......o..&quot;,
        &quot;.......o..&quot;,
        &quot;..oooo.o..&quot;,
        &quot;..........&quot;}



       Returns: &quot;not found&quot;




 7)



       {&quot;ooooo&quot;,
        &quot;ooooo&quot;,
        &quot;ooooo&quot;,
        &quot;ooooo&quot;,
        &quot;ooooo&quot;}



       Returns: &quot;found&quot;




 8)



       {&quot;.....&quot;,
        &quot;.....&quot;,
        &quot;.....&quot;,
        &quot;.....&quot;,
        &quot;.....&quot;}



       Returns: &quot;not found&quot;





This problem statement is the exclusive and proprietary property of TopCoder,
Inc. Any unauthorized use or reproduction of this information without the prior
written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder,
Inc. All rights reserved.
