package App

import scala.io.StdIn

abstract class BankAccount(accountNumber : String, val balance: Double) {

  def withdraw(amount: Double)  : BankAccount
  def deposit(amount: Double) : BankAccount


  override def toString: String = s"Account Number: $accountNumber balance: $balance"

}

class SavingsAccount(accountNumber: String, balance : Double) extends BankAccount(accountNumber, balance) {

  override def deposit(amount: Double): SavingsAccount = new SavingsAccount(accountNumber, balance + amount)
  override def withdraw(amount: Double): SavingsAccount = new SavingsAccount(accountNumber, balance - amount)
  }

  final class CashISASavingsAccount(accountNumber: String, balance : Double) extends BankAccount(accountNumber, balance) {

    private val depositThreshold : Double = 200

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


class Person(name : String , age: Int, private val bankAccount: BankAccount) {

  def this(name: String, age :Int) = this(
    name = name,
    age = age,
    bankAccount = new SavingsAccount("123", 0.00))

  def this(name: String) = this(
    name = name,
    age = 0 ,
    bankAccount = new SavingsAccount("123", 0.00))

  def this(firstName: String, lastName: String) = this (
    name = s"$firstName $lastName",
    age = 0,
    bankAccount = new SavingsAccount("15432", 0.00)
  )

  private val years : String = if(age == 1) "year" else "years"

  def speak(): String = {
    if (name == "Jeff") {
      "You don't get a hello."
    } else {
      s"Hello $name you are $age $years old. \n You have $bankAccount in your account."
    }
  }
}
object Prompt {

  def ask(message : String) = StdIn.readLine(message)
}

object GreeterApplication extends App {

  val savingsAccount = new SavingsAccount("12345", 100.00)
  val savingsPlus100 = savingsAccount.deposit(50.00)
  val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask("What is your age? ")
  val p : Person = new Person(name, age.toInt)
  val child = new Person("Daniel")
  val fatchild = new Person("Xavier", 12)

  val cashISA = new CashISASavingsAccount("123456", 0.00)
  val isaDeposited = cashISA.deposit(1000.00)
  val withdrawFromISA = isaDeposited.withdraw(200.00)
  val personWithCash = new Person("Loyal customer", 56, withdrawFromISA)

  println(p.speak())
  println(personWithCash.speak())

}