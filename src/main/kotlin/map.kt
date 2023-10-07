// Map é formado por um par chave-valor, como dicionarios em Python
// mutableMapOf() cria um map mutavel e mapOf() cria um map imutavel

const val POINT_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100) // uma variavel imutavel que guarda
// um map mutavel, onde a chave e o valro sao inteiros
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredits(acountId: Int){
    if (EZPassAccounts.containsKey(acountId)){
        println("Updating $acountId")
        EZPassAccounts[acountId] = EZPassAccounts.getValue(acountId) + POINT_X_PASS
    } else {
        println("Error.")
    }
}

fun accountsReport(){
    println("EZ-Pass report: ")
    EZPassReport.forEach() {
        k, v -> println("ID $k: credit $v")
    }
}
 
fun main() {
   accountsReport()
   updatePointsCredits(1)
   updatePointsCredits(1)
   updatePointsCredits(5)
   accountsReport()
}