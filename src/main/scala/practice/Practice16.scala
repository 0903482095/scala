package practice

object Practice16 extends App {
  def rangeExtraction(ar: Array[Int]): String = {
    var result=""
//    if(ar.deep == Array(4, 7, 8, 9, 13, 15, 16, 17, 18, 19, 20).deep){
//      result+="-35,-23--20,-4,-3,0-2"
//    }
//    else{
    var i=0
    while(i<ar.length){
      var boolean=true
      var index=ar.length-1
      while(boolean && index>i){
        if(ar(index)-ar(i)!=index-i){
          index-=1
        }
        else {
          boolean=false
        }
      }
      if(index>i+1){
        if(index == ar.length-1){
          result+=ar(i)+"-"+ar(index)
          i=index+1
        }
        else{
          result+=ar(i)+"-"+ar(index)+","
          i=index+1
        }
      }
      else {
        if(i==ar.length-1){
          result+=ar(i)
          i+=1
        }
        else{
          result+=ar(i)+","
          i+=1
        }
      }
    }
  //}
    result
  }
  println(rangeExtraction(Array(4,7,8,9,13,15,16,17,18,19,20)))
}
