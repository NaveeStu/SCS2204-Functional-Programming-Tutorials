object Q1 extends App{
    val p1 = Point(2,3)
    val p2 = Point(3,4)

    println(p1+p2)

    val p3 = p1.move(5,3)
    println(p3)

    println(p1.distance(p2))

    println(p2.invert())

}

case class Point(x:Int, y:Int){

    def +(that:Point) = Point(this.x+that.x, this.y+that.y)

    def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy)

    def distance(that:Point) = math.sqrt(((this.x-that.x)*(this.x-that.x))+((this.y-that.y)*(this.y-that.y)))

    def invert() = Point(this.y, this.x)

}
