fun main(){
    //vararg é um tipo de parametro que podemos passar uma qtd indefinida de um determinado tipo
    //Abaixo podemos receber quantas mensagens quisermos
    fun printAll(vararg messages: String){
        for(m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Hola", "Olá")

    //É possivel usar argumentoss nomeados
    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for(m in messages) println(prefix + m)
    }
    //Passamos as strings para o parametro vararg e definimos a string que o prefix recebe
    printAllWithPrefix("Oi", "Eae", "Ei", prefix = "Saudação: ")

    //Chamando uma funcao vararg que chama outra que tbm é um vararg
    fun log(vararg entries: String){
        //É preciso utilizar o asteristico para passar como vararg e nao como array
        printAll(*entries)
    }
    log("Hello", "Hallo", "Hola", "Olá")
}