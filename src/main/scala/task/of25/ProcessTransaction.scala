package task.of25



//Write a function processTransaction that processes a financial transaction. You need to:
//
//    Retrieve the Account using the Option[Account].
//    Check if the account has sufficient balance using Option[Double].
//    If the balance is sufficient, deduct the amount and return Some(transaction success).
//    If any step fails, return None.
//
//    Case classes:
//
//    case class Account(id: Int, balance: Option[Double])
//
//    // Lookup functions (simulate database lookups)
//    def getAccountById(accountId: Int): Option[Account]
//    Input: Account ID and transaction amount.
//    Output: Option[String] with the transaction result.



object ProcessTransaction extends App{
  case class Account(id: Int, balance: Option[Double])

  def getAccountById(accountId: Int,data : Account): Option[String] ={
    data match{
      case Account(id:Int,Some(value)) if (accountId == id ) =>
        value match {
          case _:Double  => Some(s"transaction success")
          case _ => Some(s"no balance information")
        }
      case _ => Some(s"account not found")
    }
  }

  val hbase = Account(123,Some(1000))
  println(getAccountById(123,hbase))
}
