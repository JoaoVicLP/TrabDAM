package org.example.racas

class Tiefling: Raca {
    override fun serRaca(): String {
        return("Tiefling")
    }
    override fun modRacaForc(): Int {
        return 0
    }

    override fun modRacaDest(): Int {
        return 0
    }

    override fun modRacaCons(): Int {
        return 0
    }

    override fun modRacaInte(): Int {
        return 0
    }

    override fun modRacaSabe(): Int {
        return 0
    }

    override fun modRacaCari(): Int {
        return 2
    }
}