package practice

object Practice8 extends App{
  def sockMerchant(a: Array[Int]): Int = {
    ((a.length-a.toSet.size).toDouble/2).ceil.toInt
  }
  println(sockMerchant(Array(1,1,3,1,2,1,3,3,3,3)))
}
