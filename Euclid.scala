object Euclid extends App {
  @scala.annotation.tailrec
  def greatestCommonDivisor(a: Int, b: Int): Int = {
    (a, b) match {
      case (0, b) => b
      case (a, 0) => a
      case _ => greatestCommonDivisor(b, a % b)
    }
  }

  println(greatestCommonDivisor(30, 9))
}
