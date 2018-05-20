object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if(a <= b){
      return greatestCommonDivisor(b,a)
    }
    if(a == 0){
        return a
    }else if (b == 0){
        return a
    }else{
      return greatestCommonDivisor(b,a % b)
    }
  }
}