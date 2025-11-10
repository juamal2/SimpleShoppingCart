sealed trait ShoppingItem {val value: BigDecimal; val name: String}

case object Apple extends ShoppingItem{ val value = 0.60; val name = "apple"}

case object Orange extends ShoppingItem{ val value = 0.25; val name = "orange"}