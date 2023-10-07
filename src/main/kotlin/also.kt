// Funcao also, semelhante ao apply, para acessar a referencia usa se o 'it'
data class Person(var name: String, var age: Int, var about: String){
    constructor() : this("", 0, "")
}

fun writeCreationgLog(p: Person){
    println("A new person ${p.name} was created.")
}

fun main() {
    val jake = Person("Jake", 30, "Android Developer")
    .also{ // após a instancia do objeto executa um comando adicional.
        writeCreationgLog(it) // 'it' é o objeto person
    }   
}