// Funcao aplly, executa um bloco de codigos dentro de um obejto
data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "") // Para quando for instanciada uma classe com construtor vazio
}

fun main() {
	val jake = Person() 
    val stringDescription = jake.apply{ //usamos o aplly para atribuir os valores aos atributos do objeto
        name = "Jake"
        age = 30
        about = "Android Developer"
    }.toString() // Convertendo para string
    
    println(stringDescription)
}