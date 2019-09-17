package chuoi

object String4 extends App{
  def knuthMorrisPratt(text: String, word: String): Int = {
    val result=for(i<- 0 to text.length-word.length if text.substring(i,i+word.length)==word) yield i
    if(result.isEmpty) -1
    else result(0)
  }
  println(knuthMorrisPratt("abcxabcdabxabcdabcdabcy","abcdabca"))
}
