package practice

object Practice10 extends App {
  def isBalanced(a: String): Boolean = {
    val stack = scala.collection.mutable.Stack[Char]()
    val open = List('(', '[', '{')
    val close = List(')', ']', '}')
    var boolean = true
    for (i <- a) {
      if (open.contains(i)) stack.push(i)
      else {
        if (!stack.isEmpty) {
          val character = stack.pop()
          if (open.indexOf(character) != close.indexOf(i)) boolean = false
        }
        else boolean = false
      }
    }
    stack.length == 0 && boolean
  }

  println(isBalanced("{}"))
}
