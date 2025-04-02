package task01

import task01.TailRecursion.{checkerFieldss, fieldNamess}

case class CheckerRecursion(fieldName : String, fieldId : String)

object Checker extends App{
  def checkerfieldss(fieldNamess : List[CheckerRecursion]) : List[CheckerRecursion] = {
    def helper(checking: List[CheckerRecursion], acc: List[CheckerRecursion]): List[CheckerRecursion] = {
      if (checking.isEmpty) acc
      else {
        val head = checking.head
        val tail = checking.tail
        if (acc.exists(_.fieldName == head.fieldName)) helper(tail, acc)
        else {
          helper(tail, acc :+ head)
        }
      }
    }
    helper(fieldNamess, List.empty[CheckerRecursion])
  }


  val fieldNamess = List(
    CheckerRecursion("name", "vishal"),
    CheckerRecursion("id", "1012"),
    CheckerRecursion("bankCode", "SPG"),
    CheckerRecursion("name", "hemanth"),
    CheckerRecursion("idType", "Student"),
    CheckerRecursion("bankCode", "HYU"),
    CheckerRecursion("lastName", "Singh"),
    CheckerRecursion("middleName", "Kumar"),
    CheckerRecursion("lastName", "random")
  )
  println(checkerfieldss(fieldNamess))
  //println(helpers(fieldNamess,List.empty[CheckerRecsion]))







  //    def helpers(checking: List[CheckerRecsion], acc: List[CheckerRecsion]): List[CheckerRecsion] = {
  //      if (checking.isEmpty) acc
  //      else {
  //        val head = checking.head
  //        val tail = checking.tail
  //        checking.match {
  //          case Nil => acc
  //          case head :: tail => head :: helpers(tail, acc)
  //        }
  //      }
  //
  //    }
  //    println(helpers(fieldNamess,List.empty[CheckerRecsion]))




}
