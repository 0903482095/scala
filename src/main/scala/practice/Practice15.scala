package practice

object Practice15 extends App {
  def divisibleSumPairs(n: Int, ar: Array[Int], k: Int): Int = {
    var count:Int=0
    for(i<- 0 until n-1){
      for(j<- i+1 until n){
        if((ar(i)+ar(j))%k==0) count+=1
      }
    }
  count
  }
  println(divisibleSumPairs(6,Array(1,3,2,6,1,2),3))
}
