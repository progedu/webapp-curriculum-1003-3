object Euclid extends App
{
    def greatestCommonDivisor(a: Int, b:Int): Int = {
        if (b==0) a
        else greatestCommonDivisor(b, a%b)
    }
}