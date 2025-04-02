package future

import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global




object ForComprehension extends App{
  val future1 = Future{ 10 }
  val future2 = Future { 50 }

  val resultFuture = for {
    a <- future1
    b <- future2
  } yield a + b

  //resultFuture.map(println)
  resultFuture.onComplete {
    case Success(value) => println(s"Result: $value") // Output: Result: 10
    case Failure(ex) => println(s"Failed: ${ex.getMessage}")
  }

  val futures = List(
    Future { Thread.sleep(1000); 10},
    Future {Thread.sleep(1000); 20 },
    Future { Thread.sleep(1000); 30 }
  )
  val combinedFuture = Future.sequence(futures)
  combinedFuture.map(result => println(result) )


}
