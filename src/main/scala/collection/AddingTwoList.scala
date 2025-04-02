package collection
import scala.collection.immutable._

object AddingTwoList extends App{
  val listSet1=ListSet("c","c++","scala","java")
  println(s"element of listSet1 = $listSet1")
  val listset2=listSet1+"python"
  println(s"adding element java to ListSet $listset2")
}

object AddingTwoListSet extends App{
  val listSet3=ListSet("c","scala","java")
  val listSet4=listSet3 ++ ListSet("python","c++")
  println(listSet4)

}
object RemoveElement extends App {
  val listSet3 = ListSet("c", "scala", "java", "python", "c++")
  val listSet4 = listSet3 - ("c++")
  println(listSet4)
}