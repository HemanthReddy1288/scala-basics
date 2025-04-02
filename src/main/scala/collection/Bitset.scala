package collection
import scala.collection.immutable.BitSet

object Bitset extends App{
  val bitset = BitSet(0,1,2,3)
  println(s"Element 2=${bitset(2)}")
  println(s"Element 4=${bitset(4)}")
   val bs2= bitset + 10 +11
   println(bs2)
   val bs3= bs2 ++ BitSet(22,33)
   println(bs3)
   val bs4 = bs3 - 2
   println(bs4)
   val bs5 = bs4 -- BitSet(10,20)
   println(bs5)
   val empthSet= BitSet.empty
   println(empthSet)





}
