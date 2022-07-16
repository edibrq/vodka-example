class BaseWater(
    private val volume: Double
) : Water {
    override fun volume(): Double = volume
}