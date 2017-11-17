package com.andysprague.codegolf

object ALPHABETalphabet {
  //https://codegolf.stackexchange.com/questions/67357/output-the-alphabet-the-alphabet-or-just-a-character

  def convertToAlphabet(c: Char): String = {
    c match {
      case x if !x.isLetter => x.toString
      case x if x.isUpper => ('A' to 'Z').mkString
      case _ => ('a' to 'z').mkString
    }
  }

  def f = (c:Char)=>{var a='a'.to('z').mkString;if(c.isUpper)a=a.toUpperCase;if(!c.isLetter)a=""+c;a}
}





