package chuoi

object String1 extends App{
  def reversedWord(str: String): String = {
    (str split " ").reverse.mkString(" ")
  }
  println(reversedWord("Nothing is impossible"))
}
