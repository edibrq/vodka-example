class VodkaBottle() : Bottle {

    private var volume = 0.0
    private var degree = 0.0

    override fun add(liquid: Liquid): Bottle {
        this.volume += liquid.volume()
        val spiritVolume = this.degree * this.volume + liquid.volume() * liquid.degree()
        val allVolume = this.volume + liquid.volume()
        this.degree = spiritVolume / allVolume
        return this
    }

    override fun spoil(): Mixture {
        TODO("Возвращать микстуру? Я хз как сделать еще")
    }
}