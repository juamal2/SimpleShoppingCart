import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.language.postfixOps

class CheckoutSystemSpec extends AnyWordSpec with Matchers{

  private val checkoutSystem = new CheckoutSystem()

  "checkoutSystem" should {
    "return the correct cost amount" in {
      checkoutSystem.Checkout( Seq(Apple, Apple, Orange, Apple)).mustEqual(2.05)
    }
  }

}
