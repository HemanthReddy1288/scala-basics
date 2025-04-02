package practice1


object Demo5 extends App{
 // case class FindingSecion(StudentInfo : List[StudentInformation])
  case class StudentInformation(id: Int, subjects: List[Subject])
  case class Subject(subjectName: String, marks: Int)

  def findStudentScore(studentId: Int, students: List[StudentInformation]): Option[Int] = {

    val student = students.find(_.id == studentId)
    val totalScore = student.map(_.subjects.map(_.marks).sum)
    totalScore
    
    
    /*section match {
      case FindingSecion(value) if(value.map(c =>c.id).contains(studentId)) =>
        s" the Student Id is $studentId \n student total marks is = ${value.filter(c => c.id == studentId).flatMap(_.subject.map(_.marks)).sum}"
      case _ => s"No value"
    }*/

  }

  val students1 = List(StudentInformation(1, List(Subject("m1", 25), Subject("m2", 22), Subject("bee", 33))),
                             StudentInformation(2, List(Subject("m1", 25), Subject("m2", 22), Subject("bee", 33))),
                              StudentInformation(3,List(Subject("TELUGU",25),Subject("ENGLISH",22),Subject("MATHS",33))))
  
  val students2 = List(StudentInformation(1, List(Subject("m1", 25), Subject("m2", 22), Subject("bee", 33))),
                             StudentInformation(2, List(Subject("m1", 25), Subject("m2", 22), Subject("bee", 33))),
                              StudentInformation(3, List(Subject("TELUGU", 25), Subject("ENGLISH", 22), Subject("MATHS", 33))))


  println(findStudentScore(1, students1))


  // student12 match
  //      case FindingSecion(List(StudentInformation(id, List(Subject(subjectName, marks)))))  =>s"hello"
  //        //if List(StudentInformation(id,List(Subject(subjectName, marks)))).map(_.id).contains(studentId)  =>s"hello"
  //       // s"Total marks are ${student12.StudentInfo.flatMap(_.subject.map(_.marks)).sum}"
  //
  //      case _ => s"No Data"

}
