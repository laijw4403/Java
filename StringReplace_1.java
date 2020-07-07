/* 
   此解為他人所寫，學習String.substring()用法
   題目:Credit Card Mask 
   出自:codewars.com
   Usually when you buy something, you're asked whether your credit card number, 
   phone number or answer to your most secret question is still correct. However, 
   since someone could look over your shoulder, you don't want that shown on your screen. 
   Instead, we mask it.
   Your task is to write a function maskify, which changes all but the last four characters into '#'.
*/
class StringReplace_1{
  public static void main(String[] args){
    String str = "b3kb6";
    int length = str.length();
    //若字串長度 <= 4 ，則輸出原字串
    if ( length <= 4 ) System.out.print(str);
    String result = "";
    //產生一全是"#"的字串，長度為輸入字串之長度-4
    for ( int i = 0 ; i < (length-4) ; i++ ){
      result += "#" ;
    }
    System.out.println("Input String : "+str);
    System.out.println("String's length : "+length);
    /*
      substring(beginindex,endindex) 存取索引值beginIdex到endIndex-1之字串
      beginindex 開始之索引值(包含);
      endindex 結尾之索引值(不包含);
    */
    System.out.println("Output String : "+(result + str.substring((length-4),length)));
  }
}
