package com.andysprague.codegolf

object IsItWholeNumber {
  //https://codegolf.stackexchange.com/questions/148444/is-it-a-whole-number

  def f: Double=>Boolean = f=>f.ceil.abs==f
}
