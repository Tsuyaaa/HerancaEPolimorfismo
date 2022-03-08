package Animais

class Cachorro(nome: String, idade: Int, especie: String):
    Animal(nome, idade, especie){

    override fun som() {
        println("\n$nome late")
    }

    override fun movimento(movimento: Boolean) {
        if(movimento){
            println("\n$nome esta correndo.")
        }else{
            println("\n$nome esta parado.")
        }
    }



}