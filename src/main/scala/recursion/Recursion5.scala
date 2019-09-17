package recursion

object Recursion5 extends App {
  def superDigit(n: String, k: Int): Int = {
    if(n.toInt<10) n.toInt
    else superDigit(sumDigit((sumDigit(n.toInt)*k).toInt).toString,1)
  }
  def sumDigit(n: Int): Int = {
    if(n==0) 0
    else sumDigit(n/10)+n%10
  }
  println(superDigit("9875",4))
}
