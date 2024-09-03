package textadventure

import java.io.File

fun readLocationInfo() : Map<Int, Location> {
    val locations = mutableMapOf<Int, Location>()

    File("D:\\ARYAN\\Projects\\ARYAN\\KotlinTutorial\\src\\locations_big.txt").reader().forEachLine {
        val tokens  = it.split("`")

        val location = Location(locationId = tokens[0].toInt(), description = tokens[1])
        locations[location.locationId] = location
    }

    File("D:\\ARYAN\\Projects\\ARYAN\\KotlinTutorial\\src\\directions_big.txt").reader().forEachLine {
        val tokens = it.split(",")
        locations[tokens[0].toInt()]?.addExit(tokens[1], tokens[2].toInt())
    }
    return locations

}