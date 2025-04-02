package task.of25


//Write a function findStudentScore that takes a student ID and retrieves the student's score:
//
//    Retrieve the student using Option[Student].
//    Retrieve the student's subject using Option[Subject].
//    Retrieve the score for the subject using Option[Double].
//    If any of these steps return None, return None. Otherwise, return the score.
//
//    Use fold to handle the cases of None and Some values gracefully.
//
//    Case classes:
//
//    case class Student(id: Int, subject: Option[Subject])
//    case class Subject(name: String, score: Option[Double])
//    Input: A student ID.
//    Output: An Option[Double] representing the student's score.


object FindStudentScore extends App{
  case class Student(id: Int, subjects: List[Subject])
  case class Subject(name: String, score: Option[Double])

 // def findStudentScore(studentId : Int, subject : Student): Option[Double]={
   // subject match {
     // case Student(studentId,Some(Some(Subject(subjectName,Some(Some(score)))))) => Some(score)
//        value match {
//          case Subject(name,Some(value2)) =>
//            value2 match {
//              case value3 : Double => Some(value3)
//              case _ => None
//            }
//          case _ => None
//        }
      //case _ => None
    //}
  }
  //val data = Student(1, Some(Subject("hello", Some(12.66))))
  //println(findStudentScore(1,data))
//}
