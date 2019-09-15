package practice

object Practice13 extends App{

  def minimumBribes(a: Array[Int]):String= {
    val start=(1 to a.length).toArray
    if(start zip(a) exists(f=> (f._2-f._1)>2)) "Too chaotic"
    else sort(a).toString

  }
  def sort(a:Array[Int])={ // sap xep mang ban dau
    val start=(1 to a.length).toArray
    var elem=a.length
    var dem=0
    while(elem>1){
      val vt=a.indexOf(elem)
      for(i<-vt until elem-1){
        a(i)=a(i+1)
        dem+=1
      }
      a(elem-1)=elem
      elem-=1
    }
    dem
  }
  println(minimumBribes(Array(1,2,5,3,4,7,8,6)))
}
