sealed trait ShoppingItem {
  val value: BigDecimal
  val name: String
  val offerAmount: Int

  def applyOffer(items: Seq[ShoppingItem]): BigDecimal = {
    val total = items.count(_.name == name)
    val totalToDiscount = items.count(_.name == name) / offerAmount
    (total * value) - (totalToDiscount * value)
  }
}

case object Apple extends ShoppingItem{ val value = 0.60; val name = "apple"
  override val offerAmount: Int = 2
}

case object Orange extends ShoppingItem{ val value = 0.25; val name = "orange"
  override val offerAmount: Int = 3
}