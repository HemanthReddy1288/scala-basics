package future

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global

object LeakDue extends App{
  def asyncTask(): Future[Int] = {
    val promise = Promise[Int]()


    Future {
      Thread.sleep(5000)
      promise.success(44)
    }
  Thread.sleep(6000)
  promise.future
  }
}
