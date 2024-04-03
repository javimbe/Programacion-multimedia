package EjerciciosTema5Arrays

fun main(){
    val arrayVacio = arrayOfNulls<String>(3)
    arrayVacio[0] = "Málaga"
    arrayVacio[1] = "Sevilla"
    arrayVacio[2] = "Cádiz"
    for (i in 0 until arrayVacio.size step 1) {
        println(arrayVacio[i])
    }

}