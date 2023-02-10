package org.example
import org.example.Die as Die
class DiceRunner{
fun main() {

    val d6 = Die()
    val d20 = Die(20)
    var type : String
    println("Enter the number of sides for your dice:")
    var sides : Int = readln().toInt()
    type = "d$sides"
    val userdice = Die(type,sides)
    println("user choice dice:")
    println("$type : ${userdice.currentSide}")

    println("Current Sides:")
    println("d6: ${d6.currentSide}")
    println("d20: ${d20.currentSide}")
    

    d6.roll()
    d20.roll()


    println("Sides after dice rolled.")
    println("d6: ${d6.currentSide}")
    println("d20: ${d20.currentSide}")
   

    d6.currentSide = d6.sides
    println("d6: ${d6.currentSide}")

    val dice = mutableListOf<Die>()
    for (i in 1..5) {
        dice.add(Die())
    }

    var rolls = 0
    var fiveOfAKind = false
    while (!fiveOfAKind) {
        for (die in dice) {
            die.roll()
            if (die.currentSide != dice[0].currentSide) {
                break
            }
            if (die == dice.last()) {
                fiveOfAKind = true
            }
        }
        rolls++
    }
    println("It took $rolls rolls to get 5 of a kind.")
}
}