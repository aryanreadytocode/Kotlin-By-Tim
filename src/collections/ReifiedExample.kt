package collections

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

data class User(val name: String)

/*
* At runtime type is getting erased
* so to preserve the type we use reified keyword*/

inline fun <reified T> Gson.fromJson(json: String): T {
    return fromJson(json, object : TypeToken<T>() {}.type)
}

fun main() {
    val userJson = "{\"name\":\"Amit\"}"

    val user = Gson().fromJson<User>(userJson)
    println(user.name)
}