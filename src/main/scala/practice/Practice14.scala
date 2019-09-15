package practice

object Practice14 extends App {
  def squareMatrixRotation(s: Array[Array[Int]]) = {
    s map (i=> i map (j=>s(s.length-i.indexOf(j)-1)(s.indexOf(i))))
  }
  println(squareMatrixRotation(Array(Array(1,2,3),Array(4,5,6),Array(7,8,9)))(2)(2))
}
