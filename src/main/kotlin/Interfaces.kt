interface Liquid {
    fun volume() : Double
}

interface Water : Liquid

interface Spirit : Liquid

interface Mixture: Liquid {
    fun degree() : Double
}

interface Bottle {
    fun add(mixture: Mixture) : Bottle
    fun spoil() : Mixture
}