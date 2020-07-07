/*
  此解為小弟所寫
  題目:Square Every Digit 
  出自:codewars.com
  Welcome. In this kata, you are asked to square every digit of a number.
  For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
  Note: The function accepts an integer and returns an integer
*/
class TestOperator{
  public static void main(String[] args){
    int i = 9119;
    
    //將int轉為字串並用length()回傳字串長度
    int length = (i+"").length();
    
    //建立一空字串用來放輸出字串
    String square="";
    System.out.println("i's length = "+length); // 4
    
    //用迴圈找出依序由個、十、百．．．的係數，並將係數平方後加入輸出字串
    for ( int j = (length-1) ; j >= 0 ; j--){
      double n = (Math.pow(10,j));
      int digit = (i/(int)n)%10;
      square += digit*digit;
    }
    System.out.println(square); // 811181
  }
}
