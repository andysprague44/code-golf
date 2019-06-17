package com.andysprague.codegolf

import org.scalatest.FunSuite
import org.scalatest.Matchers

class IsItWholeNumberTest extends FunSuite with Matchers {

  test("332 is whole") {
    IsItWholeNumber.f(332) should be (true)
  }

  test("33.2 is not whole") {
    IsItWholeNumber.f(33.2) should be (false)
  }

  test("0.0000000 is whole") {
    IsItWholeNumber.f(0.0000000) should be (true)
  }

  test("-3 is not whole") {
    IsItWholeNumber.f(-3) should be (false)
  }

}
