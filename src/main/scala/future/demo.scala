//package future
//
//import scala.concurrent.Future
//
//object demo extends App {
//  val future1 = Future {
//    Thread.sleep(2000); 10
//  }
//  val future2 = Future {
//    Thread.sleep(2000); 20
//  }
//
//
//  val parallelFuture = Future.sequence(Seq(future1, future2)).map(_.sum)
//
//  println(parallelFuture)
//}