package practice

object Practice24 extends App {
  def minMaxSum(arr: Array[Int]): String = {
    arr.sorted.reverse.tail.sum.toString+" "+arr.sorted.tail.sum.toString
  }
  println(minMaxSum(Array(1,5,7,3,9)))
}
