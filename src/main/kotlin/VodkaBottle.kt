class VodkaBottle() : Bottle {

    private var volume = 0.0
    private var degree = 0.0

    override fun add(liquid: Liquid): Bottle {
        this.volume += liquid.volume()

        val spiritVolume = this.degree * this.volume + liquid.volume() * liquid.degree() / 100
        val allVolume = this.volume

        if (allVolume > 0)
            this.degree = spiritVolume / allVolume * 100
        else
            this.degree = 0.0;

        return this
    }

    override fun spoil(): Mixture {
        return Vodka(
            BaseSpirit(volume * degree / 100),
            BaseWater(volume - volume * degree / 100),
        )
    }
}