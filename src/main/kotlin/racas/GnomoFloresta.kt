package org.example.racas

class GnomoFloresta: Raca {
    override fun serRaca(): String {
        return("Gnomo da Floresta")
    }
    override fun modRacaForc(): Int {
        return 0
    }

    override fun modRacaDest(): Int {
        return 1
    }

    override fun modRacaCons(): Int {
        return 0
    }

    override fun modRacaInte(): Int {
        return 2
    }

    override fun modRacaSabe(): Int {
        return 0
    }

    override fun modRacaCari(): Int {
        return 0
    }
}