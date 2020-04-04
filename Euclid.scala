object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (b==0){
      return a
    }else{
      return greatestCommonDivisor(b,a%b)
    }
  }
  println(greatestCommonDivisor(24,36))
}
