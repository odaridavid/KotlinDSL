fun main() {

    val home = createHome {
        location = "Nairobi"

        compound {
            hasDecorations = true
        }

        house {
            noOfRooms = 6
            hasTiledFloors = true
        }

    }

}

