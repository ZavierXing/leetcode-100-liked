def lengthOfLongestSubstring(self, s) :
    res=0
    currentLen=0
    left=-1
    map={}
    for i in range(len(s)):
        if not s[i] in map:
            currentLen+=1
        else:
            index=map.get(s[i])
            if index<=left:
                currentLen+=1
            else:
                if(currentLen>res):
                    res=currentLen
                left=index
                currentLen=i-left
        map[s[i]]=i
    if(currentLen>res):
        res=currentLen
    return res
