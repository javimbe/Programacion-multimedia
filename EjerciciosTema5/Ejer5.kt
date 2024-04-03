package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    ejercicio5()
}
fun ejercicio5(){
    //CONDICIONES Y BUCLES
    println("Ingresa un Numero: ")
    val num1 = readln().toInt()

    if(num1%2==0){
        val num2 = num1 * num1
        println("El cuadrado del numero " + num1 + " es: " + num2)
    }
    else{
        val num2 = num1 * num1 * num1
        println("El cubo del numero " + num1 + " es: " + num2)
    }
}
