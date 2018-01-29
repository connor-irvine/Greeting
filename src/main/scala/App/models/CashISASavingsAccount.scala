package App.models

final class CashISASavingsAccount(accountNumber: String, balance : Double, private val depositThreshold : Double = 200) extends BankAccount(accountNumber, balance) {

  override def deposit(amount: Double): BankAccount = {
    if (amount > depositThreshold) {
      val difference = amount - depositThreshold
      println(s"You can't deposit more  than £$depositThreshold, Excess:$difference")
      new CashISASavingsAccount(accountNumber, balance + depositThreshold)
    }else{
      new CashISASavingsAccount(accountNumber, balance + amount)
    }
  }
  override def withdraw(amount: Double): BankAccount = {
    println(s"You can't withdraw from an ISA")
    this
  }
}
