package recursion

object Recursion4 extends App {
  def sumDigit(n: Int): Int = {
    if(n==0) 0
    else sumDigit(n/10)+n%10
  }
  println(sumDigit(19))
}
