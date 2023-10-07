class Contato(val id: Int, var email: String)

//Classe Generica
class PilhaMutavel<E>(vararg items: E){ //'<E>' é usado para indicar que a classe recebe um parametro generico, 'E' pode ser qualquer coisa'
    private val elements = items.toMutableList() //a variavel  foi definida como 'private' (privada), converte os elementos do parametro para uma mutable list

    fun push(element: E) = elements.add(element) //Adiciona um elemento na lista
    fun peek(): E = elements.last() //Acessa o elemento do topo (ultimo)
    fun pop(): E = elements.removeAt(elements.size - 1) //remove o elemento do topo (ultimo)
    fun isEmpty() = elements.isEmpty() //verifica se a lista esta vazia
    fun size() = elements.size //retorna o tamanho da lista
    override fun toString() = "PilhaMutavel(${elements.joinToString()})" //Converte a pilha para texto
}

//Funcao generica
fun <E> mutableStackOf(vararg elements: E) = PilhaMutavel(*elements) //cria uma nova PilhaMutavel passando o vararg para ela.

fun main() {
    val contato1 = Contato(1, "meu@mail.com")
    println(contato1.id)
    println(contato1.email)
    contato1.email = "email2@mail.com"
    println(contato1.email)

    val pilha = PilhaMutavel(1.2, 2.4, 3.14)
    pilha.push(9.81)
    println(pilha)

    println("peek(): ${pilha.peek()}")

    for(i in 1..pilha.size()){
        println("pop(): ${pilha.pop()}")
        println(pilha)
    }

    val stack = mutableStackOf(1, 2, 3, 4)
    println(stack)
}