package data.structures
import scala.collection.mutable.Queue

object Queuess extends App{
  val queue = Queue[Int]()
  queue.enqueue(1)
  queue.enqueue(2)
  queue.enqueue(3)
  queue.enqueue(4)
  queue.enqueue(5)
  println(queue)
  println(queue(4))
  val dequeueElement = queue.dequeue()
  println(queue)
  println(dequeueElement)
  val queueFront = queue.front
  println(queueFront)
  println(queue.isEmpty)
  for (result <- queue){
    println(result)
  }

}
