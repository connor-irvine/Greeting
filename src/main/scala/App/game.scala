//package App
//
//object game extends App {
//
//  val Michael: Character = new Mage(100, new Mana(150), new Point(6,9))
//  val Doug: Character = new Cleric(100, new Mana(75), new Point(9,6))
//  val Connor: Character = new Warrior(100, new Rage(500), new Point(2,2))
//  val Stacey: Character = new DemonDog(100, new Gold(15), new Point (20,20))
//  val Jessica: Character = new NightBourneElf(100, new Gold(25), new Point(30,21))
//  val Katie: Character = new Ork(100, new Gold (5), new Point(25,25))
//
//
//  println(Michael.attack())
//  println(Doug.attack())
//
//}
//  class Point(val x: Int , val y: Int)
//
//
//override def String: String = s"Current position: $x, $y"
//
//    abstract class Resource(amount: Int)
//
//    class Mana(amount: Int) extends Resource(amount)
//    class Rage(amount: Int) extends Resource(amount)
//    class Gold(amount: Int) extends Resource(amount)
//
//    abstract class Character(health: Int , resource: Resource , var point: Point) {
//      def move(pos: Point)= {
//        val diffX = Math.abs(pos.x - point.x)
//        val diffY = Math.abs(pos.y - point.y)
//
//        if ((diffX <= 1) && (diffY <= 1)) {
//          point = pos
//          point
//
//        } else {
//          println(s"You can't move this much")
//        }
//      }
//      def attack() : String
//    }
//class Mage(health: Int , resource: Mana , point: Point) extends Character(health , resource , point) {
////  override def move(pos: Point) = pos
//  override def attack(): String = "I cast a spell"
//}
//class Cleric(health: Int , resource: Mana , point: Point) extends Character(health, resource, point) {
////  override def move(pos: Point) = pos
//  override def attack(): String = "I am healing"
//}
//class Warrior(health: Int , resource: Rage , point: Point) extends Character(health, resource, point) {
//  override def move(pos: Point) = {
//    val diffX = Math.abs(pos.x - point.x)
//    val diffY = pos.y - point.y
//
//    if ((diffX <= 5) && (diffY <= 1)) {
//      point = pos
//      point
//    } else {
//      println("You can only charge along 5 slots!")
//    }
//  }
//  override def attack(): String = "I swinging my axe"
//}
//  abstract class Enemy(health: Int , resource: Gold , point: Point) extends Character(health, resource, point){
//
//  }
//class DemonDog(health: Int , resource: Gold , point: Point) extends Enemy(health, resource, point) {
//  override def move(pos: Point): Point = super.move(pos)
//  override def attack(): String = "Bite!"
//}
//
//  abstract class HumanEnemy(health: Int , resource: Gold , point: Point) extends Enemy(health, resource, point){
//
//}
//class NightBourneElf(health: Int , resource: Gold , point: Point) extends HumanEnemy(health, resource, point){
//  override def move(pos: Point) = {
//    val diffX = Math.abs(pos.x - point.x)
//    val diffY = pos.y - point.y
//
//    if ((diffX <= 3) && (diffY <= 3)) {
//      point = pos
//      point
//    } else {
//      println("You can only charge along 3 slots!")
//    }
//  }
//  override def attack(): String = "I cast a void spell"
//}
//class Ork(health: Int , resource: Gold , point: Point) extends HumanEnemy(health, resource, point){
//  override def move(pos: Point): Point = super.move(pos)
//  override def attack(): String = "Swing sword"
//}
