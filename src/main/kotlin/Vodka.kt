class Vodka(
    private val spirit: Spirit,
    private val water: Water
) : Mixture {

    override fun degree(): Double = spirit.volume() / (water.volume() + spirit.volume())

    override fun volume(): Double = spirit.volume() + water.volume()
}