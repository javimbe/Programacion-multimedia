package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    bucles2()
}
fun bucles2(){
    //CONDICIONES Y BUCLES
    println("Ingresa un Numero entre 0 y 999: ")
    val num1 = readln().toString()

    for(i in 1..num1.length){

        if(i == num1.length){
            println("El numero introducido tiene: " + i + " digitos")
        }
    }
}
