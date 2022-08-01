object Q1 extends App{
    def interest(amount:Double):Double = {
        amount match{
            case d if d<0 => 0
            case d if d<20000 => d*.02
            case d if d<200000 => d*.04
            case d if d<2000000 => d*.035
            case d if d>=2000000 => d*.065
        }
    }
    printf("%.2f", interest(987900))
}
