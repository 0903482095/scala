package practice

object Practice9 extends App{
  def jumpingOnClouds(a: Array[Int]): Int = {
    var buoc=0
    var i=2
    while(i<a.length){
      if(a(i)==0) {
        buoc+=1
        if(i==a.length-2) i+=1
        else i+=2
      }
      else{
        buoc+=1
        i+=1
      }
    }
    buoc
  }
  println(jumpingOnClouds(Array(0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0)))
}
