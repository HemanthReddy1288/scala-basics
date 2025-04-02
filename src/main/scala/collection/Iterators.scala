package collection

object Iterators extends App{
  val v= Array(5,4,3,7,8,9)
  val i=v.iterator
  while(i.hasNext)
    println(i.next+" ")

  val x= Iterator(4,5,7,8,0)
  for (k<-x)
    println(k)
}
