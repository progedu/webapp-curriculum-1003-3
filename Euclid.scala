object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0) return b
    if (b == 0) return a
    greatestCommonDivisor(b, a%b)
  }

  //println(Euclid.greatestCommonDivisor(24, 36))
}
