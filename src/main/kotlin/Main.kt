import Animais.Animal
import Animais.Cachorro
import Animais.Cavalo
import Animais.Preguica


fun main() {

    try {
        println("Escolha um dos três animais: ")
        print("1. Cachorro\n2. Cavalo\n3. Preguica\n")
        val escolha = readLine()!!.toInt()



        when(escolha){
            1 -> {
                println("---Cachorro---")
                print("\nDigite o nome do cachorro: ")
                val nome = readLine()!!

                print("Digite a idade do cachorro: ")
                var idade = readLine()!!.toInt()

                print("Digite a raça do cachorro: ")
                val raca = readLine()!!
                val cachorro = Cachorro(nome, idade, raca)

                cachorro.movimento(true)
                cachorro.som()
            }

            2 -> {
                println("---Cavalo---")
                print("\nDigite o nome do cavalo: ")
                val nome = readLine()!!

                print("Digite a idade do cavalo: ")
                var idade = readLine()!!.toInt()

                print("Digite a raça do cavalo: ")
                val raca = readLine()!!
                val cavalo = Cavalo(nome, idade, raca)

                cavalo.movimento(true)
                cavalo.som()
            }

            3 -> {
                println("---Preguiça---")
                print("\nDigite o nome da preguiça: ")
                val nome = readLine()!!

                print("Digite a idade da preguiça: ")
                var idade = readLine()!!.toInt()

                print("Digite a raça da preguiça: ")
                val raca = readLine()!!
                val preguica = Preguica(nome, idade, raca)

                preguica.movimento(true)
                preguica.som()

            }
        }
    }catch(e: Exception){
        println(e.message)
    }




}