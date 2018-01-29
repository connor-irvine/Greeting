package App.models

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
