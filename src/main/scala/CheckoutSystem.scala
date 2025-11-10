

class CheckoutSystem {

  def Checkout (items: Seq[ShoppingItem]): BigDecimal = {
    items.map(_.value).sum
  }
  
  def CheckoutWithOffers (items: Seq[ShoppingItem]): BigDecimal = {
    items.distinct.map(_.applyOffer(items)).sum
  }

}