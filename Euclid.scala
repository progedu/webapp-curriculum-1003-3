object Euclid extends App {

  val num1 = 36
  val num2 = 24

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    val r = a % b
    if (r == 0) {
      return b
    }
    greatestCommonDivisor(b, r)
  }
  println(greatestCommonDivisor(num1, num2))
}
