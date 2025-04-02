package caseclass

case class AdditionMethod (width : Int,height : Int)

object rectangle extends App{
  def square(size : Int) :AdditionMethod = AdditionMethod(size,size)

  val res = square(5)
  println(res)

}
