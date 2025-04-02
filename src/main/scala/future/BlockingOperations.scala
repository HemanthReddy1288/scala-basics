package future

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.duration.Duration
import scala.concurrent.Future
import scala.util._
import scala.concurrent.ExecutionContext.Implicits.global
object BlockingOperations extends App{
  val futureRes = Future{Thread.sleep(3000)
    42
  }
  val result = Await.result(futureRes,3.seconds)
  println(result)

}
