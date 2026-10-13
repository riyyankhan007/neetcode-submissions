class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Start only at the beginning of a sequence
            if (num != Integer.MIN_VALUE && set.contains(num - 1)) {
                continue;
            }

            int current = num;
            int count = 1;

            while (current != Integer.MAX_VALUE
                    && set.contains(current + 1)) {
                current++;
                count++;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}
