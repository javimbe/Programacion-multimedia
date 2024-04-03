package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    bucles4()
}
fun bucles4(){
    //CONDICIONES Y BUCLES
    var num2 = 0
    for(i in 1..10){
        println("Ingresa un Numero entre 0 y 999: ")
        var num1 = readln().toInt()

        num2 += num1

        if(i == 10){
            println("La suma de todos los valores introducidos es: " + num2)
        }
    }
}