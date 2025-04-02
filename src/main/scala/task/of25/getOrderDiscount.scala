package task.of25
//Create a function getOrderSummary that accepts the following parameters:
//
//    orderId (String).
//    orderAmount (Double).
//    promoCode (Optional[String], default value: None).
//    isDiscounted (Boolean, default value: false).
//    If a promoCode is provided, print the code; otherwise, print "No promo code applied."
//
//    If the order is discounted, apply a 10% discount to the orderAmount before printing the order summary.
object getOrderDiscount extends App{

  case class Order(orderId: String,
                   orderAmount: Double,
                   promoCode:Option[String] = None,
                   isDiscounted:Boolean = false)

  def getOrderSummary (getOrderDiscount: Order) : String ={
    getOrderDiscount match{
      case Order(orderId, orderAmount, Some(value), true)=>s"promo code is $value \n order summary is $orderId,${applyDiscount(orderAmount)}"
      case Order(orderId, orderAmount, Some(value), false)=>s"Incorrect promo code $value \n order summary is ${orderId},$orderAmount"
      case Order(orderId, orderAmount,None, _)=>s"No promo code is applied \n order summary is ${orderId},$orderAmount "


    }
  }
  def applyDiscount(orderAmount:Double):Double =orderAmount - ((orderAmount * 10) / 100)
  println(getOrderSummary(Order("hello",123.0,Option("SAVE10"),true)))
  println(getOrderSummary(Order("hello",123.0)))
  println(getOrderSummary(Order("hello",123.0,Option("SAVE10"))))



//-----------------------------------------------------------------------------------------------------------
  def getOrderSummary(orderId: String, orderAmount: Double, promoCode: Option[String] = None,isDiscounted: Boolean = false) : String ={
    if(promoCode.isDefined) {
    }
      if(isDiscounted){
        val newAmount = orderAmount-(( orderAmount * 10)/100)
        s"promoCode is $promoCode \norder summary is ($orderId,$newAmount,$promoCode,$isDiscounted)"
      }
     else{
      s"No promo code applied \norder summary is ($orderId,$orderAmount)"
    }
  }

  println(getOrderSummary("hello",123.0))
}
