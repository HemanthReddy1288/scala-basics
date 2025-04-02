package practice1

import scala.::

object demo4 extends App {
//  val x = 121.toString
//  val y = x.reverse
//  println(x==y)
//
//  val list = List("a","b","c","d","e","f","g","a","b","c")
//  val dis = list.distinct
//  val dup = list.filterNot(_)
//  println(dup)
//
//  // val ab=list.groupBy(identity).filter(_._2.size>1).flatMap(_._2)
////  println(ab)
//
//
//   val list2 = list.groupBy(identity)
//   val list3 = list2.filter(c => c._2.size>=2 )
//   println(list3)
//
//
//   val list4 = List("a","b","c","d","e","f","g","a","b","c")
//   val list5 = list4.distinct
//   val list6 = list4.diff(list5)
//   println(list6)
//
//  val list7 = List("a", "b", "c", "d", "e", "f", "g", "a", "b", "c")

  val a0 =List("vashal","ravi","vashal").mkString
//  val a3 = a1.distinct
//  //val a2 = a1.map(c => c.)
//  val a4 = a3.map(c => a1.count(c))


  val a1 = List("vashal", "ravi", "vashal")
  val a2 = a1.groupBy(identity).map{case (word,count)=> (word,word.size)}
  println(a2)

  val a11 =List("vashal","ravi","vashal").mkString
  val a22 = a11.groupBy(identity).map{(word,count) => (word,count.size)}
  val x = "nived".substring(2,3)
  println(x)

  a22.foreach({(word,counts) =>
    if (counts > 1 )
      println(s"$word  -> $counts")
  })

  //Symbol       Value
  //I             1
  //V             5
  //X             10
  //L             50
  //C             100
  //D             500
  //M             1000

  val mapitems: Map[String,Int]  = Map("I" -> 1,"V" -> 5,"X" -> 10,"L" -> 50,"C" -> 100,"D" -> 500,"M" -> 1000)
  /*val s = "MCMXCIV".sliding(2).map(c => {
    if(mapitems.getOrElse(c.charAt(0).toString,0)>mapitems.getOrElse(c.charAt(1).toString,0)){
      println( mapitems.getOrElse(c.charAt(0).toString,0))
      val y=mapitems.getOrElse(c.charAt(0).toString,0)
      y
    }else {
      val x=(mapitems.getOrElse(c.charAt(1).toString,0))-(mapitems.getOrElse(c.charAt(0).toString,0))
      x
    }
  }).sum*/
  val sliders = "MCMXCIV".sliding(2)
  println(sliders)
  val res=sliders.map(s=>{
    val firstValue = mapitems.getOrElse(s.charAt(0).toString,0)
    val secondValue = mapitems.getOrElse(s.charAt(1).toString,0)
    if(firstValue > secondValue){
      val ab=firstValue
      ab
    }else {
      val x=secondValue-firstValue
      x
    }
  })
  println(res.sum)

  //val xcv = s.map(c => {

//  val res = mapitems.filter(c => s.contains(c._1) )
//  println(res)
//  val res2 = res.map{(key,value) => value}.sum
//  println(res2)

  val x1 : Option[String] = Option("hello")
  val x2 = x1.isEmpty
  println(x1)
  println(x2)
  val x3 = Option(1,2,3)


  val sumOfTwo = List(2,7,11,15)
  val target = 26
  val x22333 = sumOfTwo.combinations(2).toList
  val x233 = x22333.filter(_.sum == target)
  println(x233)

  val lisilsis = List(1,2,3,4)
  val lsk = 2
  val hello = lisilsis.filter(c => c == lsk)
  println(hello)















}
