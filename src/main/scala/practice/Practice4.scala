package practice

object Practice4 extends App {
  def gradingStudents(grades: Array[Int])={
    grades map (grade=>if(grade>=38 && ((grade/5)*5+5)-grade<3) (grade/5)*5+5 else grade )
  }
  println(gradingStudents(Array(94,72,53,37,82)))
}
