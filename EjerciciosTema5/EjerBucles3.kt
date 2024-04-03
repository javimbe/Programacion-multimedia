package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    bucles3()
}
fun bucles3(){
    //CONDICIONES Y BUCLES
    println("Ingresa un Numero entre 0 y 999: ")
    var num1 = readln().toInt()

    while(num1>=1){
        num1 = num1/2
        println("promedio actual: " + num1)
    }
}