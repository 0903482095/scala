package practice

object Practice11 extends App {
  def abbreviation(a: String, b: String):Boolean= {
    val result=a filter(x=> !b.exists(y=> (y==x ||x-y==32)))
    val boolean= !result.exists(p=>p<90)
    if(a.length-result.length==b.length && boolean) true
    else false
  }
  println(abbreviation("beFgH","EFH"))

}
