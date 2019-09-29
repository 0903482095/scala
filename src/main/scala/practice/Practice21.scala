package practice

object Practice21 extends App {
  def biggerIsGreater(w: String)= {
    var a=w.toArray
    def swap(x:Int,y:Int)={
      var tam=a(x)
      a(x)=a(y)
      a(y)=tam
    }

    var i=w.length-2
    var boolean=true
    while(i>=0 && boolean){
      var tam=w(i+1)
      var vt=i
      for(j<- i + 1 until w.length){
        if(w(i) < w(j) && w(j)<=tam){
          tam=w(j)
          vt=j
        }
      }
      if(vt>i){
        swap(i,vt)
        for(x<-i+1 until w.length-1){
          for(y<-i+2 until w.length){
            swap(x,y)
          }
        }
        boolean=false

      }
      else i-=1

    }
    if(a.mkString("")==w) "no answer"
    else a.mkString("")
  }
  println(biggerIsGreater("bb"))
}
