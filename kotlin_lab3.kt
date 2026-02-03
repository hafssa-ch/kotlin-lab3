
fun main() {
    val size = 5

    // --- TASK 1 : Triangle aligné à droite (Décroissant) ---
    println("Task 1 — Triangle aligné à droite :")
    for (i in 1..size) {

        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = (size + 1) - i
        for (j in 1..numberOfStars) print("*")

        println()
    }

    println("\n" + "-".repeat(15) + "\n")

    // --- TASK 2 : Triangle Impair aligné à droite ---
    println("Task 2 — Triangle impair :")
    for (i in 1..size) {

        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = 11 - (i * 2)
        for (j in 1..numberOfStars) print("*")

        println()
    }

    println("\n" + "-".repeat(15) + "\n")

    // --- TASK 3 : Double Triangle (Montée puis Descente) ---
    println("Task 3 — Double triangle :")
    
    for (i in 1..size) {
        val numberOfSpaces = size - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")
        println()
    }

    for (i in (size - 1) downTo 1) {
        val numberOfSpaces = size - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")
        println()
    }
}