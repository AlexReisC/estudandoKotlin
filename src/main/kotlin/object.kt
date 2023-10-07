// Object keyword: Obter um tipo de dado com implementção unica
// Object Expression
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }
    var total = dayRates.standard + dayRates.festivity + dayRates.special
    println("Total price: $total")
}

// Object Declaration (poder declarar uma classe como um objeto)
object DoAuth{ // É possivel acessar as funcoes da classe sem instancia-la
    fun takeParams(username: String, password: String){
        println("input Auth parameters = $username: $password")
    }
}

// Companion Objetc
class BigBen{
    companion object Bonger{ // É possivel acessar essa função sem instanciar a classe
        fun getBons(nTimes: Int){
            for (i in 1..nTimes){
                print("BONGER")
            }
        }
    }
}

fun main() {
	rentPrice(10, 2, 1)
    DoAuth.takeParams("Alex", "1234")
    BigBen.getBons(12)
}