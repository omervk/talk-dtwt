package io.omervk

object Calculator {
  /*
    Adds up a non empty list of natural numbers (positive integers)
   */
  def addAll(maybeListOfSomethings: Any): Any = {
    if (maybeListOfSomethings == null) {
      throw new IllegalArgumentException("Argument may not be null")
    }

    if (!maybeListOfSomethings.isList) {
      throw new IllegalArgumentException("Argument must be a list")
    }

    if (maybeListOfSomethings.isEmpty) {
      throw new IllegalArgumentException("Argument must have at least one element")
    }

    var sum = 0

    for (something <- maybeListOfSomethings) {
      if (something == null) {
        throw new IllegalArgumentException("Argument contained a null value")
      }

      if (!something.isInt) {
        throw new IllegalArgumentException(s"Argument contains a non-numeric value ${something.toString}")
      }

      if (something <= 0) {
        throw new IllegalArgumentException(s"Argument contains a non-positive value ${something.toString}")
      }

      sum = sum + something
    }

    sum
  }
}
