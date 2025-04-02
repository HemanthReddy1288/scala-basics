package controlStatement

object nestedIfElse extends App{
  val a :Int = 45
  val b:Int =55
  val c :Int =65

  if (a > b){
    if(a > c){
      println("a is the highest value")
    }else{
      println("c is the highest value")
    }

  }
  else{
    if( b > c){
      println("b is the highest value")
    }else{
      println("c is the highest value")
    }

  }
}
