package com.collections

import scala.collection.{immutable, mutable}
import scala.io.Source

object SetTest extends App{
  val filename = "word.txt"
  val random = scala.util.Random
  val r=random.nextInt(2)
  val alpha=random.alphanumeric.take(1).mkString.toLowerCase()
  println(r+"   "+ alpha)
    if(r==0) {
      for (line <- Source.fromFile(filename).getLines) {
        println(line)
        val a = scala.io.StdIn.readLine()
        println(a)
      }
    }
    else {

    }

}
