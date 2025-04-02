package task01


case class CheckerField(fieldName : String, fieldId : String)

object Abc extends App  {
  def checkerFields(fieldNames : List[CheckerField]) : List[CheckerField] = {
    val updating = fieldNames.groupBy(c => c._1).toList
    val callHead = updating.map((a,b) => b.head)
    callHead
  }

  val fieldNames = List(
     CheckerField("name","vishal"),
     CheckerField("id","1012"),
     CheckerField("bankCode","SPG"),
     CheckerField("name","hemanth"),
     CheckerField("idType","Student"),
     CheckerField("bankCode","HYU"),
     CheckerField("lastName","Singh"),
     CheckerField("middleName","Kumar"),
     CheckerField("lastName","random")
   )
  println(checkerFields(fieldNames))




}

