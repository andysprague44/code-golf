package com.andysprague.codegolf

import org.scalatest.FunSuite
import org.scalatest.Matchers

class ALPHABETalphabetTest extends FunSuite with Matchers {

  test("non letter works") {
    ALPHABETalphabet.f('1') should be ("1")
  }

  test("lower case works") {
      ALPHABETalphabet.f('c') should be ("abcdefghijklmnopqrstuvwxyz")
  }

  test("upper case works") {
    ALPHABETalphabet.convertToAlphabet('C') should be ("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
  }

  test("non-golfed non letter works") {
    ALPHABETalphabet.convertToAlphabet('1') should be ("1")
  }

  test("non-golfed lower case works") {
    ALPHABETalphabet.convertToAlphabet('c') should be ("abcdefghijklmnopqrstuvwxyz")
  }

  test("non-golfed upper case works") {
    ALPHABETalphabet.convertToAlphabet('C') should be ("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
  }

}
