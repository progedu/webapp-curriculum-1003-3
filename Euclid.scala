object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    // a と b が 0 の場合
    if (a == 0) return b
    // 割り切れた場合
    if (b == 0) return a
    return greatestCommonDivisor(b, a % b)
  }
}
