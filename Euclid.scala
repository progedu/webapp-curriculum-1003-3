object Euclid extends App {

  val num1 = 36
  val num2 = 24

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0) {
      b
    } else if (b == 0) {
      a
    } else {
      greatestCommonDivisor(b, a % b)
    }
  }
  println(greatestCommonDivisor(num1, num2))
}
