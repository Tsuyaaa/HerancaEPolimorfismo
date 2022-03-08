package Animais

class Preguica(nome: String, idade: Int, especie: String):
    Animal(nome, idade, especie) {

    override fun som() {
        println("\n$nome bali")
    }

    override fun movimento(movimento: Boolean) {
        if(movimento){
            println("\n$nome esta escalando.")
        }else{
            println("\n$nome esta parado.")
        }
    }

}