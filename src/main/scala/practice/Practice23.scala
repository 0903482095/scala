package practice

object Practice23 extends App{

    def insertOperators(n: Int, s: Int) = {
      var re = new Array[String]((n))
      var kq = new Array[String](n)

      def backTrack(i: Int): Unit = {
        for (j <- 1 to 2) {
          if (j == 1) kq(i) = "+"
          else kq(i) = "-"
          if (i == n - 1) {
            var operator = kq.tail
            var number = (1 to n).toArray
            var result = number(0)
            var i: Int = 0
            var j: Int = 0
            while (i < n - 1) {
              if (operator(j) == "+") result += number(i + 1)
              else result -= number(i + 1)
              i += 1
              j += 1
            }
            if (result == s) re = operator
          }
          else backTrack(i + 1)
        }
      }
      backTrack(1)
      if (re.head!=null) {
        var string = ""
        val result = (1 until n).toArray zip re
        for (i <- 0 until result.length) {
          string += result(i)._1 + result(i)._2
        }
        string+=n
        string
      }
      else "Impossible"
    }
    println(insertOperators(9,5))
}
