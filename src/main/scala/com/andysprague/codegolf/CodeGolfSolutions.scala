package com.andysprague.codegolf

object CeeeeeGame {

  //http://codegolf.stackexchange.com/questions/100486/make-a-ceeeeeeee-program/100799#100799
  def dNonGolf(s: String, c: Char) = {
    (1 until s.length).foldLeft((s.head.toString, List[String]())) { case ((prefix, acc), i) =>
      s.charAt(i) match {
        case char if char != c => (prefix, acc :+ (prefix + s.drop(i)))
        case char => (prefix + char, acc)
      }
    }._2
  }

  def d(s: String, c: Char) = {
    1.to(s.size-1).foldLeft(s.take(1)){(p,i)=>val x=s.charAt(i);if(x!=c){println(p+s.drop(i));p}else p+x}
  }

}


object WhoIsTheTallest {
  //http://codegolf.stackexchange.com/questions/101635/who-is-the-tallest
  def whoIsTallest(a: List[Int]): Int = {
    val (handUp, handDown) = (0 +: a :+ 0).sliding(3).toList.partition {
      case x :: y :: z :: Nil => y > x && y > z
    }
    if (handUp.length > 1)
      whoIsTallest(handDown.map(_(1)))
    else
      handUp.head(1)
  }

  def x(a:List[Int]):Int={val (y,n)=(0+:a:+0).sliding(3).toList.partition(l=>l.max==l(1));if(y.length>1)x(n.map(_(1)))else y(0)(1)}

  val list = List(5,3,9,8,7)
  val list2 = List(1,2,9,4)
  val list3 = List(9,3,8,7,4,12,5)
  whoIsTallest(list) //8
  whoIsTallest(list2) //9
  whoIsTallest(list3) //4
  x(list)
  x(list2)
  x(list3)
}

object `Im a Palindrome.  Are you?` {
  //http://codegolf.stackexchange.com/questions/110582/im-a-palindrome-are-you/111051#111051
  def isPalindrome = (s:String)=>s.reverse==s//s==esrever.s>=)gnirtS:s(
    
  isPalindrome("abba") //true
  isPalindrome("abab") //false
}