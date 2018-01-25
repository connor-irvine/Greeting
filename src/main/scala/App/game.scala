package App

import sun.swing.table.DefaultTableCellHeaderRenderer

object game {
}
  class Point(x: Int , y: Int)

    abstract class Resource(amount: Int)

    class Mana(amount: Int) extends Resource(amount)
    class Rage(amount: Int) extends Resource(amount)
    class Gold(amount: Int) extends Resource(amount)

    abstract class Character(health: Int , resource: Resource , point: Point) {
      def move(pos: Point) : Point = pos
      def attack() : String
    }
class Mage(health: Int , resource: Mana , point: Point) extends Character(health , resource , point) {
//  override def move(pos: Point) = pos
  override def attack(): String = "I cast a spell"
}
class Cleric(health: Int , resource: Resource , point: Point) extends Character(health, resource, point) {
//  override def move(pos: Point) = pos
  override def attack(): String = "I am healing"
}
class Warrior(health: Int , resource: Resource , point: Point) extends Character(health, resource, point) {
//  override def move(pos: Point): Point = pos
  override def attack(): String = "I swinging my axe"
}
  abstract class Enemy(health: Int , resource: Gold , point: Point) extends Character(health, resource, point){

  }
class DemonDog(health: Int , resource: Resource , point: Point) extends Enemy(health, resource, point) {
  override def move(pos: Point): Point = super.move(pos)
  //NOT SURE WHAT TO PUT HERE
  override def attack(): String = "Bite!"
}

  abstract class HumanEnemy(health: Int , resource: Resource , point: Point) extends Enemy(health, resource, point){

}
class NightBourneElf(health: Int , resource: Resource , point: Point) extends HumanEnemy(health, resource, point){
  override def move(pos: Point): Point = super.move(pos)
  //NOT SURE WHAT TO PUT HERE
  override def attack(): String = "I cast a void spell"
}
class Ork(health: Int , resource: Resource , point: Point) extends HumanEnemy(health, resource, point){
  override def move(pos: Point): Point = super.move(pos)
  //NOT SURE WHAT TO PUT HERE
  override def attack(): String = "Swing sword"
}
object game extends App //NOT SURE IF THIS IS CORRECT