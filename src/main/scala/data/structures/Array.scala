package data.structures

import data.structures.Arrayss.numbers

object Arrayss extends App{
  val  numbers = Array(1,2,3,4,5,6,7,8,9)
  println(numbers(3))
  numbers(4)=10
  for (num<- numbers){
    println(num)
  }
}

