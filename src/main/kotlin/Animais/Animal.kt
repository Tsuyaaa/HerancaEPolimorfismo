package Animais

open class Animal(val nome: String, var idade: Int, var especie: String) {

    open var movimento : Boolean = true
    var corDoPelo = ""
    var sexo = ""

    open fun som (){
        println("O animal faz")
    }

    open fun movimento(movimento: Boolean) {
        if(movimento){
            println("O animal esta_")
        }else{
            println("O animal esta parado")
        }


    }


}