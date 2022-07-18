object Q4b extends App
{
    def attendees(p:Int) = 120+(15-p)/5*20

    def revenue(p:Int) = p*attendees(p)

    def cost(p:Int) = 500+3*attendees(p)

    def profit(p:Int) = revenue(p)-cost(p)

    printf("%d", profit(25))
}
