//N予備校Scalaレッスン2-3中級問題
//ユークリッドの互除法で、与えられた2つの整数の最大公約数を求める

object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if(a == 0){
      b
    } else if(b == 0){
      a
    } else {
      greatestCommonDivisor(b, a%b)
    }
  }
}
