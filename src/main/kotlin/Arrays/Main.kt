package Arrays

import Arrays.user.User
import java.util.Scanner


fun main(args: Array<String>) {


    val Scanner = Scanner(System.`in`)


    val listUsers = mutableListOf<User>()





    do {
        println("1. Iniciar sesion")
        println("2. Registrar usuario")
        println("3. consultar usuario ")
        println("4. consultar usuario por id")
        println("5. modificar usuario")
        println("6. Eliminar")
        println("7. Salir")

        val leer = Scanner.nextInt()

        when (leer) {

            1 -> {
                println("Ingrese el correo electrónico: ")
                val email = readLine()
                println("Ingrese la contraseña: ")
                val password = readLine()
                if (listUsers.isEmpty()) {
                    println("No existe el usuario")
                } else
                    for(user in listUsers){
                        if(email==user.email && password==user.password){
                            println("Usuario existente")
                            user.finduser()
                        }
                    }
            }

            2 -> {

                println("Correo electrónico")
                val email = readLine()
                println("Contraseña")
                val password = readLine()
                println("Nombre")
                val name = readLine()
                println("apellidos")
                val surname = readLine()
                println("Numero de teléfono")
                val phone = readLine()
                listUsers.add(User((listUsers.size + 1), email!!, password!!, name!!, surname!!, phone!!))
                println("Registro exitoso")

            }

            3 -> {
                for (user in listUsers) {
                    user.finduser()
                }

            }

            4 -> {
                println("Ingrese el ID del usuario: ")

                val id = Scanner.nextInt()

                if (listUsers.isEmpty()) {

                    println("No hay usuarios disponibles")

                } else
                    for (user in listUsers) {
                        if (id == user.id) {
                            println("Usuario encontrado")
                            user.finduser()
                        }
                    }
            }

            5 -> {
                if (listUsers.isEmpty()) {
                    println("No hay usuarios")
                } else
                    println("Ingresar el id del usuario para modificarlo")
                val id = Scanner.nextInt()
                for (user in listUsers) {
                    if (id == user.id) {

                        println("nuevo correo electronico")
                        val email = readLine()
                        println("Nuevo nombre")
                        val name = readLine()
                        println("Nueva contraseña")
                        val password = readLine()
                        println("nuevo apellido")
                        val surname = readLine()
                        println("Nuevo numero de telefono")
                        val phone = readLine()
                        user.email = email!!
                        user.password = password!!
                        user.name = name!!
                        user.surname = surname!!
                        user.phone = phone!!
                        println("Modificacion exitosa")
                    }
                }
            }

            6 ->{

                println("Ingrese el ID del usuario a eliminar: ")

                val id=Scanner.nextInt()
                listUsers.removeAt((id-1))

            }
        }

    }while (leer != 7)

}







