package recursion

object Recursion1 extends App{
  def fib(n: Int): Int = {
    if(n==1 ||n==2) 1
    else fib(n-1)+fib(n-2)
  }
  println(fib(9))
}
