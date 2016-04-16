object Problem2 {
    // a function for creating fibonacci numbers
    def fib(n : Int, x0 : Int = 0, x1 : Int = 1){
        if(n==1){ return x0 }
        if(n==2){ return x1 }
        else{ return fib(n-1, x0, x1) + fib(n-2, x0, x1) }
    }

    def main(args : Array[String]){
        for( i <- (1 to 10) ){
            println(fib(i))
        }
    }
}
