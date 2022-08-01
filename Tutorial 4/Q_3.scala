object Q3 extends App{
    def toUpper(s:String):String = {
        s.toUpperCase()
    }

    def toLower(s:String):String = {
        s.toLowerCase()
    }

    def formatNames(name:String, text:(String) => String, index:Int*):String={

        var res = ""
        var i = 0
        while (i < name.length()){
            if (index.contains(i)){
                res = res + text(name.charAt(i).toString)
            }
            else{
                res =  res + name.charAt(i).toString
            }
            i =i + 1
        }
        res
    }


    printf("%s\n", formatNames("Benny", toUpper, 0,1,2,3,4))
    printf("%s\n", formatNames("Niroshan", toUpper, 1))
    printf("%s\n", formatNames("Saman", toLower, 0))
    printf("%s\n", formatNames("Kumara", toUpper, 5))

}
