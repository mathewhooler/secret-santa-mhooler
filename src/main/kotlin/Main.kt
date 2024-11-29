fun assignSantas(santas: List<String>): Set<Pair<String, String>> {
  val shuffled = santas.shuffled()
  val pairs = mutableSetOf<Pair<String, String>>()

  for (santa in santas.indices) {
    val giver = santas[santa]
    val receiver = shuffled[santa]
    if (giver != receiver) {
      pairs.add(giver to receiver)
    }
  }

  return pairs
}

fun main() {
  val players = listOf("Pree", "Tina", "Michael", "Sneha", "Yun", "Tony", "Kats", "Raine", "Kate", "Mathew")
  val santas = assignSantas(players)

  println(santas)
}

