fun main() {
    val code = intArrayOf(5, 7, 1, 4)
    val k = 3
    val n = code.size
    val array: Array<Int?> = arrayOfNulls(n)
    for (index in code.indices) {
        if (k == 0) {
          array[index] = 0
          continue
        }
        val sum = (0 until Math.abs(k)).map {
            if (k > 0) {
                code[(index + it) % n]
            } else {
                code[(index - it + n) % n]
            }
        }.sum()
        if (k > 0) { 
            if(index == 0) {
                array[n-1] = sum
                
            } else {
                array[index-1] = sum
            }
        }
        if ( k < 0) {
            if( index == n-1 ) {
                array[0] = sum  
            } else {
              array[index + 1] = sum   
            }
        }
    }
    println(array.joinToString(", "))
}