package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    ejercicio6()
}
fun ejercicio6(){
    //CONDICIONES Y BUCLES
    println("Ingresa un Numero: ")
    val num1 = readln().toInt()
    println("Ingresa un Numero: ")
    val num2 = readln().toInt()
    println("Ingresa un Numero: ")
    val num3 = readln().toInt()

    when((num1+num2+num3)/3){
        0 -> print("Suspenso")
        1 -> print("Suspenso")
        2 -> print("Suspenso")
        3 -> print("Suspenso")
        4 -> print("Suspenso")
        5 -> print("Suficiente")
        6 -> print("Bien")
        7 -> print("Notable")
        8 -> print("Notable")
        9 -> print("Sobresaliente")
        10 -> print("Sobresaliente")
    }
}
