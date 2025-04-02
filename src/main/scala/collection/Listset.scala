package collection


import scala.collection.immutable._

object Listset extends App{
    val listSet1= ListSet("c","c++","java", "scala")
    println(s"Elements of listSet1 = $listSet1")
    println(s"c++ =${listSet1("c++")}")
    println(s"Student = ${listSet1("Student")}")
    println(s"Scala = ${listSet1("scala")}")
  }


