package practice

object Practice25 extends App {
  def utopianTree(n: Int, ar: Array[Int]): String = {
    (ar map (a=> middle(a))).mkString(" ")
  }

  def middle(n:Int)={
    var cay=0
    for(i<-0 to n)
      if (i % 2 == 0) cay+=1
      else cay*=2
    cay
  }
  println(utopianTree(5,Array(2,8,20,34,58)))
}
