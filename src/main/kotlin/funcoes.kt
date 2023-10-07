//função que recebe um parâmetro, é possivel definir o tipo de retorno
// [ fun nome(parametro): tipoDoRetorno {}]
fun printMessage(message: String): Unit{
    println(message)
}

//Podemos definir um parametro preifxo (um valor padrão que sera atribuido) caso na chamada da função não seja
// passado nenhum parametro
// fun nome(parametro, prefix: tipo = valor){}
fun printMessageWithPrefix(message: String, prefix: String = "mensagem"){
    println("[$prefix] $message")
}

fun soma(x: Int, y: Int): Int{
    return x + y
}

//Inline function. Podemos definir uma função em uma unica linha.
fun mul(x: Int, y: Int) = x * y

fun main(){
    printMessage("Olá Mundo")
    printMessageWithPrefix("Olá")
    printMessageWithPrefix("Oi", "BlaBla")
    printMessageWithPrefix("Ok", "")
    println(soma(3,3))
    println(mul(4,5))
}