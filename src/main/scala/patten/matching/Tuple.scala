package patten.matching

object Tuple extends App{
  val tuple = (10,"scala")

  val res = tuple match {
    case( x, "scala") => s"number: $x and language: scala"
    case (x,y) => s"unkown pair in $x and $y"

  }
  println(res)
}

