package com.andysprague.codegolf

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class WhoIsTheTallestTest extends FunSuite with ShouldMatchers {

  test("From (5,3,9,8,7), the tallest is 8") {
    val tallest = WhoIsTheTallest.f(List(5,3,9,8,7))
    tallest should be (8)
  }

  test("From (1,2,9,4), the tallest is 9") {
    val tallest = WhoIsTheTallest.f(List(1,2,9,4))
    tallest should be (9)
  }

  test("From (9,3,8,7,4,12,5), the tallest is 4") {
    val tallest = WhoIsTheTallest.f(List(9,3,8,7,4,12,5))
    tallest should be (4)
  }
}
