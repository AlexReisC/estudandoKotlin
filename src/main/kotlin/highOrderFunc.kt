// High-Order function: funcoes que recebem outras funcoes como parametro ou que retorna funcoes

//High-order function parameters
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int { // recebe dois inteiros e uma declaracao de funcao
// 'operation', essa operacao vai ter dois parametros inteiros e retonar outro inteiro
    return operation(x, y) // passa para o 'operation' (funcao do parametro), o x e y que recebeu. O retorno quem faz é
    // a funcao do parametro
}

fun sum(x: Int, y: Int) = x + y

// High-order function returns
fun operation(): (Int) -> Int { // o retorno da funcao é outra funcao que recebe um inteiro e retorna um inteiro
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    val sumResult = calculate(4, 5, ::sum) // soma de 4 e 5
    val mulResult = calculate(4, 5) {a, b -> a * b} // funcao lambda para multiplicacao de dois valores
    println("sumResult $sumResult, mulResult $mulResult")
    
    val func = operation()
    println(func(2))
}