class Vodka(
    spirit: Liquid,
    water: Liquid
) : Mixture {

    private var volume: Double = 0.0
    private var degree: Double = 0.0

    init {
        this.volume = spirit.volume() + water.volume()
        this.degree = spirit.degree() * spirit.volume() / (water.volume() + spirit.volume())
    }

    override fun degree(): Double  = degree

    override fun volume(): Double = volume

}