package patten.matching

object Basic extends App{
  val num = 2

  val result =
    num match{
      case 1 => "one"
      case 2 => "Two"
      case 3 => "three"
      case _ => "other"

    }
  println(result)

}
