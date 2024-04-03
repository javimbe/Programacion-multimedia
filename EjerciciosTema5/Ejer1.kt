package EjerciciosTema5

    fun main(args: Array<String>){
        ejercicio1()
    }
    fun ejercicio1(){
        //CONDICIONES Y BUCLES
        println("Ingresa un Numero: ")
        val sueldo = readln().toInt()

        if(sueldo > 3000){
            println("Debes abonar impuestos")
        }
        else{
            println("Estas libre de impuestos")
        }
    }
