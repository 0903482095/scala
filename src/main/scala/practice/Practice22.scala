package practice

object Practice22 extends App{
  def superDigit(n: Int, k: Int): Int = {
    var a: String=n.toString*k
    while(a.length>1){
      a=sum(a).toString
    }
    a.toInt
  }
  def sum(x:String)={
    (x.toList map(i=>i.toInt-48)).foldLeft(0)(_+_)
  }

  println(superDigit(9875,4))
}
