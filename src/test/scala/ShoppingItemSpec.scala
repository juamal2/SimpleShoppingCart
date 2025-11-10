import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ShoppingItemSpec extends AnyWordSpec with Matchers {

  val shoppingListOdd = Seq[ShoppingItem](Apple, Orange, Apple, Apple, Orange, Orange, Apple, Apple, Orange, Orange, Orange)
  val shoppingListEven = Seq[ShoppingItem](Apple, Orange, Apple, Orange)
  val shoppingListEmpty = Seq[ShoppingItem]()

  "Apple.applyOffer" should {
    "return the correct value" in {
      Apple.applyOffer(shoppingListOdd) mustEqual 1.80
      Apple.applyOffer(shoppingListEven) mustEqual 0.60
      Apple.applyOffer(shoppingListEmpty) mustEqual 0.00
    }
  }

  "Orange.applyOffer" should {
    "return the correct value" in {
      Orange.applyOffer(shoppingListOdd) mustEqual 1.00
      Orange.applyOffer(shoppingListEven) mustEqual 0.50
      Orange.applyOffer(shoppingListEmpty) mustEqual 0.00
    }
  }

}
