package EjerciciosTema5Arrays

fun main(){
    val arrayValores1 = arrayOf(1, "España", 2, "Francia", 3, "Alemania", 4, "Italia", 5)
    for (i in 0 until arrayValores1.size step 1) {
        println(arrayValores1[i])
    }

}