package recursion

object Recursion3 extends App{
  def findBinary(decimal: Int): Int = {
      if(decimal==0) 0
      else {
        (findBinary(decimal/2).toString+(decimal%2).toString).toInt
      }
  }
  println(findBinary(123))
}
