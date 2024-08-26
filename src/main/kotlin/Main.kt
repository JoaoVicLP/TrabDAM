package org.example

import org.example.racas.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var pontos: Int
    var pntsEscolha: Int
    var racaEscolha: Int
    var num = 0
    val racas = listOf("Alto Elfo", "Elfo da Floresta", "Drow", "Anão da Colina", "Anão da Montanha", "Draconato", "Gnomo da Floresta", "Gnomo das Rochas", "Halfling Pés Leves", "Halfling Robusto", "Humano", "Meio Elfo", "Meio Orc", "Tiefling")
    var nome: String

    println("---Criando Personagem---")

    println("Passo 1: Criar nome do personagem")
    println("Digite o nome do seu personagem")
    nome = readLine().toString()

    println("Passo 2: Escolhendo Raca")
    for (raca in racas) {
        num += 1
        println("$num - $raca")
    }
    println("Digite o numero da raca do seu personagem:")
    racaEscolha = readLine()?.toIntOrNull() ?: 0
    var personagem : Personagem = Personagem(Humano())
        when(racaEscolha){
            1 -> {
                personagem = Personagem(AltoElfo())
            }
            2 -> {
                personagem = Personagem(ElfoFloresta())
            }
            3 -> {
                personagem = Personagem(ElfoDrow())
            }
            4 -> {
                personagem = Personagem(AnaoColina())
            }
            5 -> {
                personagem = Personagem(AnaoMontanha())
            }
            6 -> {
                personagem = Personagem(Draconato())
            }
            7 -> {
                personagem = Personagem(GnomoFloresta())
            }
            8 -> {
                personagem = Personagem(GnomoRochas())
            }
            9 -> {
                personagem = Personagem(HalflingPesLeves())
            }
            10 -> {
                personagem = Personagem(HalflingRobusto())
            }
            11 -> {
                personagem = Personagem(Humano())
            }
            12 -> {
                personagem = Personagem(MeioElfo())
            }
            13 -> {
                personagem = Personagem(MeioOrc())
            }
            14 -> {
                personagem = Personagem(Tiefling())
            }
            else -> {
                println("Essa raca nao esta disponivel")
            }
        }
    personagem.nome = nome

    println("Passo 3: Escolher Pontos de atributo")
    do {
        pontos = 27
        personagem.zerarAtri()
        println("Voce deve distriuir seus pontos entre seus atributos: forca, destreza, constituicao, inteligencia, sabedoria, carisma")
        do {
            println("Voce possui $pontos disponiveis, Digite o atributo que deseja:")
            val atrib = readLine().toString()
            when (atrib) {
                "forca" -> {
                    println("Quantos pontos destinara para $atrib")
                    pntsEscolha = readLine()?.toIntOrNull() ?: 0
                    if (pntsEscolha > pontos || pntsEscolha < 0) {
                        println("Essa quantidade nao esta disponivel")
                    } else {
                        personagem.forc += pntsEscolha
                        pontos -= pntsEscolha
                    }
                }
                "destreza" -> {
                    println("Quantos pontos destinara para $atrib")
                    pntsEscolha = readLine()?.toIntOrNull() ?: 0
                    if (pntsEscolha > pontos || pntsEscolha < 0) {
                        println("Essa quantidade nao esta disponivel")
                    } else {
                        personagem.dest += pntsEscolha
                        pontos -= pntsEscolha
                    }
                }
                "constituicao" -> {
                    println("Quantos pontos destinara para $atrib")
                    pntsEscolha = readLine()?.toIntOrNull() ?: 0
                    if (pntsEscolha > pontos || pntsEscolha < 0) {
                        println("Essa quantidade nao esta disponivel")
                    } else {
                        personagem.cons += pntsEscolha
                        pontos -= pntsEscolha
                    }
                }
                "inteligencia" -> {
                    println("Quantos pontos destinara para $atrib")
                    pntsEscolha = readLine()?.toIntOrNull() ?: 0
                    if (pntsEscolha > pontos || pntsEscolha < 0) {
                        println("Essa quantidade nao esta disponivel")
                    } else {
                        personagem.inte += pntsEscolha
                        pontos -= pntsEscolha
                    }
                }
                "sabedoria" -> {
                    println("Quantos pontos destinara para $atrib")
                    pntsEscolha = readLine()?.toIntOrNull() ?: 0
                    if (pntsEscolha > pontos || pntsEscolha < 0) {
                        println("Essa quantidade nao esta disponivel")
                    } else {
                        personagem.sabe += pntsEscolha
                        pontos -= pntsEscolha
                    }
                }
                "carisma" -> {
                    println("Quantos pontos destinara para $atrib")
                    pntsEscolha = readLine()?.toIntOrNull() ?: 0
                    if (pntsEscolha > pontos || pntsEscolha < 0) {
                        println("Essa quantidade nao esta disponivel")
                    } else {
                        personagem.cari += pntsEscolha
                        pontos -= pntsEscolha
                    }
                }
                else -> println("Atributo invalido")
            }
        } while (pontos > 0)

        println("forca: ${personagem.forc}")
        println("destreza: ${personagem.dest}")
        println("constituicao: ${personagem.cons}")
        println("inteligencia: ${personagem.inte}")
        println("sabedoria: ${personagem.sabe}")
        println("carisma: ${personagem.cari}")

        println("Tem certeza disso?")
        val escolha = readLine().toString()
    } while (escolha.equals("nao", ignoreCase = true))
    personagem.setMods()
    personagem.setVida()

    println("---Ficha de Personagem---")
    println("Nome: ${personagem.nome}")
    println("Pontos de Vida: ${personagem.vida}")
    println("Raca: ${personagem.raca.serRaca()}")
    println("Atributo")
    println("Forca: ${personagem.forc} (${personagem.modAtrForc}) (${personagem.raca.modRacaForc()})")
    println("Destreza: ${personagem.dest} (${personagem.modAtriDest}) (${personagem.raca.modRacaDest()})")
    println("Constituicao: ${personagem.cons} (${personagem.modAtriCons}) (${personagem.raca.modRacaCons()})")
    println("Inteligencia: ${personagem.inte} (${personagem.modAtriInte}) (${personagem.raca.modRacaInte()})")
    println("Sabedoria: ${personagem.sabe} (${personagem.modAtriSabe}) (${personagem.raca.modRacaSabe()})")
    println("Carisma: ${personagem.cari} (${personagem.modAtrCari}) (${personagem.raca.modRacaCari()})")
}
