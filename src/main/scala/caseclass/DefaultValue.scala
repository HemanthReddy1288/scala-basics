package caseclass

case class DefaultValue (brand : String,model : String = " Model 2020" ,year: Int)

object mainn {
  def main(agrs : Array[String]): Unit = {
    val car1 = DefaultValue("tesla", year = 3)
    println(car1)
  }
}
