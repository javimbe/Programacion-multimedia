package EjerciciosTema5Arrays

fun main(){
    val arrayValores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in arrayValores.size - 1 downTo 0 step 2) {
        println(arrayValores[i])
    }


}