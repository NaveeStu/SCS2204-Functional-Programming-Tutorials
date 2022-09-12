object Q3 extends App{

    val acc1= new BankAccount("David",22275,10500.00)
    val acc2= new BankAccount("Jim",32478,5700.00)

    acc1.transfer(acc2,3700.00)
    println("Balances After money transfer")
    println(acc1)
    println(acc2)

}

class BankAccount(id:String,n:Int,b:Double){
    var ID:String=id
    var accNo:Int =n
    var balance:Double =b

    def withdraw(n:Double) = {
    this.balance=this.balance-n
    }

    def deposit(n:Double) = {
    this.balance=this.balance+n
    }

    def transfer(acc:BankAccount,n:Double) = {
    this.withdraw(n)
    acc.deposit(n)
    }

    override def toString = "["+ID+":"+accNo+":"+balance+"]"
    
}
