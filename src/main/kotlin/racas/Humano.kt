package org.example.racas

class Humano : Raca {
    override fun serRaca(): String {
        return("Humano")
    }

    override fun modRacaForc(): Int {
        return 1
    }

    override fun modRacaDest(): Int {
        return 1
    }

    override fun modRacaCons(): Int {
        return 1
    }

    override fun modRacaInte(): Int {
        return 1
    }

    override fun modRacaSabe(): Int {
        return 1
    }

    override fun modRacaCari(): Int {
        return 1
    }
}