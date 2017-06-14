package restSpec

import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.test.Helpers._
import play.api.test._

/**
  * Created by Taha on 04.06.2017.
  */
@RunWith(classOf[JUnitRunner])
class ProductsSpec extends Specification {

  "ProductsSpecs" should {

    "respond with a json representation for all products" in new WithApplication{
      val response = route(FakeRequest(GET, "/api/pizzas")).get
      status(response) must equalTo(OK)
      contentType(response) must beSome.which(_ == "application/json")
    }

    "respond with a json representation for an specific pizza" in new WithApplication{
      val response = route(FakeRequest(GET, "/api/pizza/2")).get
      status(response) must equalTo(OK)
      contentType(response) must beSome.which(_ == "application/json")
    }
  }

}
