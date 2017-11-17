package com.andysprague.codegolf

object WhoIsTheTallest {
  //http://codegolf.stackexchange.com/questions/101635/who-is-the-tallest

  def f(a:List[Int]):Int={val (y,n)=(0+:a:+0).sliding(3).toList.partition(l=>l.max==l(1));if(y.length>1)f(n.map(_(1)))else y(0)(1)}

  def whoIsTallestNonGolfed(a: List[Int]): Int = {
    val (handUp, handDown) = (0 +: a :+ 0).sliding(3).toList.partition {
      case x :: y :: z :: Nil => y > x && y > z
    }
    if (handUp.length > 1)
      whoIsTallestNonGolfed(handDown.map(_(1)))
    else
      handUp.head(1)
  }



}