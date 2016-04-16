object Problem1 extends Solution {
    val answer = (0 to 999).filter((i) => i%3==0 || i%5==0).sum
}
