import kotlin.random.Random
class Die {
    var type: String
    var sides: Int
    var currentSide: Int

    constructor() {
        type = "d6"
        sides = 6
        currentSide = Random.nextInt(1, sides + 1)
    }

    constructor(sides: Int) {
        type = "d$sides"
        this.sides = sides
        currentSide = Random.nextInt(1, sides + 1)
    }

    constructor(type: String, sides: Int) {
        this.type = type
        this.sides = sides
        currentSide = Random.nextInt(1, sides + 1)
    }

    fun roll() {
        currentSide = Random.nextInt(1, sides + 1)
    }
}
