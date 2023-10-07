// Funcao run, é igual ao let, a diferenca é que ela usa o this

fun main() {
   fun getNullableLength(ns: String?){
       println("for \"$ns\":")
       ns?.run{ // Se ns nao for nulo entao run é executado
           println("\tis empty? " + isEmpty())
           println("\tlength = $length")
           length
       }
   }
   getNullableLength(null)
   getNullableLength("")
   getNullableLength("some string with Kotlin")
   
}