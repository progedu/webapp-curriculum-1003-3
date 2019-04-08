object Euclid extends App {
  println(greatestCommonDivisor(0, 0) == 0)
  println(greatestCommonDivisor(12, 0) == 12)
  println(greatestCommonDivisor(12, 18) == 6)

  def greatestCommonDivisor(a: Int, b: Int): Int = (a, b) match {
    case (0, _) => b
    case (_, 0) => a
    case (a, b) => greatestCommonDivisor(b, a % b)
  }
}