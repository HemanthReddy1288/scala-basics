package data.structures
import scala.collection.mutable.Stack

object Stacks extends App{
  val  stack = Stack[Int]()
  stack.push(1)
  stack.push(2)
  stack.push(3)
  println(s"Stack after pushes : $stack")

  val topElement = stack.top
  println(topElement)
  val topElement2 = stack.top
  println(topElement2)

  val popElement = stack.pop()
  println(popElement)
  println(stack)
  stack.push(99)
  println(stack.isEmpty)

  for (element <- stack){
    println(element)
  }

}
