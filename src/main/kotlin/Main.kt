fun main(args: Array<String>) {
    println(
        Vodka(
            BaseSpirit(1200.0),
            BaseWater(800.0)
        ).degree()
    )
    println(
        Vodka(
            BaseSpirit(1200.0),
            BaseWater(1800.0)
        ).degree()
    )

    val vodka = VodkaBottle()
        .add(
            Vodka(
                BaseSpirit(1200.0),
                BaseWater(800.0),
            ),
        )
        .add (
            Vodka(
                BaseSpirit(1200.0),
                BaseWater(1800.0)
            )
        )

    val spoiledVodka = vodka.spoil()

    println("volume:${spoiledVodka.volume()}, degree: ${spoiledVodka.degree()}")
}