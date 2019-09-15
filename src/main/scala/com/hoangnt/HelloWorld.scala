package com.hoangnt

object HelloWorld extends App {
  println("hello scala")

  var abc: String=_
  abc="jfsldkj"
  println("abc is "+abc)

  case class Name(name:String, age:Int)
  val myName: Name=Name("Hoang",22)
  println("My name is : "+ myName.name)

  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%10s $donutTasteLevel")

  val donutPrice: Double = 2.50
  println(f"Donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice%.1f")


  println("\nStep 6: Using raw interpolation")
  println(raw"Favorite donut\t$donutName")
}
