package io.omervk

import org.scalatest.{FunSpec, Matchers}

class CalculatorSpec extends FunSpec with Matchers {
  it("should work") {
    Calculator.addAll(List(1, 2, 3)) should equal(6)
  }
}
