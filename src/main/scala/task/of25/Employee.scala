package task.of25


//Consider the below sealed trait Employee with case classes:
//     *****
//    sealed trait Employee
//    case class Engineer(name: String, skills: List[String]) extends Employee
//    case class Manager(name: String, teamSize: Int) extends Employee
//    case class Intern(name: String, school: String) extends Employee
//    ******
//
//    Write a function describeEmployee(emp: Employee): String that:
//
//    Returns "John is a senior engineer" if John is an Engineer with "Scala" in skills.
//    Returns "Manager with large team" if the manager’s teamSize > 10.
//    Returns "Intern from Stanford" if the intern is from "Stanford".
//    Otherwise, returns "Regular employee".



object abcd extends App {


  sealed trait Employee
  case class Engineer(name: String, skills: List[String]) extends Employee
  case class Manager(name: String, teamSize: Int) extends Employee
  case class Intern(name: String, school: String) extends Employee

  def describeEmployee(emp: Employee): String = {
    emp match {
      case Engineer("john", skills) if skills.contains("scala") => s"John is a senior engineer"
      case Manager(_, teamSize) if teamSize > 10 => s"Manager with large team"
      case Intern(_, "Stanford") => s"Intern from Stanford"
      case _ => s"Regular employee"
    }
  }
  val x = List(Engineer("john",List("scala","java")),Engineer("john", List("python", "java")),Manager("hemanth",15),Manager("john", 25),Intern("john","Stanford"))
  val x2 = x.map(describeEmployee)
  x2.foreach(println)

}




