package task01


case class CheckerFieldFL(fieldName : String, fieldId : String)

object foldleft extends App{
  def checkerFieldss(fieldNamess : List[CheckerFieldFL]) : List[CheckerFieldFL] = {
    //    val list = List()
    //    var list2 = List.empty
    //    val list3 = Nil:

    val xyz = fieldNamess.foldLeft(Nil: List[CheckerFieldFL]) { (acc,x) =>
      if (acc.exists(_.fieldName == x.fieldName)) acc
      else acc :+ x

    }
    xyz
  }


  val fieldNamess = List(
    CheckerFieldFL("name", "vishal"),
    CheckerFieldFL("id", "1012"),
    CheckerFieldFL("bankCode", "SPG"),
    CheckerFieldFL("name", "hemanth"),
    CheckerFieldFL("idType", "Student"),
    CheckerFieldFL("bankCode", "HYU"),
    CheckerFieldFL("lastName", "Singh"),
    CheckerFieldFL("middleName", "Kumar"),
    CheckerFieldFL("lastName", "random")
  )
  println(checkerFieldss(fieldNamess))


}