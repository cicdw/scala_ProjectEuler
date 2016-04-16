object Problem1 {
    val answer = (0 to 999).filter((i) => i%3==0 || i%5==0).sum

    def main(args : Array[String]){
        println("The answer is " + answer + "...")
    }
}
