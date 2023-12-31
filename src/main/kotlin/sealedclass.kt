// Sealed Classes: só pode ser extendida por calsses dentro do pacote que foi criada
sealed class Mammal(val name: String)

class Cat(val catName: String): Mammal(catName)
class Human(val humanName: String, val job: String): Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal){
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main() {
    val human = Human("Milton", "Lixeiro")
	val cat = Cat("Filino")
    println(greetMammal(human))
    println(greetMammal(cat))
}