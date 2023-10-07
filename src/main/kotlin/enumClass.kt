//Enum Classes, representam um numero finito de possibilidades dentro de uma estrutura, podem ser usados para representar estados, direcoes, modos e etc
enum class State {
    IDLE, RUNING, FINISHED
}

enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
    
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val state = State.RUNING
    val message = when (state) {
        State.IDLE -> "it's idle"
        State.RUNING -> "it's in runing"
        State.FINISHED -> "it's finished"
    }
    println(message)
    
    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}