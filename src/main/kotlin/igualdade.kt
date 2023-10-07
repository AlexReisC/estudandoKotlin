fun main() {
    
    //Existem duas formas de comparar objetos
    
    val authors = setOf("Oda", "Akira", "Kishimoto")
    //val writers = setOf("Oda", "Akira", "Kishimoto")
    val writers = setOf("Kishimoto", "Akira", "Oda")
    
    println(authors == writers)//O '==' verifica se a estrutura de dois objetos são iguais
    println(authors === writers)//O '===' verifica se os objetos possuem a mesma referencia
	
    // É possivel usar o if como expressão
    fun menor(a: Int) = if (a < 10) a else 10
    print(menor(5))
    
}