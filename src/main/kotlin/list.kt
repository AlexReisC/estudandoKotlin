//ListOf() cria lista imutaveis
//mutableListOf() cria listas mutaveis
    
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // a variavel é imutavel, não pode receber uma nova instancia
//(outra atribuição), porém a lista que esta sendo amarzenada pode ser alterada, já que é do tipo mutableList
val sudoers: List<Int> = systemUsers // a variavel cria uma cópia apenas para leitura da lista anterior
    
fun addSystemUser(newUser: Int){ // recebe um inteiro e adiciona na mutableList.
	systemUsers.add(newUser)
}
    
fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("Tot sudoers: ${getSysSudoers().size}") //verificando o tamanho (num de elementos) na lista de leitura
    getSysSudoers().forEach { 
        i -> println("Some useful info on user $i") // imprimindo cada elemento
    }
}