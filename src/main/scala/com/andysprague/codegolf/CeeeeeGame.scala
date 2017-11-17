package com.andysprague.codegolf

class CeeeeeGame extends Output {
  //http://codegolf.stackexchange.com/questions/100486/make-a-ceeeeeeee-program/100799#100799


  def f(s: String, c: Char) = 0.to(s.size-1)./:(s take 1)((p,i)=>if(s(i)!=c){println(p+s.drop(i+1));p}else p+s(i))

  def testableF(s: String, c: Char) = 0.to(s.size-1)./:(s take 1)((p,i)=>if(s(i)!=c){print(p+s.drop(i+1));p}else p+s(i))

  def ceeeeeGamedNonGolfed(s: String, c: Char) = {
    (0 until s.length).foldLeft((s.take(1), List[String]())) { case ((prefix, acc), i) =>
      s.charAt(i) match {
        case char if char != c =>
          (prefix, acc :+ (prefix + s.drop(i+1)))
        case char =>
          (prefix + char, acc)
      }
    }._2
  }
}

trait Output {
  def print(s: String): Unit = Console.println(s)
}
