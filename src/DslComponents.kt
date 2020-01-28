import builder.CompoundBuilder
import builder.HomeBuilder
import builder.HouseBuilder

fun createHome(init: HomeBuilder.() -> Unit): Home {
    val homeBuilder = HomeBuilder()
    init(homeBuilder)
    return homeBuilder.build()
}

fun HomeBuilder.compound(init: CompoundBuilder.() -> Unit) {
    compound = CompoundBuilder().apply(init).build()
}

fun HomeBuilder.house(init: HouseBuilder.() -> Unit) {
    house = HouseBuilder().apply(init).build()
}


@DslMarker
annotation class HomeDsl