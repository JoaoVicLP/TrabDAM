package org.example

import org.example.classes.Classe
import org.example.racas.Raca

open class Personagem(var raca: Raca) {

    var nome: String = ""
    var vida: Int = 0
    var forc: Int = 8
    var modAtrForc: Int = 0
    var dest: Int = 8
    var modAtriDest: Int = 0
    var cons: Int = 8
    var modAtriCons: Int = 0
    var inte: Int = 8
    var modAtriInte: Int = 0
    var sabe: Int = 8
    var modAtriSabe: Int = 0
    var cari: Int = 8
    var modAtrCari: Int = 0

    fun Raca() {
        this.raca.serRaca()
    }

    //fun Classe(){
    //     this.classe.serClasse()
    // }


    fun tabelaMod(valor: Int): Int {
        if (valor == 8 || valor == 9)
            return -1
        if (valor == 10 || valor == 11)
            return 0
        if (valor == 12 || valor == 13)
            return 1
        if (valor == 14 || valor == 15)
            return 2
        if (valor == 16 || valor == 17)
            return 3
        if (valor == 18 || valor == 19)
            return 4
        if (valor == 20 || valor == 21)
            return 5
        if (valor == 22 || valor == 23)
            return 6
        if (valor == 24 || valor == 25)
            return 7
        if (valor == 26 || valor == 27)
            return 8
        if (valor == 28 || valor == 29)
            return 9
        if (valor == 30)
            return 10
        return 0
    }
    fun setMods(){
        modAtrForc = tabelaMod(forc)
        modAtriDest = tabelaMod(dest)
        modAtriCons = tabelaMod(cons)
        modAtriInte = tabelaMod(inte)
        modAtriSabe = tabelaMod(sabe)
        modAtrCari = tabelaMod(cari)
    }

    fun setVida() {
        vida = 10 + modAtriCons + raca.modRacaCons()
    }

    fun zerarAtri() {
            forc = 8;
            dest = 8;
            cons = 8;
            inte = 8;
            sabe = 8;
            cari = 8;
    }
}