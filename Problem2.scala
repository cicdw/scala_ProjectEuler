object Problem2 extends Solution {

    // a recursive function for creating fibonacci numbers
    // recursive functions must specify output type
    def fib(n : Int, x0 : Int = 1, x1 : Int = 2) : Int = {
        if(n==1) x0
        else if(n==2) x1
        else fib(n-1, x0, x1) + fib(n-2, x0, x1)
    }

    // declare some variables
    // can't use values because they change throughout the control flow
    var res :Int = fib(1)
    var fib_num :Int = fib(1)
    var idx :Int = 2

    def even_fib_sum(n : Int) : Int = {
        // accumulates fibonacci numbers up to n
        var idx :Int = 1
        var out :Int = fib(idx)
        var res :Int = 0

        while(out < n){
            if(out%2 ==0) res += out

            idx += 1
            out = fib(idx)            
        }
        res
    }

    val answer = even_fib_sum(4000000)

}
