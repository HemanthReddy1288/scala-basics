package task01

case class Recursion(fieldName : String, fieldId : String)
object CheckingRecuring extends App{
  def recusionCheck (fieldNamess : List[Recursion]) : List[Recursion] ={
    var c : List[Recursion] = List()
    fieldNamess.match {
      case Nil => Nil
      case head :: tail =>
       head :: recusionCheck(tail.filter(_.fieldName != head.fieldName))

    }
  }

  val fieldNamess = List(
    Recursion("name", "vishal"),
    Recursion("id", "1012"),
    Recursion("bankCode", "SPG"),
    Recursion("name", "hemanth"),
    Recursion("idType", "Student"),
    Recursion("bankCode", "HYU"),
    Recursion("lastName", "Singh"),
    Recursion("middleName", "Kumar"),
    Recursion("lastName", "random")
  )
  println(recusionCheck(fieldNamess))
}
