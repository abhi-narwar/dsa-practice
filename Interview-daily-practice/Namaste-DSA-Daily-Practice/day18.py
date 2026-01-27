class Node:
    def __init__(self, val=0):
        self.val = val
        self.next = None


class MyLinkedList:

    def __init__(self):
        self.head = Node()   # dummy head
        self.size = 0

    def get(self, index: int) -> int:
        if index < 0 or index >= self.size:
            return -1

        curr = self.head
        for _ in range(index + 1):
            curr = curr.next

        return curr.val

    def addAtHead(self, val: int) -> None:
        self.addAtIndex(0, val)

    def addAtTail(self, val: int) -> None:
        self.addAtIndex(self.size, val)

    def addAtIndex(self, index: int, val: int) -> None:
        if index < 0 or index > self.size:
            return

        curr = self.head
        for _ in range(index):
            curr = curr.next

        newNode = Node(val)
        newNode.next = curr.next
        curr.next = newNode
        self.size += 1

    def deleteAtIndex(self, index: int) -> None:
        if index < 0 or index >= self.size:
            return

        curr = self.head
        for _ in range(index):
            curr = curr.next

        curr.next = curr.next.next
        self.size -= 1
