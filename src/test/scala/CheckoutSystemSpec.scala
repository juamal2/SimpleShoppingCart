import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec


class CheckoutSystemSpec extends AnyWordSpec with Matchers{

  private val checkoutSystem = new CheckoutSystem()
  val shoppingListOdd = Seq[ShoppingItem](Apple, Orange, Apple, Apple, Orange, Orange, Apple, Apple, Orange, Orange, Orange)
  val shoppingListEven = Seq[ShoppingItem](Apple, Orange, Apple, Orange)
  val shoppingListEmpty = Seq[ShoppingItem]()

  "checkoutSystem.checkout" should {
    "return the correct cost amount" in {
      checkoutSystem.Checkout(shoppingListOdd).mustEqual(4.50)
      checkoutSystem.Checkout(shoppingListEven).mustEqual(1.70)
      checkoutSystem.Checkout(shoppingListEmpty).mustEqual(0.00)
    }
  }

  "checkoutSystem.checkoutWithOffers" should {
    "return the correct cost amount" in {
      checkoutSystem.CheckoutWithOffers(shoppingListOdd).mustEqual(2.80)
      checkoutSystem.CheckoutWithOffers(shoppingListEven).mustEqual(1.10)
      checkoutSystem.CheckoutWithOffers(shoppingListEmpty).mustEqual(0.00)
    }
  }

}
