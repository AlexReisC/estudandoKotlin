fun main() {
    cases(1)
    cases("Hello")
    cases(0L)
    cases("hello")
    cases(MyClass())

    println(whenAssign(1))
    println(whenAssign(2.4))
    println(whenAssign("Hello"))
    println(whenAssign(MyClass()))
}

//When statement, a declaração do When (O when substitui  o switch)
fun cases(obj: Any){ //a funcao recebe um objeto de qualquer tipo (Any)
    when(obj){ //when verifica cada caso
        1 -> println("One")
        "Hello" ->  println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknow")
    }
}

class MyClass

//When expression
fun whenAssign(obj: Any): Any { //recebe qualquer coisa e retorna qualquer coisa
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}