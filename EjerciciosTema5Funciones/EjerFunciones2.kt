package EjerciciosTema5Funciones

fun suma(a: Int, b: Int): Int {
    var resultado = a + b
    return resultado
}
fun main() {

    var verdadFalso=false

    while(verdadFalso==false){
        println("indica la opción 1 suma 2 resta 3 multiplicacion 4 division 5 salir")
        var opcion=readLine()?.toIntOrNull()
        if (opcion==5){
            verdadFalso=true
            println(" El programa ha finalizado")
        } else if (opcion in 1..4) {
            print("Indícame un número: ")
            var numero1 = readLine()?.toIntOrNull() ?: 0 // Usa 0 si no se puede convertir a entero
            print("Indícame otro número: ")
            var numero2 = readLine()?.toIntOrNull() ?: 0 // Usa 0 si no se puede convertir a entero

            if (opcion==1) {
                println("La suma es ${suma(numero1, numero2)}")
            }
            if (opcion==2) {
                println("La resta es")
            }
        } else { println("opcion elegida incorrecta ")}


    }

}