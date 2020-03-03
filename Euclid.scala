object Euclid extends App{
    def greatestCommonDivisor(a:Int,b:Int):Int={
        if(a==0) b;
        else if(b==0) a;
        else if(a<b)greatestCommonDivisor(b,a)
        else greatestCommonDivisor(b,a%b)
    }
}