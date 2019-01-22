object Euclid extends App {

  // ユークリッド互除法で最大公約数を求める
  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (a == 0) {
      b
    } else if (b == 0) {
      a
    } else {
      greatestCommonDivisor(b, a % b)
    }
  }

}
