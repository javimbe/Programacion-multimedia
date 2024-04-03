package EjerciciosTema5

fun main(args: Array<String>){
    //CONDICIONES Y BUCLES
    bucles7()
}
fun bucles7(){
    //CONDICIONES Y BUCLES
    var num2 = 0
    for(i in 1..3){
        println("Ingresa un Numero entre 0 y 10: ")
        var num1 = readln().toInt()

        num2 += num1

        if(i == 3){
            if(num2/3 >= 7){
                println("Promocionado")
            }
            else if(num2/3 >= 4){
                println("Regular")
            }
            else{
                println("Reprobado")
            }
        }
    }
}