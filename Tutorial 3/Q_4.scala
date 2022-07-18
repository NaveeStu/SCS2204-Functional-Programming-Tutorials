object Q4 extends App
{
    def bookPrice(N:Int)={
        N*24.95
    }

    def discount(price:Double)={
        price*0.4
    }

    def shippingCost(N:Int)={
        if (N<=50) 3 else (3+(N-50)*0.75)
    }

    var total = bookPrice(60) + shippingCost(60) - discount(bookPrice(60))

    printf("%f", total)
}
