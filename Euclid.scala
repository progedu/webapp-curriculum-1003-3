object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0 || b == 0) {
      println("最大公約数なし")
      return a + b
    } else if (a == b) {
      a
    } else if (a > b) {
      val c = a - b
      if (c >= b) {
        greatestCommonDivisor(c, b)
      } else {
        greatestCommonDivisor(b, c)
      }
    } else {
      greatestCommonDivisor(b, a)
    }
  }
//  println(greatestCommonDivisor(1649, 221))
//  println(greatestCommonDivisor(0, 221))
}
