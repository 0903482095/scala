package practice

object Practice3 extends App{
  def isPrime(x:Int):Boolean={
    if(x==0 || x==1) false
    else !(2 to Math.sqrt(x).toInt).exists(z=>x%z==0)
  }
  def sum(x:String)={
    (x.toList map(i=>i.toInt-48)).foldLeft(0)(_+_)
  }
  def perniciousNumbers(a:Int)={
    ((3 to a) filter(i=> isPrime(sum(i.toBinaryString)))).toList
  }
  println(perniciousNumbers(25))
}
