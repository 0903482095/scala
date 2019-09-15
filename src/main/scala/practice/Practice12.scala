package practice

object Practice12 extends App {
  def formingMagicSquare(s: Array[Array[Int]]) = {
    var sum=0
    val maPhuong = Array(Array(4, 9, 2), Array(3, 5, 7), Array(8, 1, 6))// khong can quay vi cong tru cac so cung van vay

    for(i<-0 to 2){
      var sumHang=0
      for(j<-0 to 2){
        sumHang+=(s(i)(j)-maPhuong(i)(j))
      }
      sum+=Math.abs(sumHang)
    }
    sum
  }
  println(formingMagicSquare(Array(Array(8, 1, 5), Array(3, 5, 7), Array(4, 9, 2))))
}
