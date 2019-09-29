package practice

object Practice18 extends App {
  def isPrime(x:Int):Boolean={
    (x>1) && !(2 to Math.sqrt(x).toInt).exists(z=>x%z==0)
  }
  def maxPrime(n: Int): String = {
    if(isPrime(n) && isPrime(n+4)) "YES"
    else "NO"
  }
}
