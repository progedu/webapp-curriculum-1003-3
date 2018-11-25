object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = (a, b) match {
    case (0, _) => b
    case (_, 0) => a
    case (_, _) => greatestCommonDivisor(b, a % b)
  }

}
