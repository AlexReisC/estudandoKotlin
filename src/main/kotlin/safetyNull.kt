fun descreveString(maybeString: String?): String{
    if (maybeString != null && maybeString.length > 0){
        return "Tamanho da String ${maybeString.length}"
    } else{
        return "Vazio ou nula"
    }
}

fun main() {
    var neverNull: String = "isso não é nulo"
    //neverNull = null //nao é possivel para mudar para nulo

    //Para fazer que uma variavel aceite nulo
    var nullable: String? = "você pode mudar para nulo"
    nullable = null //a '?' no tipo da variavel indica que ela pode receber null

    //Quando nao é explicitado o tipo da variavel, o compilador infere que ela é não-nula
    var inferirNaoNulo = "O compilador assume como nao-nulo"
    //inferirNaoNulo = null //desse modo nao é possivel mudar para null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    fun strLength2(str: String?): Int { //Para receber variaveis nulas
        return str?.length ?: 0 // '?:' é o Elvis Operator, se o parametro for nao-nulo retorna seu valor e se for nulo retorna 0
    }
    println(strLength2(neverNull))
    println(strLength2(nullable)) //erro pois a funcao espera um parametro não nulo

    println(descreveString(null))
    println(descreveString("Oi"))
}