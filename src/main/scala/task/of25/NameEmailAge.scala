package task.of25

//) Write a function submitForm that performs a multi-step validation and submission of a form. The steps are as follows:
//
//    Validate the user's name (ensure it's not empty).
//    Validate the user's email (ensure it contains "@" symbol).
//    Validate the user's age (ensure it's greater than or equal to 18).
//    If any of the steps fail, return None. If all steps are successful, return Some(FormData).
//
//    Case class:
//
//    case class FormData(name: String, email: String, age: Int)
//
//    // Validation functions
//    def validateName(name: String): Option[String]
//    def validateEmail(email: String): Option[String]
//    def validateAge(age: Int): Option[Int]
//    Input: Name, email, and age.
//    Output: Option[FormData] representing the valid form data.


object NameEmailAge extends App{

  case class FormData(name: String, email: String, age: Int)

  def validateName(name: String): Option[String] ={
    name match{
      case name if(name.nonEmpty) => Some(s"$name")
      case name if(name.isEmpty) => None
    }
  }
  def validateEmail(email: String): Option[String] ={
    email match {
      case email if(email.contains("@")) => Some(s"$email")
      case email  => None
    }

  }
  def validateAge(age: Int): Option[Int] ={
    age match {
      case age if(age >= 18) => Some(age)
      case age => None
    }

  }
  def submitForm(name : Option[String],email : Option[String], Age : Option[Int]) : Option[String] ={
    name match {
      case Some(name) =>
        email match {
          case Some(mail) =>
            Age match {
              case Some(value) => Some(s"$name $mail $value")
              case None => None
            }
          case None => None
        }
      case None => None
    }
  }
  println(submitForm(validateName("hello"),validateEmail("hello@gmail.com"),validateAge(24)))


}
