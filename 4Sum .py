def kSum(nums, target, k):
    res = []
    if not nums:
        return res
    # if smallest sum too large or largest sum too small
    average = target // k
    if nums[0] > average or nums[-1] < average:
        return res
    if k == 2:
        # two pointer 2-sum
        l, r = 0, len(nums)-1
        while l < r:
            s = nums[l] + nums[r]
            if s < target:
                l += 1
            elif s > target:
                r -= 1
            else:
                res.append([nums[l], nums[r]])
                l += 1
                r -= 1
                while l < r and nums[l] == nums[l-1]:
                    l += 1
        return res

    for i in range(len(nums)):
        if i == 0 or nums[i] != nums[i-1]:
            for subset in kSum(nums[i+1:], target - nums[i], k-1):
                res.append([nums[i]] + subset)
    return res

def fourSum(nums, target):
    nums.sort()
    return kSum(nums, target, 4)
