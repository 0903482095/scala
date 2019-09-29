package practice


import scala.collection.mutable

object Practice20 extends App {

    def onAChessboard(n: Int): String = {
    var result=""
    for(i<-1 to n-1){
      for(j<-1 to n-1){
        val queue=new Array[Int]((n.toString+n.toString).toInt)
        val trace=new Array[Int]((n.toString+n.toString).toInt)
        val cx=new Array[Boolean]((n.toString+n.toString).toInt)
        result += BFS(i,j,n-1,cx,trace,queue)+" "

      }
      result+="\n"
    }
    result
  }
  def init(i:Int,j:Int,n:Int,cx:Array[Boolean])={
    for(i<-1 to n){
      for(j<-1 to n){
        cx((i.toString+j.toString).toInt)=true
      }
    }
  }
  def BFS(i:Int,j:Int,n:Int,cx:Array[Boolean],trace:Array[Int],queue:Array[Int])={
    init(i,j,n,cx)
    trace((i.toString+j.toString).toInt)=(-1)
    var dQ:Int=1
    var cQ:Int=1
    queue(cQ)=(i.toString+j.toString).toInt
    cx((i.toString+j.toString).toInt)=false
    while(cx((n.toString+n.toString).toInt) && !queue.isEmpty){
      var u:Int=queue(dQ)
      dQ+=1
      if(u>21 && cx(u-21)) {
        cQ+=1
        middle(u,21,cQ,cx,trace,queue)
      }
      if(u>19 && cx(u-19)) {
        cQ+=1
        middle(u,19,cQ,cx,trace,queue)
      }
      if(u>8 && cx(u-8)) {
        cQ+=1
        middle(u,8,cQ,cx,trace,queue)
      }
      if(u>12 && cx(u-12)) {
        cQ+=1
        middle(u,12,cQ,cx,trace,queue)
      }
      if(u<=(n.toString+n.toString).toInt-12 && cx(u+12)) {
        cQ+=1
        middle(u,-12,cQ,cx,trace,queue)
      }
      if(u<=(n.toString+n.toString).toInt-8 && cx(u+8)) {
        cQ+=1
        middle(u,-8,cQ,cx,trace,queue)
      }
      if(u<=(n.toString+n.toString).toInt-19 && cx(u+19)) {
        cQ+=1
        middle(u,-19,cQ,cx,trace,queue)
      }
      if(u<=(n.toString+n.toString).toInt-21 && cx(u+21)) {
        cQ+=1
        middle(u,-21,cQ,cx,trace,queue)
      }
    }
    result(i,j,n,trace)
  }

  def middle(current_point: Int , middle_position:Int,cQ:Int,cx:Array[Boolean],trace:Array[Int],queue:Array[Int])={
    queue(cQ)=(current_point-middle_position)
    cx(current_point-middle_position)=false
    trace(current_point-middle_position)=current_point
  }

  def result(i:Int,j:Int,n:Int,trace:Array[Int])={
    var result=0
    var start=(i.toString+j.toString).toInt
    var end=(n.toString+n.toString).toInt
    while(start != end){
      result+=1
      end=trace(end)
    }
    result
  }
  println(onAChessboard(5))

}