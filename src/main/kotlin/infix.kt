// Infix function: funcoes que podem ser convertidas atraves de funcoes de membros de claasses ou extensoes que tem um
// unico parametro

fun main() {
    infix fun Int.times(str: String) = str.repeat(this) // infix function aplicada ao tipo inteiro com a definicao de times
    // quando receber uma string como parametro. A funcao recebe a string e a repete quantas vezes for especificado.
    println(2 times "Bye ") // 2 é o tipo inteiro que aciona a infix function.
    
    val pair = "Ferrari" to "Katrina" // infix function nativa, cria um par de valores
    println(pair)
    
    infix fun String.onto(other: String) = Pair(this, other) // infix  function que cria um par de strings
    val myPair = "McLaren" onto "Lucas" // aplicando a infix function
    println(myPair)
    
    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    // adiciona uma Person a lista
    infix fun likes(other: Person){ likedPeople.add(other)} 
}
