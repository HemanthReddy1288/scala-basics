package task.of25

//Write a function matchTuple(t: (Any, Any, Any)): String that:
//
//  Returns "Three numbers" if all elements are Int.
//  Returns "String in the middle" if the second element is a String.
//  Returns "First is Boolean" if the first element is Boolean.
//  Otherwise, returns "No match".


object AnyAnyAny extends App{
  def matchTuple(t: (Any, Any, Any)): String = {
    t match {
      case (_: Int, _: Int, _: Int) => "Three numbers"
      case (_, b: String, _) => "String in the middle"
      case (a: Boolean, _, _) => "First is Boolean"
      case _ => "No match"
    }
  }
  println(matchTuple(5,"string",9))
}
