package Binary_Search.`374_GuessNumber`

/**
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */
abstract class GuessGame {
    val pick = 6
    abstract fun guessNumber(n: Int): Int

    fun guess(n: Int): Int {
        if (n  == pick) return 0
        if (n < pick) return 1
        if (n > pick) return -1

        return -1
    }
}
class Solution: GuessGame() {
    override fun guessNumber(n:Int):Int {

        var left = 1
        var right = n

        while (left <= right) {
            val mid = left + (right - left) / 2

            when (guess(mid)) {
                -1 -> right = mid - 1
                0 -> return mid
                1 -> left = mid + 1
            }

        }
        return -1
    }
}