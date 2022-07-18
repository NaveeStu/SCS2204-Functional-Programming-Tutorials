object Q3 extends App
{
    def vol(r:Double)={
        var V = 4/3*math.Pi*r*r*r
        printf("%f", V)
    }

    vol(5)
}
