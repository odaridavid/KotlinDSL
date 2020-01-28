package builder

import Compound
import Home
import HomeDsl
import House
import java.lang.Exception

@HomeDsl
class HomeBuilder(var location: String = "unknown", var compound: Compound? = null, var house: House? = null) {

    fun build(): Home {
        if (compound == null || house == null) throw Exception("Initialise all properties for the Home")
        return Home(location, compound!!, house!!)
    }
}