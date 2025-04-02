package patten.matching

object Age extends App{
  val ages = 45
  val res = ages match {
    case x if x < 18 => println("minor")
    case x if x > 18 && x < 60 => println("aduit")
    case x if x > 60 => println("senior")
  }
}
