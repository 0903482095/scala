package recursion

object Recursion2 extends App {
  def factorial(n: Int): Int = {
    if(n==1 || n==0) 1
    else n*factorial(n-1)
  }
}
