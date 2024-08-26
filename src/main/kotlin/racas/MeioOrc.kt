package org.example.racas

class MeioOrc: Raca{
    override fun serRaca(): String {
        return("Meio Orc")
    }
    override fun modRacaForc(): Int {
        return 2
    }

    override fun modRacaDest(): Int {
        return 0
    }

    override fun modRacaCons(): Int {
        return 1
    }

    override fun modRacaInte(): Int {
        return 0
    }

    override fun modRacaSabe(): Int {
        return 0
    }

    override fun modRacaCari(): Int {
        return 0
    }
}