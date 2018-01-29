package App.models

class SavingsAccount(accountNumber: String, balance : Double) extends BankAccount(accountNumber, balance) {

  override def deposit(amount: Double): SavingsAccount = new SavingsAccount(accountNumber, balance + amount)
  override def withdraw(amount: Double): SavingsAccount = new SavingsAccount(accountNumber, balance - amount)
  }
