package practice

object Practice2 extends App{
  def isPrime(x:Int):Boolean={
    if(x==0 || x==1) false
    else !(2 to Math.sqrt(x).toInt).exists(z=>x%z==0)
  }
  def sum(x:Int,y:Int)={
    var n:Int=x*y
    var sum=0
    while(n>0){
      sum+=n%10
      n/=10
    }
    sum
  }
  def primesReversion(a:Int,b:Int)={
    val primes=(a to b) filter(z=>isPrime(z))
    val p=primes map (i=>primes map (j=>if(i<j) (i,j) else (j,i)))
    val p1=(p flatMap(x=>x)).toSet

    (p1 filter(i=>isPrime(sum(i._1,i._2)))).size
  }
  println(primesReversion(0,10))
}
