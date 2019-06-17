package com.andysprague.codegolf

import org.scalatest.FunSuite
import org.scalatest.Matchers

class MarqueeSignLettersTest extends FunSuite with Matchers {

  test("official test case 1") {
    val input = List("ONE", "TWO", "THREE", "SEVENTEEN")
    val expected = List("ENO", "TW", "EHR", "EENSV")
    MarqueeSignLetters.f(input).map(_.sorted) should be (expected)
  }

  test("official test case 2") {
    val input = List("ONE", "TWO", "ONE", "THREE")
    val expected = List("ENO", "TW", "", "EHR")
    MarqueeSignLetters.f(input).map(_.sorted) should be (expected)
  }

  test("official test case 3") {
    val input = List("ABC", "AABC", "ABBC", "ABCC", "AABBCC")
    val expected = List("ABC", "A", "B", "C", "")
    MarqueeSignLetters.f(input).map(_.sorted) should be (expected)
  }

  test("official test case 4") {
    val input = List("SHORT", "LOONG", "LOOOONG", "LOOOOOOONG", "SHORT", "LOOONG")
    val expected = List("HORST", "GLNO", "OO", "OOO", "", "")
    MarqueeSignLetters.f(input).map(_.sorted) should be (expected)
  }

  //Ungolfed
  test("Ungolfed test case 1") {
    val input = List("ONE", "TWO", "THREE", "SEVENTEEN")
    val expected = List("ENO", "TW", "EHR", "EENSV")
    MarqueeSignLetters.NewLettersPerDay(input).map(_.sorted) should be (expected)
  }

  test("Ungolfed test case 2") {
    val input = List("ONE", "TWO", "ONE", "THREE")
    val expected = List("ENO", "TW", "", "EHR")
    MarqueeSignLetters.NewLettersPerDay(input).map(_.sorted) should be (expected)
  }

  test("Ungolfed test case 3") {
    val input = List("ABC", "AABC", "ABBC", "ABCC", "AABBCC")
    val expected = List("ABC", "A", "B", "C", "")
    MarqueeSignLetters.NewLettersPerDay(input).map(_.sorted) should be (expected)
  }

  test("Ungolfed test case 4") {
    val input = List("SHORT", "LOONG", "LOOOONG", "LOOOOOOONG", "SHORT", "LOOONG")
    val expected = List("HORST", "GLNO", "OO", "OOO", "", "")
    MarqueeSignLetters.NewLettersPerDay(input).map(_.sorted) should be (expected)
  }

}
