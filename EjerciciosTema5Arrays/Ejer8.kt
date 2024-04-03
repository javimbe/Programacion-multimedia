package EjerciciosTema5Arrays

fun main(){
    var matrizEnteros=arrayOf(intArrayOf(3,2,1),intArrayOf(4,5),intArrayOf(6))
    println( "Valor original "+ matrizEnteros[0][2])
    matrizEnteros[0][2]=0
    println(" valor cambiado a "+ matrizEnteros[0][2])
    matrizEnteros[0].set(2,9);
    println( "valor cambiado con set "+  matrizEnteros[0][2])

}