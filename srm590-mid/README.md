

Problem Statement

     Fox Ciel is teaching her friend Jiro to play Go. Ciel has just placed some
     white and some black tokens onto a board. She now wants Jiro to find the
     best possible move. (This is defined more precisely below.)


     You are given a String[] board. Character j of element i of board
     represents the cell (i,j) of the board: 'o' is a cell with a white token,
     'x' a cell with a black token, and '.' is an empty cell. At least one cell
     on the board will be empty.


     Jiro's move will consist of adding a single black token to the board. The
     token must be placed onto an empty cell. Once Jiro places the token, some
     white tokens will be removed from the board according to the rules
     described in the next paragraphs.


     The white tokens on the board can be divided into connected components
     using the following rules: If two white tokens lie in cells that share an
     edge, they belong to the same component. Being in the same component is
     transitive: if X lies in the same component as Y and Y lies in the same
     component as Z, then X lies in the same component as Z.


     Each component of white tokens is processed separately. For each component
     of white tokens we check whether it is adjacent to an empty cell. (That
     is, whether there are two cells that share an edge such that one of them
     is empty and the other contains a white token from the component we are
     processing.) If there is such an empty cell, the component is safe and its
     tokens remain on the board. If there is no such empty cell, the component
     is killed and all its tokens are removed from the board.


     Jiro's score is the total number of white tokens removed from the board
     after he makes his move. Return the maximal score he can get for the given
     board.

Definition


     Class:            FoxAndGo
     Method:           maxKill
     Parameters:       String[]
     Returns:          int
     Method signature: int maxKill(String[] board)
     (be sure your method is public)

    

Notes

  -  The position described by board does not have to be a valid Go position.
     In particular, there can already be components of white tokens that have
     no adjacent empty cell.
  -  Please ignore official Go rules. The rules described in the problem
     statement are slightly different. For example, in this problem the black
     tokens cannot be killed, and it is allowed to place the black token into
     any empty cell.

Constraints

  -  n will be between 2 and 19, inclusive.
  -  board will contain exactly n elements.
  -  Each element in board will contain exactly n characters.
  -  Each character in board will be 'o', 'x' or '.'.
  -  There will be at least one '.' in board.

Examples

 0)



       {&quot;.....&quot;,
        &quot;..x..&quot;,
        &quot;.xox.&quot;,
        &quot;.....&quot;,
        &quot;.....&quot;}
    


       Returns: 1


     To kill the only white token, Jiro must place his black token into
     the cell (3,2). (Both indices are 0-based.)


 1)



       {&quot;ooooo&quot;,
        &quot;xxxxo&quot;,
        &quot;xxxx.&quot;,
        &quot;xxxx.&quot;,
        &quot;ooooo&quot;}
    


       Returns: 6


     By placing the token to the cell (2,4) Jiro kills 6 white tokens.
     The other possible move only kills 5 tokens.


 2)



       {&quot;.xoxo&quot;,
        &quot;ooxox&quot;,
        &quot;oooxx&quot;,
        &quot;xoxox&quot;,
        &quot;oxoox&quot;}
    


       Returns: 13


     There is only one possible move. After Jiro makes it, all the
     white tokens are killed.


 3)



       {&quot;.......&quot;,
        &quot;.......&quot;,
        &quot;.......&quot;,
        &quot;xxxx...&quot;,
        &quot;ooox...&quot;,
        &quot;ooox...&quot;,
        &quot;ooox...&quot;}



       Returns: 9


     Regardless of where Jiro moves, the 9 white tokens in the lower
     left corner will be killed.


 4)



       {&quot;.......&quot;,
        &quot;.xxxxx.&quot;,
        &quot;.xooox.&quot;,
        &quot;.xo.ox.&quot;,
        &quot;.xooox.&quot;,
        &quot;.xxxxx.&quot;,
        &quot;.......&quot;}



       Returns: 8




 5)



       {&quot;o.xox.o&quot;,
        &quot;..xox..&quot;,
        &quot;xxxoxxx&quot;,
        &quot;ooo.ooo&quot;,
        &quot;xxxoxxx&quot;,
        &quot;..xox..&quot;,
        &quot;o.xox.o&quot;}



       Returns: 12




 6)



       {&quot;.......&quot;,
        &quot;..xx...&quot;,
        &quot;.xooox.&quot;,
        &quot;.oxxox.&quot;,
        &quot;.oxxxo.&quot;,
        &quot;...oo..&quot;,
        &quot;.......&quot;}



       Returns: 4




 7)



       {&quot;.ox....&quot;,
        &quot;xxox...&quot;,
        &quot;..xoox.&quot;,
        &quot;..xoox.&quot;,
        &quot;...xx..&quot;,
        &quot;.......&quot;,
        &quot;.......&quot;}



       Returns: 5




 8)



       {&quot;...................&quot;,
        &quot;...................&quot;,
        &quot;...o..........o....&quot;,
        &quot;................x..&quot;,
        &quot;...............x...&quot;,
        &quot;...................&quot;,
        &quot;...................&quot;,
        &quot;...................&quot;,
        &quot;...................&quot;,
        &quot;...................&quot;,
        &quot;...................&quot;,
        &quot;...................&quot;,
        &quot;...................&quot;,
        &quot;...................&quot;,
        &quot;................o..&quot;,
        &quot;..x................&quot;,
        &quot;...............x...&quot;,
        &quot;...................&quot;,
        &quot;...................&quot;}



       Returns: 0





This problem statement is the exclusive and proprietary property of TopCoder,
Inc. Any unauthorized use or reproduction of this information without the prior
written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder,
Inc. All rights reserved.
