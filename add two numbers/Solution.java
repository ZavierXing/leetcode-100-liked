class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp=l1.val+l2.val;
        int carry=temp/10;
        ListNode result=new ListNode(temp%10);
        ListNode pointer=result;
        while(l1.next!=null && l2.next!=null){
            l1=l1.next;
            l2=l2.next;
            temp=l1.val+l2.val+carry;
            carry=temp/10;
            ListNode newNode=new ListNode(temp%10);
            pointer.next=newNode;
            pointer=newNode;
        }
        while(l1.next!=null){
            l1=l1.next;
            temp=l1.val+carry;
            carry=temp/10;
            ListNode newNode=new ListNode(temp%10);
            pointer.next=newNode;
            pointer=newNode;
        }
        while(l2.next!=null){
            l2=l2.next;
            temp=l2.val+carry;
            carry=temp/10;
            ListNode newNode=new ListNode(temp%10);
            pointer.next=newNode;
            pointer=newNode;
        }
        if(carry!=0){
            ListNode newNode=new ListNode(carry);
            pointer.next=newNode;
            pointer=newNode;
        }
        return result;
    }
}