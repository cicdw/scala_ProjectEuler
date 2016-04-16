object Solution1 {
    def main(args: Array[String]) {
        val answer = (0 to 999).filter((i) => i%3==0 || i%5==0).sum
        println("The sum is " + answer + "...")
    }
}
