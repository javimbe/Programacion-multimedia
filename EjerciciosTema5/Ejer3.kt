package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    ejercicio3()
}
fun ejercicio3(){
    //CONDICIONES Y BUCLES
    println("Ingresa un Numero: ")
    val num1 = readln().toInt()
    println("Ingresa otro Numero: ")
    val num2 = readln().toInt()

    if(num1 > num2){
        println("La suma entre ambos es: " + (num1+num2) + " y la resta entre ambos es: " + (num1-num2))
    }
    else if(num2 > num1){
        println("La multiplicacion entre ambos es: " + (num1*num2) + " y la division entre ambos es: " + (num1/num2))
    }
    else{
        println("Ambos tienen el mismo valor")
    }
}
