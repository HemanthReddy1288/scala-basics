package future




import scala.concurrent.Future
import scala.util._
import scala.concurrent.ExecutionContext.Implicits.global

object Parallel extends App{
  val slowFuture = Future { Thread.sleep(5000); "Slow"}
  val fastFuture = Future { Thread.sleep(2000); "Fast"}
  Thread.sleep(9000)

  val firstCompleted = Future.firstCompletedOf(Seq(slowFuture, fastFuture))
  firstCompleted.map(result => println(s"Fastest Result: $result"))
}
