package Binary_Search.`704_BinarySearch`

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var answer = -1
        var left = 0
        var right = nums.size

        while (left < right) {
            val mid = (left + right) / 2

            if (nums[mid] <= target) {
                left = mid + 1
                if (nums[mid] == target) {
                    answer = mid
                    break
                }
            } else {
                right = mid
            }
        }
        return answer
    }
}