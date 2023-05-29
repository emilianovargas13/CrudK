package Arrays.user

import Arrays.person.Person

class User(val id: Int, var email:String, var password: String, name: String, surname: String, phone:String):
    Person(name, surname, phone) {

    fun finduser(){

        super.find()

        println("Id: ${this.id}")
        println("Correo electronico: ${this.email}")
       
    }
}
