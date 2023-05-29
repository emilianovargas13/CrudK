package Arrays.person

open class Person(var name: String, var surname: String, var phone: String) {

    fun find() {

        println("Nombre: ${this.name}")
        println("Apellido: ${this.surname}")
        println("Telefono: ${this.phone}")

    }
}