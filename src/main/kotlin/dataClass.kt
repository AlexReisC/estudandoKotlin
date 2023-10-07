// Data classes
data class User(val name: String, val id: Int){
    override fun equals(other: Any?) =
    	other is User && other.id == this.id
}

fun main() {
	 val user = User("Alex", 1)
     println(user)
     
     val secondUser = User("Alex", 1)
     val thirdUser = User("Mary", 2)
     println("user == secondUser: ${user == secondUser}")
     println("user == thirdUser: ${user == thirdUser}")
     
     println(user.hashCode()) //hashCode() é uma funcao que pega as propriedades de um elemento e gera um codigo
     println(secondUser.hashCode())
     println(thirdUser.hashCode())
     
     println(user.copy()) // copy() cria uma cópia de um elemento
     println(user === user.copy()) // Comparacao em termos de memoria
     println(user.copy("Max")) // É possivel fazer alteracoes na copia
     println(user.copy(id = 3))
     
     println("name = ${user.component1()}") // Acessando as propriedades da instancia
     println("id = ${user.component2()}")
}