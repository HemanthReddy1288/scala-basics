package collection
import scala.collection.immutable.SortedSet

object Sordedsets extends App{
  val number = SortedSet(1,2,3,43,12,54,67,87,89,90,9,67)
  for (x<- number){
    println(x)
  }
  number.foreach((y)=>println(y))
  

}
