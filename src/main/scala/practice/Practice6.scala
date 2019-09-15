package practice

object Practice6 extends App {
  def findDigits(n: Int): Int = {
    var some=0
    var m=n
    while(m>0){
      if(m%10!=0 && n%(m%10)==0) some+=1
      m/=10
    }
    some
  }
  println(findDigits(30120))
}
