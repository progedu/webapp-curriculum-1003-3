import scala.math.sqrt
import scala.collection.mutable

object Main extends App{
  def greatestCommonDivisor(a:Int,b:Int): Int ={
     if(a == b||a == 0||b == 0){
        a
     }
     else if(a < b){
        greatestCommonDivisor(b,a)
     }
     else {
       val c = a - b
       greatestCommonDivisor(b, c)
     }
  }
  println(greatestCommonDivisor(420,980))
}