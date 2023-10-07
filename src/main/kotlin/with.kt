// Funcao with 

class Configuration(val host: String, val port: Int)

fun main() {
   val configuration = Configuration(host = "198.1.162.0", port = 1011)
   
   with(configuration){
       println("$host:$port")
   }
}