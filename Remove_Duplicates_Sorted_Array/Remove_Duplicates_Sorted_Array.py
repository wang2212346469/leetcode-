class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
	    return 0
        if len(nums) == 1:
            return 1
        index = 0
        for i in range(1,len(nums)):
           if nums[index] != nums[i]:
                index += 1
                nums[index] = nums[i]
        return index + 1
