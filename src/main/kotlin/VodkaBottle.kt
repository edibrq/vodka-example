class VodkaBottle(
    vararg mixtures: Mixture
) : Bottle {

    private var volume = 0.0
    private var degree = 0.0

    init {
        volume = mixtures.sumOf { it.volume() }
        degree = mixtures.sumOf { it.degree() * it.volume() } / volume

        println("3 vol ${volume} degree = ${degree}")
    }

    override fun add(mixture: Mixture): Bottle {
        if (volume == 0.0)
            volume = mixture.volume()
        degree = (mixture.degree() * mixture.volume() + degree * volume) / (volume + mixture.volume())
        volume += mixture.volume()
        return this
    }

    override fun spoil(): Mixture = Vodka(
        BaseSpirit(degree * volume),
        BaseWater(volume - degree * volume)
    )
}