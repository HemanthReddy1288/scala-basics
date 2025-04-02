package future
import scala.concurrent.{Future,Promise}
import scala.concurrent.ExecutionContext.Implicits.global
object PromiseProblems extends App{
  val promise = Promise[Int]()
  val future : Future[Int] = promise.future

  Future{
    Thread.sleep(3000)
    promise.success(42)
  }
  Thread.sleep(4000)
  future.map(c => println(c))

  val promises = Promise[Int]()
  promises.trySuccess(10)
  promises.trySuccess(20)

  println(promises)
}
