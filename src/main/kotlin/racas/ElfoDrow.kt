package org.example.racas

class ElfoDrow: Raca {
    override fun serRaca(): String {
        return("Drow")
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
        return 0
    }

    override fun modRacaSabe(): Int {
        return 0
    }

    override fun modRacaCari(): Int {
        return 1
    }
}