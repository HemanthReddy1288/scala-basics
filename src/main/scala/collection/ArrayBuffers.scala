package collection
 import scala.collection.mutable.ArrayBuffer
object ArrayBuffers extends App{
  var name = ArrayBuffer[String]()
  name += " c"
  name += " c++"
  name += " java"
  name.append("s-series","j-series")
  println(name)
  println(name(2))

  name -= " c++"
  println(name)
  name.remove(0)
  println(name)



}
