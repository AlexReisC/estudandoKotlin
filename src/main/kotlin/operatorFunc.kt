// Operator function: funcoes que poem ser atualizadas para operadores, permitindo que sua chamada seja pelo operador
fun main() {
	operator fun Int.times(str: String) = str.repeat(this) // queremos um operador para a funcao times
    println(2 * "Bye ")
    
    operator fun String.get(range: IntRange) = substring(range) // Funcao que espera um range e cria uma substring desse range
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..18])
}