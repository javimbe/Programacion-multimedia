package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    ejercicio2()
}
fun ejercicio2(){
    //CONDICIONES Y BUCLES
    println("Ingresa un Numero: ")
    val num1 = readln().toInt()
    println("Ingresa otro Numero: ")
    val num2 = readln().toInt()

    if(num1 > num2){
        println("El numero mayor es: " + num1)
    }
    else if(num2 > num1){
        println("El numero mayor es: " + num2)
    }
    else{
        println("Ambos tienen el mismo valor")
    }
}
