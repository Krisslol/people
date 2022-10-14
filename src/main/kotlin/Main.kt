fun main() {
    val likes = 571
    val person = "человеку"
    val people = "людям"

    var res = if (likes % 10 == 1 && likes % 100 != 11)person else people

    println("Понравилось $likes $res")
}
