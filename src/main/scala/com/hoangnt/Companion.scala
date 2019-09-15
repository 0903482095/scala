package com.hoangnt

import scala.collection.mutable

object Companion extends App{
  val a=Array("hoang","hoi")
  println(a)

  val b=List("hoang","hoi")
  println(b)

  val c=Set("hoang","hoi")
  println(c)

  val d=mutable.Set("hoang","hoi")
  println(d)

  val e=("hoang","hoi")
  println(e)

  val f=Map(1->"hoang",2->"hoi")
  println(f)

  val g=mutable.Map(1->"hoang",2->"hoi")
  println(g)

}
