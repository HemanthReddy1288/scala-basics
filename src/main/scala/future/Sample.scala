package future

import scala.concurrent.Future
import scala.util._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration.Duration
object Sample extends App{
  private val futureresult = Future{
    Thread.sleep(5000)
    throw new NoSuchMethodException()
  }
  Thread.sleep(6000)
  futureresult.onComplete{
    case Success(value) => println(s"$value")
    case Failure(exception) => println(exception)
  }

}
