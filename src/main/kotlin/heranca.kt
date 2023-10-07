// Herança simples
open class Dog{ // Para que a classe poss ser herdada é preciso que esteja open, por padrão as classes sao final.
    open fun sayHello(){ // O mesmo para funções (métodos)
        println("Au au!")
    }
}

class Yorkshire: Dog(){ // A classe Yorkshire esta herdando Dog, Yorkshire é um cachorro
    override fun sayHello() { // Para sobrescrever uma função usa-se a palavra 'override'
        println("Wif wif!")
    }
} 

// Herança com construtor com parametro
open class Tiger(val origin: String){
    fun sayHello(){
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

// Herança Passando Argumentos do Construtor para a Superclasse
open class Lion(val name: String, val origin: String){
    fun sayHello(){
        println("A lion $name from $origin says: rwwaaaa!")
    }
}
//A classe recebe uma string nome e passa para a superclasse
class Asiatic (name: String): Lion(name = name, origin = "India")  

fun main() {
	val dog: Dog = Yorkshire() // Tambem é possivel usar a inferencia de tipo -> val dog = Yorkshire()
    dog.sayHello()
    
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
    
    val lion: Lion = Asiatic("Rufos")
    lion.sayHello()
    
}