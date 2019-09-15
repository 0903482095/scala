package practice

object Practice5 extends App{
  def twoStrings(a: String, b: String): Boolean = {
    val x=a filter(x=> b exists(y=>y==x))
    if(!x.isEmpty) true
    else false
  }
  println(twoStrings("aaaaaa","bbbbbb"))
}
