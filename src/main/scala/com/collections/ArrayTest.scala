package com.collections

object ArrayTest extends App {
  val a1=Array("hoang","hoi")
  var a2=Array("hoang","hoi")

//  a1=Array("khasjkfhasjlkd")     //erorr vi la val
  a2=Array("khasjkfhasjlkd")     //ok vi la var

  a1(0)="hoang1"      // ok vi la val nhung day la thay doi tren Array chu khong pai la thay doi tren a
  a2(0)="hoang1"      // ok vi la val nhung day la thay doi tren Array chu khong pai la thay doi tren a

  for(i<-a2) println(i)
}
