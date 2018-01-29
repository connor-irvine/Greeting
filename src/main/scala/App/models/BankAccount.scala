package App.models

abstract class BankAccount(accountNumber : String, val balance: Double) {

  def withdraw(amount: Double)  : BankAccount
  def deposit(amount: Double) : BankAccount


  override def toString: String = s"Account Number: $accountNumber balance: $balance"

}
