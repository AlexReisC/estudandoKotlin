fun main(){
    print("Contagem de i <= n: ")
    for (i in 0..3){ // 0 <= 3
        print(i)
    }
    println(" ")
    
    print("Contagem de i < n: ")
    for (i in 0 until 3){ // 0 < 3
        print(i)
    }
    println(" ")
    
    print("Contagem de 2 em 2 (3 em 3, 4 em 4, etc): ")
    for (i in 2..8 step 2){ // 2 < 8; 2++
        print(i)
    }
    println(" ")
    
    print("Contagem decrescente: ")
    for (i in 3 downTo 0){ // 3 > 0; 1--
        print(i)
    }
    
    //É possivel iterar um range com char
	for (c in 'a'..'d'){ //é preciso usar aspas simples
        print(c)
    }
    print(" ")
    
    for (c in 'z' downTo 'p' step 2){
        print(c)
    }
    println()
    
    //Tambem podemos colocar um range dentro de condicionais
    val x = 2
    if (x in 1..5){
        print("x is in range from 1 to 5")
    }
   	println()
    
    if (x !in 6..10){
        print("x is not in range from 6 to 10")
    }
}