package task.of25

object totalStudentScore extends App{

  case class StudentInformation(id:Int,subject :List[Subject])
  case class Subject(subjectName: String,marks : Int)

//  def findStudentScore(studentId : Int,student12 : StudentInformation): String={
//    student12 match{
//      case StudentInformation(rollNo, value) if( == studentId) =>
//        value match {
//          case value2  => s"the total marks is ${value2.map(_.marks).sum}"
//        }
//
//      case _ => s"no rollnumber found"
//
//    }
//
//  }
  val data = StudentInformation(1,List(Subject("m1",25),Subject("m2",22),Subject("bee",33)))
  // (2,List(Subject("TELUGU",25),Subject("ENGLISH",22),Subject("MATHS",33)))

  //println(findStudentScore(1,data))
  //,Some(Subject("m2",25)),Some(Subject("BEE",44)),Some(Subject("Flat",34))
}
