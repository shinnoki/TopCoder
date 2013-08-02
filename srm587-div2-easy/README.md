

Problem Statement

     You are given two Strings: init and goal. Both init and goal contain
     lowercase letters only. Additionally, init does not contain the character
     'z'.
     Your goal is to transform init into goal. The only operation you are
     allowed to do is to insert the character 'z' anywhere into init. You can
     repeat the operation as many times as you want, and each time you can
     choose any position where to insert the 'z'.
     For example, if init="fox", you can transform it to "fzox" in one
     operation. Alternately, you can transform "fox" into "zzzfoxzzz" in six
     operations. It is not possible to transform "fox" into any of the strings
     "fx", "foz", "fxo", "foxy".
     Return "Yes" (quotes for clarity) if it is possible to transform init into
     goal. Otherwise, return "No".

Definition


     Class:            InsertZ
     Method:           canTransform
     Parameters:       String, String
     Returns:          String
     Method signature: String canTransform(String init, String goal)
     (be sure your method is public)

    

Notes

  -  Note that the return value is case sensitive.

Constraints

  -  init and goal will each contain between 1 and 50 characters, inclusive.
  -  Each character of init and goal will be a lowercase letter ('a'-'z').
  -  init will not contain the letter 'z'.

Examples

 0)



       &quot;fox&quot;


       &quot;fozx&quot;

    

       Returns: &quot;Yes&quot;


     By inserting 'z' to the position bettween 'o' and 'x' in "fox", we
     obtain "fozx".


 1)



       &quot;fox&quot;


       &quot;zfzoxzz&quot;

    

       Returns: &quot;Yes&quot;


     You may perform the operation multiple
     times.


 2)



       &quot;foon&quot;


       &quot;foon&quot;

    

       Returns: &quot;Yes&quot;


     In this case init and goal are equal. You do not have to perform
     the operation.


 3)



       &quot;topcoder&quot;


       &quot;zopzoder&quot;
    


       Returns: &quot;No&quot;




 4)



       &quot;aaaaaaaaaa&quot;


       &quot;a&quot;
    


       Returns: &quot;No&quot;




 5)



       &quot;mvixrdnrpxowkasufnvxaq&quot;


       &quot;mvizzxzzzrdzznzrpxozzwzzkazzzszzuzzfnvxzzzazzq&quot;
    


       Returns: &quot;Yes&quot;




 6)



       &quot;opdlfmvuicjsierjowdvnx&quot;


       &quot;zzopzdlfmvzuicjzzsizzeijzowvznxzz&quot;
    


       Returns: &quot;No&quot;





This problem statement is the exclusive and proprietary property of TopCoder,
Inc. Any unauthorized use or reproduction of this information without the prior
written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder,
Inc. All rights reserved.
