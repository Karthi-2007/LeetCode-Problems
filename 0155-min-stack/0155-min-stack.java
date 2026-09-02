class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> minst;


    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int value) {
        if(minst.isEmpty() || minst.peek() >= value){
            minst.push(value);
        }else{
            minst.push(minst.peek());
        }
        st.push(value);
    }
    
    public void pop() {
        st.pop();
        minst.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */