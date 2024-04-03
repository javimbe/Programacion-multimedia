package EjerciciosTema5Arrays

fun main(){
    var matriz = arrayOf(arrayOf(3, -1, 'a', "literal", null), arrayOf("3af299", 7, false))
    (matriz[0] as Array<Any>)[1] = 4 as Any
    println("Matriz valor: ${matriz[0][1]}")


    for (i in 0 until matriz.size) {
        for (j in 0 until matriz[i].size) {
            if (matriz[i][j] is Int) {
                (matriz[i] as Array<Any>)[j] = (((matriz[i] as Array<Any>)[j] as Int).inc() as Any)
            }
        }
    }


// Mostrar la matriz después de la modificación
    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t")
        }
        println()
    }
//mostrando todo el contenido de un array
    var matriz10 = arrayOf(arrayOf(3, -1, 'a', "literal", null), arrayOf("3af299", 7, false))
    println(matriz10.contentDeepToString())

}