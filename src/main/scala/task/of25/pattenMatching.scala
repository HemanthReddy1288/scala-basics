package task.of25


//Write a function that takes a list of strings and
//
//  Returns "Empty list" if the list is empty.
//  Returns "Single element: X" if the list has only one element.
//  Returns "Starts with 1" if the first element is 1.
//  Returns "has numbers" if it has numbers as strings
//  Returns "normal list" otherwise


object pattenMatching extends App{
  def string(x: List[String]): String ={
    x match {
      case Nil => s"Empty list"
      case x :: Nil => s"Single element : $x"
      case "1" :: _ => s"Starts with 1"
      case _ if x.exists(_.forall(_.isDigit))  => s"has numbers"
      case _  => s"normal list"
    }
  }
  println(string(List("1","apple", "2", "banana")))

}
