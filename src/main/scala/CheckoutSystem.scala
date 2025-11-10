

class CheckoutSystem {
  
  def Checkout (items: Seq[ShoppingItem]): BigDecimal = {
    items.map(_.value).sum
  }

}