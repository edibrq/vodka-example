interface Liquid {
    fun volume() : Double
    fun degree() : Double
}

interface Water : Liquid

interface Spirit : Liquid

interface Mixture: Liquid

interface Bottle {
    fun add(liquid: Liquid): Bottle
    fun spoil() : Mixture
}