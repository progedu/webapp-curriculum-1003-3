object Euclid extends App {

  def greatestCommonDivisor(big_num: Int, small_num: Int): Int = {
    if (big_num == 0) {
      small_num
    } else if (small_num == 0) {
      big_num
    } else {
      var remainder = big_num % small_num
      greatestCommonDivisor(small_num, remainder)
    }
  }

}