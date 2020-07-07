/*
  此解為大神解，將除了aeiou外的字元用空字元取代，再將其字串長度計算出來
  題目:Vowel Count 
  出自:codewars.com
  Return the number (count) of vowels in the given string.
  We will consider a, e, i, o, u as vowels for this Kata (but not y).
  The input string will only consist of lower case letters and/or spaces.
*/
class Vowels2{
  public static void main(String[] args){
    int vowelsCount = 0 ;
    String str = "abbreissoudd";
    
    //使用給定的 replacement 字符串替換此字符串匹配給定的正則表達式的每個子字符串
    System.out.println(str.replaceAll("[^aeiou]", "").length());
    System.out.println(str.replaceAll("(?i)[^aeiou]", "").length()); //(?i)表示匹配時不分大小寫
  }
}
