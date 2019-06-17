package com.andysprague.codegolf

import org.scalatest.FunSuite
import org.scalatest.Matchers

class ImAPalindromeTest extends FunSuite with Matchers {

  test("Palindrome is true for 'abba'") {
    val isPalindrome = ImAPalindrome.isPalindrome("abba")
    isPalindrome should be (true)
  }

  test("Palindrome is false for 'abab'") {
    val isPalindrome = ImAPalindrome.isPalindrome("abab")
    isPalindrome should be (false)
  }
}
