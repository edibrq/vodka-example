fun main(args: Array<String>) {

    println(
        VodkaBottle(
            Vodka(
                BaseSpirit(1200.0),
                BaseWater(800.0)
            ),
            Vodka(
                BaseSpirit(1200.0),
                BaseWater(1800.0)
            )
        ).add(
            Vodka(
                BaseSpirit(1200.0),
                BaseWater(0.0)
            )
        ).spoil().degree()
    )
}

