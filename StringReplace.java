/* 
   此解為小弟所寫
   題目:Credit Card Mask 
   出自:codewars.com
   Usually when you buy something, you're asked whether your credit card number, 
   phone number or answer to your most secret question is still correct. However, 
   since someone could look over your shoulder, you don't want that shown on your screen. 
   Instead, we mask it.
   Your task is to write a function maskify, which changes all but the last four characters into '#'.
*/
/*
      字串格式化用法
      String.format(String format, Object... args)
      第一個參數為 格式化字串
      第二個參數為 格式化字串參數，再格式化時會替換格式化符號
      此例則為 "" 替換 %s   
 */ 
class StringReplace{
  public static void main(String[] args){
    StringBuffer test = new StringBuffer("b3kb6");
    int length = test.length();
    System.out.println("Input String : "+test);
    //若字串長度>4則保留後4碼，將前面的字元都更換為#
    if ( length > 4 ){
      test.replace(0,(length-4),String.format("%" + (length-4) + "s","").replace(" ", "#"));
    }
    System.out.println("inputString's length : "+length);
    System.out.println("Output String : "+test);
  }
}
