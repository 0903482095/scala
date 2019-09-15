package practice

object Practice1 extends App {
  def sumAll(a:Int,b:Int)={
    (a+b)*(Math.abs(a-b)+1)/2
  }
  println(sumAll(5,2))
}
