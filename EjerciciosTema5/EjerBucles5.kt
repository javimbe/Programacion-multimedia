package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    bucles5()
}
fun bucles5(){
    //CONDICIONES Y BUCLES
    var num2 = 0
    for(i in 1..10){
        println("Ingresa un Numero entre 0 y 10: ")
        var num1 = readln().toInt()

        if(num1 >= 7){
            num2++
        }

        if(i == 10){
            println("El numero de alumnos con notas por encima de 7 es: " + num2)
        }
    }
}