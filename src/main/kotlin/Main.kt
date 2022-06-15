import java.util.*

fun main() {
    calculation()
    choose()
}

private fun calculation() {
    try {
        val reader = Scanner(System.`in`)
        println("შეიყვანეთ x რიცხვი: ")
        val x = reader.nextInt()
        println("შეიყვანეთ y რიცხვი: ")
        val y = reader.nextInt()
        println("X და Y ჯამი არის: ${x + y}")
    } catch (e: InputMismatchException) {
        println("გთხოვთ შეიყვანეთ რიცხვი")
        main()
    }
}


private fun choose() {
    try {
        println(
            "1.გაგრძელება\n" +
                    "2.გამოსვლა"
        )
        val reader = Scanner(System.`in`)
        val answer = reader.nextInt()

        when (answer) {

            1 -> main()
            2 -> {
                return
            }
            else -> main()
        }
    } catch (e: InputMismatchException) {
        println("გთხოვთ შეიყვანეთ რიცხვი")
        choose()
    }
}