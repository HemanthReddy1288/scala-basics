package collection

import scala.collection.mutable.ListBuffer

object ListBuffers extends App{
   var name=ListBuffer[String]()
   name += "hello"
   name += "world"
   name += "!"
   println(name)
}
