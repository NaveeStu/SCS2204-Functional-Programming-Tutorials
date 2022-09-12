object Q4 extends App {

    val acc1= new BankAccount1("Brian",22275,10500.00)
    val acc2= new BankAccount1("David",32478,5700.00)
    val acc3= new BankAccount1("Jim",12030,1890.00)
    val acc4= new BankAccount1("Kane",12040,-3000.00)

    var bank:List[BankAccount1]=List(acc1,acc2,acc3,acc4)

    val negbalance = bank.filter(a=>a.balance<0)
    val totbalance = bank.map((a)=>(a.balance)).reduce((a,b)=>(a+b))
    val interest = (b:List[BankAccount1])=>b.map((a) => (a.ID,a.accNo,if(a.balance>0)  (a.balance+(a.balance*0.5)) else (a.balance+(a.balance*0.1)) ))

    print("Accounts with negative balance: ")
    println(negbalance)
    print("Sum of all account balances: ")
    println(totbalance)
    print("Final balances with interest: ")
    println(interest(bank))

}

class BankAccount1(id:String,n:Int,b:Double){

    var ID:String=id
    var accNo:Int =n
    var balance:Double =b

    override def toString = "["+ID+":"+accNo+":"+balance+"]"


}
