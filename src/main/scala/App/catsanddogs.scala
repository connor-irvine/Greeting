//package App
//
//  object catsanddogs extends scala.App {
//
//
//    val jess: Animal = new Cat()
//    val lassie: Animal = new Dog()
//    val bruce: Animal = new Shark()
//    val izzy: Animal = new Unicorn()
//    val VanHielsing = new Wolf()
//    val Border = new BorderTerrier()
//    val Prince = new PersianCat()
//    val meowth = new Meowth(coins = 100 , teamrocket = true)
//    val meowth2 = new Meowth(coins = 50 , teamrocket = false)
//    val fred = new Labrador()
//
//
//    println(jess.speak)
//    println(lassie.speak)
//    println(bruce.speak)
//    println(izzy.speak)
//    println(VanHielsing.speak)
//    println(s"${Border.hunt} ${Border.speak}")
//    println(Prince.speak)
//    println(meowth.speak)
//    println(meowth2.speak)
//    println(s"${fred.work} ${fred.speak}")
//  }
//    abstract class Animal {
//      def speak: String
//    }
//  class Cat extends Animal {
//    override def speak: String = "meow"
//  }
//
//  class Dog extends Animal {
//    override def speak: String = "woof"
//
//  }
//
//    class Shark extends Animal {
//      override def speak: String = "Sharkbait oh haha"
//    }
//
//class Unicorn extends Animal {
//  override def speak: String = "I don't exist"
//}
//
//class Wolf extends Dog {
//  override def speak: String = "howl"
//}
//
//class BorderTerrier() extends Dog{
//  def hunt: String = "I am hunting"
//}
//class PersianCat() extends Cat{
//  override def speak: String = super.speak
//}
//class Meowth(coins : Int, teamrocket : Boolean) extends Cat{
//  override def speak: String = "Thats Right! I have " + coins + " coins" + rocket
//  val rocket = if (teamrocket) " I am a member of Team Rocket" else " I didn't get into the club"
//}
//class Labrador extends Dog {
//  def work: String = "I am sniffing for drugs"
//}