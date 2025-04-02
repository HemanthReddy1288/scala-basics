package future

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
object basicFuture extends App{
  val futureResult : Future[Int] = Future {
    Thread.sleep(3000)
    10 + 20
  }
  Thread.sleep(4000)
  futureResult.map(c=> println(c))

  val fastTask = Future {
    Thread.sleep(5004); "Fast Result"
  }
  val slowTask = Future {
    Thread.sleep(5000); "Slow Result"
  }
  val firstDone = Future.firstCompletedOf(Seq(fastTask, slowTask))
  Thread.sleep(6000)
  println(firstDone)

}
