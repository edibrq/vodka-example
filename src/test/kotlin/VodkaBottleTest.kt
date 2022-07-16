import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class VodkaBottleTest {

    @Test
    fun `add zero spirit test`() {
        //when
        val spirit = BaseSpirit(0.0)
        val water = BaseWater(1000.0)

        //then
        val vodka = VodkaBottle()
            .add(spirit)
            .add(water)

        //given
        println(vodka.spoil().degree())
        assertEquals(0.0, vodka.spoil().degree())
    }

    @Test
    fun `add zero water test`() {
        //when
        val spirit = BaseSpirit(1000.0)
        val water = BaseWater(0.0)

        //then
        val vodka = VodkaBottle()
            .add(spirit)
            .add(water)

        //given
        println(vodka.spoil().degree())
        assertEquals(100.0, vodka.spoil().degree())
    }

    @Test
    fun spoil() {
    }
}