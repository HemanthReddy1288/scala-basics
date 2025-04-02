package collection

import  scala.collection.immutable.TreeSet

object Treeset extends App{
  val treeset = TreeSet("c++","java","scala")
  println(s"element Are =$treeset")
  println(s"element c++ =${treeset("c++")}")
  println(s"element Are =${treeset("Java")}")
  var ts2= treeset + "python"
  println(ts2)
  var ts3= ts2 ++ TreeSet("phone","charger")
  println(ts3)
  var ts4= ts3 - "charger"
  println(ts4)
  println(treeset & ts4)
  
}
