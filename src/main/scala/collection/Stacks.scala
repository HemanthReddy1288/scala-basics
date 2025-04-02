package collection
import scala.collection.mutable.Stack

object Stacks extends App{
  var x= Stack[Int]()
  x.push(5)
  x.push(2)
  x.push(0)
  println(x)
  var s2 = Stack[Int]()
    s2.push(1,2,3,4)
    println(s2)

  println("popped:"+ x.pop)
  println("popped:"+ x.pop)
  println("Empty :"+ x.isEmpty)
  println("popped:"+ x.pop)
  println("Empty :"+ x.isEmpty )
  println(x)
  x.push(5)
  x.push(2)
  x.push(0)
  println("top:"+x.top)
  println("size :"+ x.size)





}
