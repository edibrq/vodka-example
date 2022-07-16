class BaseSpirit(
    private val volume: Double
) : Spirit {

    override fun volume(): Double = volume

    override fun degree(): Double = 100.0;
}