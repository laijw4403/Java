/*
  此解為小弟所寫
  題目:Vowel Count 
  出自:codewars.com
  Return the number (count) of vowels in the given string.
  We will consider a, e, i, o, u as vowels for this Kata (but not y).
  The input string will only consist of lower case letters and/or spaces.
*/
class Vowels{
  public static void main(String[] args){
    int vowelsCount = 0 ; //存放計算結果之變數
    String str = "abbreissoudd"; //輸入字串

    //將每一個字元挑出來比對是否有aeiou字元，若有則將vowelsCount+1
    for ( int i = 0 ; i < str.length() ; i++){
      if ( String.valueOf(str.charAt(i)).matches("[aeiou]")) vowelsCount++;
    }
    System.out.println(vowelsCount);
  }
}
