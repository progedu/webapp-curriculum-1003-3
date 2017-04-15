object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0 || b == 0) a + b
    else greatestCommonDivisor(b, a % b)
  }

}
