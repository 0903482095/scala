package practice

object Practice17 extends App {


    def isPrime(x:Int):Boolean={
      (x>1) && !(2 to Math.sqrt(x).toInt).exists(z=>x%z==0)
    }
  def maxPrime(n: Int): Int = {
    var m=n
    var boolean=true
    while(m>1 && boolean){
      if(isPrime(m)) boolean=false
      else m-=1
    }
    m
  }
  println(maxPrime(40))
}
