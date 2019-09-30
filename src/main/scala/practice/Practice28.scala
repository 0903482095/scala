package practice

object Practice28 extends App{
  def squares(a: Int, b: Int): Int = {
    (a to b).toArray count (p => checkSquares(p))
  }
  def checkSquares(x:Int):Boolean={
    val check=Math.sqrt(x)
    check-check.toInt==0
  }
  println(squares(1,49))
}
