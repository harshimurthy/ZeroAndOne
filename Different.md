1. int val=Math.pow(4, 2); does not work.
int val=(int)Math.pow(4, 2); works. It is important to type cast.

2. if(result.charAt(i)==1) does not work.
if(result.charAt(i)=='1') works. 