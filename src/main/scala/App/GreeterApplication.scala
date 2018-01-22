package App

import scala.io.StdIn


object GreeterApplication extends App {
  def greet(name: String): Unit = {
    if (name == "Michael") {
      println("Clear off you mug")
    } else {
      println(s"Hello $name")
    }
  }

  val name = StdIn.readLine("What is your name? ")

  greet(name)
}