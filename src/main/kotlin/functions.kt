fun main() {
    // funcao filter: filtrar os elementos de uma colecao paseado em uma regra definida
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter{x ->  x > 0}
    val negatives = numbers.filter{it < 0}

    println("Numeros: ")
}