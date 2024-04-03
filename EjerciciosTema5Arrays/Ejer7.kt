package EjerciciosTema5Arrays

fun main(){
    val array1 = arrayOfNulls<String>(3)

    array1[0] = "A"
    array1[1] = "B"
    array1[2] = "C"
    // Copiar array1 a array2 y agregar un elemento más
    val array2 = array1.copyOf(array1.size + 1)
    array2[array1.size] = "D"
    // Mostrar array1 y array2 por consola USANDO JOOINTOSTRING
    println("Array1: ${array1.joinToString(", ")}")
    println("Array2: ${array2}")
}