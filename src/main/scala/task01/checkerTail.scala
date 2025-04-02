package task01

case class checkerTail(fieldName : String, fieldId : String)

object TailRecursion extends App{
  def checkerFieldss(fieldNamess : List[checkerTail]) : List[checkerTail] ={
    def helper(checking : List[checkerTail] ,acc : List[checkerTail] ) : List[checkerTail] ={
      if(checking.isEmpty) acc
      else{
        val head = checking.head
        val tail = checking.tail
        if(acc.exists(_.fieldName == head.fieldName)) helper(tail,acc)
        else {
          helper(tail, acc :+ head)
        }
      }
    }
    helper(fieldNamess,List.empty[checkerTail])
  }

  val fieldNamess = List(
    checkerTail("name", "vishal"),
    checkerTail("id", "1012"),
    checkerTail("bankCode", "SPG"),
    checkerTail("name", "hemanth"),
    checkerTail("idType", "Student"),
    checkerTail("bankCode", "HYU"),
    checkerTail("lastName", "Singh"),
    checkerTail("middleName", "Kumar"),
    checkerTail("lastName", "random")
  )
  println(checkerFieldss(fieldNamess))

}
