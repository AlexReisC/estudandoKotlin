class Animal(val name: String)

class Zoo(val animals: List<Animal>){ //classe zoo que recebe uma lista de elementos da classe animals
    //operador iterator da a capicidade de algo ser iterado
    operator fun iterator(): Iterator<Animal> { //cria dentro da classe a capacidade dela ser iterada
        return animals.iterator()
    }
}

fun main(){
    val animals = listOf(Animal("Zebra"), Animal("Lion"), Animal("Tiger"))
    val zoo = Zoo(animals)

    for(animal in zoo){
        println("Watch out, it's a ${animal.name}")
    }
}