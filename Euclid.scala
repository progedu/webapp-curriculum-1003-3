object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    val mod = a % b
    if (mod == 0) b else greatestCommonDivisor(b, mod)
  }

}
