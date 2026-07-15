# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        prev=head
        list_l = []

        while prev:
            list_l.append(prev.val)
            prev= prev.next
        

        i=0
        l=len(list_l)-1

        while i<l:
            if list_l[i] != list_l[l]:
                return False

            else :
                i+=1
                l-=1
        return True
