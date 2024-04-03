package EjerciciosTema5Arrays

fun main(){
    val arrayFloat = floatArrayOf(3.5F, 2.2f)
    for (i in 0 until arrayFloat.size step 1) {
        println(arrayFloat[i])
    }

}