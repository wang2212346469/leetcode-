class MyCircularDeque {

    private int size;
    private int prev;
    private int end;
    private int length;
    private int[] deque;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.prev = this.end = -1;
        this.size = k;
        this.length = 0;
        this.deque = new int[k];
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (this.isFull()) {
            return false;
        }
        if (prev == -1) {
            prev = (prev -1 + size) % size;
            end = prev;
        } else {
            prev = (prev -1 + size) % size;  
        }
        deque[prev] = value;
        this.length++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (this.isFull()) {
            return false;
        }
        if (end == -1) {
            end = (end + 1 + size) % size;
            prev = end;
        } else {
            end = (end + 1 + size) % size;
        }
        deque[end] = value;
        this.length++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (this.isEmpty()) {
            return false;
        }
        if (prev == end) {
            prev = end = -1;
        } else {
            prev = (prev + 1 + size) % size;
        }
        this.length--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (prev == end) {
            prev = end = -1;    
        } else {
            end = (end - 1 + size) % size;
        }
        this.length--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if (this.isEmpty()) {
            return -1;
        }
        return deque[prev];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if (this.isEmpty()) {
            return -1;
        }
        return deque[end];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return this.length == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return this.length == this.size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
