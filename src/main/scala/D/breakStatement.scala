package D

import scala.util.control.Breaks

object breakStatement extends App{
  var x=0
  var y=0
  val a=List(5,10,15)
  val b=List(6,12,18)
  val outloop=new Breaks
  val inloop = new Breaks

  outloop.breakable{
    for (num1<-a){
      println(" "+num1)
      inloop.breakable{
        for(num2<-b){
          println(" "+num2)
        if(num2==12){
          inloop.break;
          }
        }

      }
    }
  }
}
