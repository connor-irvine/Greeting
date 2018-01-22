package App

object GreeterApplication extends App {
    def greet(name : String) :Unit = println("Hello " + name)
    val name = "Connor"
  greet(name)
}
