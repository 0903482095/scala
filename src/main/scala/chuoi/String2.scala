package chuoi

object String2 extends App{
  def hammingDistance(a: String, b: String) = {
    ((a zip (b)) filter (x=> x._1!=x._2)).length
  }
  println(hammingDistance("1011101", "1001001"))
}
