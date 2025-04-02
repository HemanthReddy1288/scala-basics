package task.of25

//Write functions that takes list of strings and
//  Returns distinct items
//  Returns duplicate items
//  Returns small and bigger items

object Distinct extends App{
  def names(x : List[String]) : Unit ={
    val distinctItems = x.distinct
    val duplicateItems = (x.groupBy(identity).filter(_._2.size > 1).values.toList.flatten).distinct
    println(distinctItems)
    println(duplicateItems)
    val smallItem = distinctItems.minBy(_.length)
    println(smallItem)
    val bigItems = distinctItems.maxBy(_.length)
    println(bigItems)
  }
  names(List("hello","hii","hi","world","hello"))
}
