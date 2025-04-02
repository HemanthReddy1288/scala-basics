package task.of25


//   Write a higher-order function applyDiscount that accepts a function as a parameter.
//   This function should apply a discount on a given price.
//   The discount function should have the following parameters:
//
//    price (Double): the original price of the product.
//    discount (discount): the discount percentage to apply to the price (default value: 10%).
//    The higher-order function should accept the following parameters:
//
//    price (Double): the price of the product.
//    discountFn (Function): the discount function that applies a discount to the price.
//    The function should return the discounted price.

object ApplyDiscount extends App{

  def applyADiscount(price :Double,discount: Double ): Double ={
    val afterDiscount = (price * discount)/100
    price - afterDiscount
  }
////  println(applyADiscount(1000.0,10))

  def discountFunction(price :Double,discount: Double,f:(Double,Double) => Double ) : Double = {
    f(price,discount)
  }
  println(discountFunction(1000,30,applyADiscount))
//---------------------------------------------------------------------------------------------  

  def abcd(price: Double, discount: Double, f: (Double,Double) => Double): Double = f(price,discount)
  println(abcd(1000, 10,(price,discount)=>(price*discount)/100))




}
