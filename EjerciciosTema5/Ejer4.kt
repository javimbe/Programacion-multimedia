package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    ejercicio4()
}
fun ejercicio4(){
    //CONDICIONES Y BUCLES
    println("Ingresa un Numero: ")
    val num1 = readln().toInt()
    println("Ingresa otro Numero: ")
    val num2 = readln().toInt()

    if(num1 > num2){
        val numMasAlto = num1
        println("El numero mas alto es: " + numMasAlto)
    }
    else if(num2 > num1){
        val numMasAlto = num2
        println("El numero mas alto es: " + numMasAlto)
    }
    else{
        println("Ambos tienen el mismo valor")
    }
}
