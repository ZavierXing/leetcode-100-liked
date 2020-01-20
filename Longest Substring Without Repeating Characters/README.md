res:最终结果  
left：指向当前区间[front,rear]左端前一个，即front-1  
currentLen：当前区间长度  
map：hashmap<char,int>,记录每个字符最后出现的位置。

扫描字符串s，遇到第i个字符ch，有下面几种情况
1. 字符ch不在hashmap中，即未出现过，currentLen++
2. 字符ch在hashmap中，但是最后出现的位置index<=left，即字符ch上次出现的位置不在当前区间内，和第一种情况处理相同，currentLen++
3. 字符ch在hashmap中，但是最后出现的位置index>left，即字符ch在当前区间内，此时需要调制区间。设置left=index,currentLen如果比res大则进行更新，最后更新新的区间长度currentLen=i-left