def twoSum(nums, target):
    map={}
    result=[0,0]
    for i in range(len(nums)):
        map[nums[i]]=i
    for i in range(len(nums)):
        value=target-nums[i]
        if value in map.keys() and map.get(value)!=i:
            result[0]=i
            result[1]=map.get(value)
            break
    return result