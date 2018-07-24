object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    
        if (a % b == 0){
            return b            
        } else {
            greatestCommonDivisor(b, a%b)
        }
    
  }

}
