package task.of25

//Imagine a system with users, orders, and profiles. Each User has an Option[Profile],
// and each Profile has an Option[Address]. Write a function getUserAddress that safely retrieves
// a user's address given a user ID.
//
//    First, you need to retrieve the user from a database (simulated here with Option[User]).
//    If the user is found, retrieve their profile (Option[Profile]).
//    If the profile exists, retrieve the address (Option[Address]).
//    If any of these steps return None, the function should return None. Otherwise, it should return the address wrapped in Some.
//
//
//    case class User(id: Int, profile: Option[Profile])
//    case class Profile(address: Option[Address])
//    case class Address(street: String, city: String, country: String)
//    Input: A user ID.
//    Output: An Option[Address].
object GetUserAddress extends App{

  case class User(id: Int, profile: Option[Profile])
  case class Profile(address: Option[Address])
  case class Address(street: String, city: String, country: String)

  def getUserAddress(checkingId : Int,data:List[User]): List[Option[String]] ={
    users.map {
      case User(id, Some(value)) if (checkingId == id) =>
        value match {
          case Profile(Some(value1)) =>
            value1 match {
              case Address(street, city, country) => Some(s"$street,$city,$country")
              case _ => None
            }

          case _ => None
        }

      case _ => None
    }
  }

  val users =List( User(
    101,
    Some(Profile(
      Some(Address(
        "abcd","hyderabd","India"
      ))
    ))), User(102,
      Some(Profile(
        Some(Address(
          "abcd","hyderabd","India"
        ))
      ))))

  val x = List(101,102,103)
  println(x.map(c =>getUserAddress(c,users)))

  //---------------------------------------------
  def getUserAddress1(checkingId: Int, data : User): Option[String] = {
    data match{
      case User(id, Some(value)) if (checkingId == id) =>
        value match {
          case Profile(Some(value1)) =>
            value1 match {
              case Address(street, city, country) => Some(s"$street,$city,$country")
              case _ => None
            }

          case _ => None
        }

      case _ => None
    }
  }

  val user = User(
    101,
    Some(Profile(
      Some(Address(
        "abcd", "hyderabd", "India"
      ))
    )))
  println(getUserAddress1(101,user))

}
