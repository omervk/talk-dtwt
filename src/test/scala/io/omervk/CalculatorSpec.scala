package io.omervk

class CalculatorSpec extends TypedFreeSpec {
  "it should work when input is valid" in {
    Calculator.addAll(List(1, 2, 3)) shouldBeTypedEqual 6
  }

  "it should throw an exception when input is null" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(null)
  }

  "it should throw an exception when input is a string" in {
    a[RuntimeException] should be thrownBy Calculator.addAll("test")
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

  "it should throw an exception when the list mixes a string and a number" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(List("1", 2))
  }

  "it should throw an exception when the list contains a double" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(List(1.23))
  }

  "it should throw an exception when the list contains a negative number" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(List(-1))
  }

  "it should throw an exception when the list contains a negative number among all of the others" in {
    a[RuntimeException] should be thrownBy Calculator.addAll(List(1, 2, -1))
  }
}
