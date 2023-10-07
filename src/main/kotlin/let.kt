// Função let: pode ser usada como funcao de escopo ou verificar se o objeto nao for nulo
// A ultima instruncão é a instruncão de retorno
fun customPrint(s: String){
    print(s.uppercase()) // String toda em maiusculo
}

fun main() {
	val empty = "test".let { // O texto'test' esta chamando o let
        customPrint(it) // a funcao customPrint() ta sendo chamada passando 'it' que representa quem esta chamando o let
        it.isEmpty() // Verificando se 'test' é vazio
    }
    println(" is empty: $empty")
    
    fun printNonNull(str: String?){
        println("Printing \"$str\":")
        str?.let{ // Executa o let se a string não for nula
            print("\t")
            customPrint(it)
            println()
        }
    }
    
    printNonNull(null)
    printNonNull("string")
    
    
}