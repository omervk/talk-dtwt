package io

import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.Positive

package object omervk {
  implicit class Abominations(val something: Any) extends AnyVal {
    def isList: Boolean = something.isInstanceOf[List[Any]]

    def isEmpty: Boolean = something.asInstanceOf[List[Any]].isEmpty

    def foreach(f: Any => Unit): Unit = something.asInstanceOf[List[Any]].foreach(f)

    def isInt: Boolean = something.isInstanceOf[Int]

    def <=(zero: Int): Boolean = something.asInstanceOf[Int] <= zero
  }

  implicit class IntAbominations(val number: Int) extends AnyVal {
    def +(something: Any): Int = number + something.asInstanceOf[Int]
  }

  implicit class IntRefinedPositiveOps(val number: Int Refined Positive) {
    def + (other: Int Refined Positive): Int Refined Positive = {
      Refined.unsafeApply(number.value + other.value)
    }
  }
}
