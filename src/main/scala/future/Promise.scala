package future

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
object promise extends App {
  val promises = Promise[Int]()
  val future :Future[Int] = promise.future

  Future{
    Thread.sleep(2000)
    promises.success(42)
  }

  future.map(c => println(c))
  
  
  def asynuTask() : Future[String] = {
    val promise = Promise[String]()
    
    Future{
      Thread.sleep(3000)
      promise.success("operation complete")
    }
    promise.future
  }
  val result = asynuTask()
  result.map(println)



}
