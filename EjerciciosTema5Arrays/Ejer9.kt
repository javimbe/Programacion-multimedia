package EjerciciosTema5Arrays

fun main(){
    var matrizEnteros1=arrayOf(floatArrayOf(3f,2f,1.4f),intArrayOf(3,2),intArrayOf(1))
    (matrizEnteros1[0] as FloatArray).set(2,1.5f);
    // casteando
    var miArray8= arrayOf(arrayOf(3, -1, 4.5f), arrayOf(3, -1, 4.5f), -1)


    for (fila in miArray8) {
        if (fila is Array<*>) {
            for (valor in fila as Array<*>) {
                println("valor array: $valor")
            }
        } else if (fila is Int) {
            println("valor int: $fila")
        }
    }

}