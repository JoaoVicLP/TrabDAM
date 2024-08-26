package org.example.racas

class AnaoColina: Raca {
    override fun serRaca(): String {
        return("Anao da Colina")
    }

    override fun modRacaForc(): Int {
        return 0
    }

    override fun modRacaDest(): Int {
        return 0
    }

    override fun modRacaCons(): Int {
        return 2
    }

    override fun modRacaInte(): Int {
        return 0
    }

    override fun modRacaSabe(): Int {
        return 1
    }

    override fun modRacaCari(): Int {
        return 0
    }
}