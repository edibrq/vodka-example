class BaseWater(
    private val volume: Double
) : Water {

    override fun volume(): Double = volume

    override fun degree(): Double = 0.0;
}
