package task.of25

import scala.annotation.tailrec


//Given a nested Map structure:
//    ********
//    val users = Map(
//      "Alice" -> Map("age" -> 25, "city" -> "NYC"),
//      "Bob" -> Map("age" -> 30, "city" -> "SF"),
//      "Charlie" -> Map("city" -> "LA")
//    )
//    ********
//    Write a function getUserInfo(name: String): String that:
//
//    Returns "Alice is 25 years old" if Alice exists and has an "age" field.
//    Returns "Bob lives in SF" if Bob exists and has a "city" field.
//    Returns "Charlie has no age data" if Charlie exists but has no "age".
//    Returns "User not found" if the name does not exist.



object NestedMap extends App{
  val users = Map(
       "Alice" -> Map("age" -> 25, "city" -> "NYC"),
       "Bob" -> Map("age" -> 30, "city" -> "SF"),
       "Charlie" -> Map("city" -> "LA")
      )
  def getUserInfo(name: String): String ={
    users.get(name) match{
      case Some(info) if name == "Alice" && info.contains("age") => s"$name is 25 years old "
      case a @ Some(info) if name == "Bob" && info.contains("city") => s"$name lives in SF $a"
      case None => s"User not found"
    }
  }
  

  println(getUserInfo("Alice"))
  println(getUserInfo("Bob"))
  println(getUserInfo("Charlie"))
}
