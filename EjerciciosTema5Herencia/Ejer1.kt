package EjerciciosTema5Herencia

class Product(val nombre: String, val precio: Double) {

    // Sobrescribir la función toString para personalizar la representación en cadena del objeto
    override fun toString(): String {
        return "Producto(nombre='$nombre', precio=$precio)"
    }

    // Resto del código de la clase Producto (hashCode, equals, etc.)
}

fun main() {
    // Crear instancias de la clase Producto
    val producto1 = Product("Laptop", 1200.0)
    val producto2 = Product("Laptop", 1200.0)
    val producto3 = Product("Teléfono", 500.0)

    // Imprimir las representaciones en cadena de los productos
    println("Producto 1: $producto1")
    println("Producto 2: $producto2")
    println("Producto 3: $producto3")

    // Resto del código de prueba (comparaciones y códigos hash)
}