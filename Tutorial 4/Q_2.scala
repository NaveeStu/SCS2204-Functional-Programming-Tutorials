object Q2 extends App{
    printf("Enter integer : ")
    var x:Int = scala.io.StdIn.readInt()
    def checking(Numb:Int):Any = Numb match{
        case x if (x<=0) => printf("Negative/Zero")
        case x if (x%2 == 0) => printf("Even Number")
        case x if (x%2 != 0) => printf("Odd Number")
    }

    checking(x)
}
