package builder

import HomeDsl
import House

@HomeDsl
class HouseBuilder(var noOfRooms: Int = 0, var hasTiledFloors: Boolean = false) {

    fun build(): House {
        return House(noOfRooms, hasTiledFloors)
    }
}