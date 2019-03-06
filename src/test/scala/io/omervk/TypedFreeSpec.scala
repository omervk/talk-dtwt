package io.omervk

import eu.timepit.refined.api._
import eu.timepit.refined.numeric._
import org.scalatest._

class TypedFreeSpec extends FreeSpec with Matchers {
  implicit class IntRefinedPositiveOps(val number: Int Refined Positive) {
    def shouldBeTypedEqual(rhs: Int Refined Positive): Assertion = {
      number should equal(rhs)
    }
  }

  implicit class AnyOps(val any: Any) {
    def shouldBeTypedEqual(rhs: Any): Assertion = {
      any should equal(rhs)
    }
  }
}
