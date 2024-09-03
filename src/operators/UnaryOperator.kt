package operators

fun main(args: Array<String>) {
    var e = 10
    var flag = true
    println("First print then increment: "+e++)
    println("First increment then print: "+ ++e)
    println("First print then decrement: "+ e--)
    println("First decrement then print: "+ --e)
}