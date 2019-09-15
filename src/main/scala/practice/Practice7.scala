package practice

object Practice7 extends App{
  def timeConversion(a: String): String = {
    (a.substring(a.length-2,a.length-1),a.substring(0,2).toInt>=12) match {
      case ("A",true) =>(a.head.toInt-49).toString+(a.substring(1,2).toInt-2).toString+a.substring(2,a.length-2)
      case ("P",false)=>(a.substring(0,2).toInt+12).toString+a.substring(2,a.length-2)
      case _=>a.substring(0,a.length-2)
    }
  }
  println(timeConversion("12:00:00PM"))

}
