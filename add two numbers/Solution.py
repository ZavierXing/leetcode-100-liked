def addTwoNumbers(l1, l2):
    sum=l1.val+l2.val
    carry=sum//10
    result=ListNode(sum%10)
    pointer=result
    while not l1.next is None and not l2.next is None:
        l1=l1.next
        l2=l2.next
        sum=l1.val+l2.val+carry
        carry=sum//10
        newNode=ListNode(sum%10)
        pointer.next=newNode
        pointer=newNode
    while not l1.next is None:
        l1=l1.next
        sum=l1.val+carry
        carry=sum//10
        newNode=ListNode(sum%10)
        pointer.next=newNode
        pointer=newNode
    while not l2.next is None:
        l2=l2.next
        sum=l2.val+carry
        carry=sum//10
        newNode=ListNode(sum%10)
        pointer.next=newNode
        pointer=newNode
    if carry!=0:
        newNode=ListNode(carry)
        pointer.next=newNode
        pointer=newNode
    return result