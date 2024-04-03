package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    bucles1()
}
fun bucles1(){
    //CONDICIONES Y BUCLES
    println("Ingresa un Numero de piezas a crear: ")
    val num1 = readln().toInt()

    for(i in 1..num1){
        println("piezas creadas: " + i)
    }

}
