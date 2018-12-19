package io.omervk

import org.scalatest.{FreeSpec, Matchers}

class CalculatorSpec extends FreeSpec with Matchers {
  "it should work when input is valid" in {
    Calculator.addAll(List(1, 2, 3)) should equal(6)
  }

  "it should throw an exception when input is null" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(null)
  }

  "it should throw an exception when input is an number" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(1)
  }

  "it should throw an exception when the list is empty" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(Nil)
  }

  "it should throw an exception when the list contains a null value" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(List(1, 2, null))
  }

  "it should throw an exception when the list contains a string" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(List("1"))
  }

  "it should throw an exception when the list contains a double" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(List(1.23))
  }

  "it should throw an exception when the list contains a negative number" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(List(-1))
  }
}
