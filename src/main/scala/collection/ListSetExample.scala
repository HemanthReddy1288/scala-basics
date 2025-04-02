package collection
import scala.collection.immutable.ListSet

object ListSetExample extends App{
  val listSet= ListSet(1,2,3,3,4,5,5,6,7,7)
  val updatedSet= listSet + 9
  val removedSet= listSet - 4
  val containElement=removedSet.contains(2)
  val otherSet=ListSet(3,4,5,6,7)
  val unionSet=removedSet.union(otherSet)
  
  println("original set :"+listSet)
  println("updated set:"+ updatedSet)
  println("removed Set :"+ removedSet)
  println("contains element :"+ containElement)
  println("Union Set :"+ unionSet)
  
}
