package App

import App.models.{BankAccount, CashISASavingsAccount, Person, SavingsAccount}
import scala.io.StdIn






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
  val fatChild = new Person("Xavier", 12)

  //the 400 is for loyal customer

  val cashISA = new CashISASavingsAccount("123456", 0.00, depositThreshold = 400
  val isaDeposited = cashISA.deposit(1000.00)
  val withdrawFromISA = isaDeposited.withdraw(200.00)
  val personWithCash = new Person("Loyal customer", 56, withdrawFromISA)

  println(p.speak())
  println(personWithCash.speak())

}