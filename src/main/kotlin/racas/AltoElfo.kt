package org.example.racas

class AltoElfo: Raca {
    override fun serRaca(): String {
        return("ALto Elfo")
    }

    override fun modRacaForc(): Int {
        return 0
    }

    override fun modRacaDest(): Int {
        return 2
    }

    override fun modRacaCons(): Int {
        return 0
    }

    override fun modRacaInte(): Int {
        return 1
    }

    override fun modRacaSabe(): Int {
        return 0
    }

    override fun modRacaCari(): Int {
        return 0
    }
}