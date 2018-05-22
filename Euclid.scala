object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
      if(a < 1 || b < 1){
      return -1
    }
    if (a % b == 0){
      b
    } else {
      greatestCommonDivisor(b, a%b)
    }
  }

}
