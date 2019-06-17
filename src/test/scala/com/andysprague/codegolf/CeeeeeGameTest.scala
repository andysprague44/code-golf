package com.andysprague.codegolf

import org.scalatest.Matchers
import org.scalatest.FunSuite

class CeeeeeGameTest extends FunSuite with Matchers {

  test("ceeeeGame works correctly for 'Test Cases, s'") {
    val c = new CeeeeeGame with MockOutput
    c.testableF("Test Cases", 's')

    c.messages should equal(List(
      "Test Cases",
      "Tst Cases",
      "Ts Cases",
      "TsCases",
      "Tsases",
      "Tsses",
      "Tsss"))
  }

  test("ceeeeGame works correctly for 'codegolf.stackexchange.com', 'e'") {
    val c = new CeeeeeGame with MockOutput
    c.testableF("codegolf.stackexchange.com", 'e')

    c.messages should equal(List(
      "codegolf.stackexchange.com",
      "cdegolf.stackexchange.com",
      "cegolf.stackexchange.com",
      "ceolf.stackexchange.com",
      "celf.stackexchange.com",
      "cef.stackexchange.com",
      "ce.stackexchange.com",
      "cestackexchange.com",
      "cetackexchange.com",
      "ceackexchange.com",
      "ceckexchange.com",
      "cekexchange.com",
      "ceexchange.com",
      "ceechange.com",
      "ceehange.com",
      "ceeange.com",
      "ceenge.com",
      "ceege.com",
      "ceee.com",
      "ceeecom",
      "ceeeom",
      "ceeem",
      "ceee"))

  }

  test("ceeeeGame non-golfed works correctly for 'Test Cases, s'") {
    val c = new CeeeeeGame with MockOutput
    val messages = c.ceeeeeGamedNonGolfed("Test Cases", 's')

    messages should equal(List(
      "Test Cases",
      "Tst Cases",
      "Ts Cases",
      "TsCases",
      "Tsases",
      "Tsses",
      "Tsss"))
  }

}

trait MockOutput extends Output {
  var messages: Seq[String] = Seq()

  override def print(s: String): Unit = messages = messages :+ s
}

