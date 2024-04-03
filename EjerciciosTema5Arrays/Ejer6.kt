package EjerciciosTema5Arrays

fun main(){
    val array2d = arrayOf(arrayOf(3, 3, 3), arrayOf("aaa", "ccc", -1))


    for (fila in array2d) {
        for (elemento in fila) {
            println(elemento)
        }
    }
}