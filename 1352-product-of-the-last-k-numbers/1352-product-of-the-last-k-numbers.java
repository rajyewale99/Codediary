class ProductOfNumbers {
    ArrayList<Integer>ls;
  
    public ProductOfNumbers() {
        ls = new ArrayList<>();
    }
    
    public void add(int num) {
        ls.add(num);
    }
    
    public int getProduct(int k) {
        int ans = 1;
        if(ls.size()>=k){
            for(int i=ls.size()-1; i>=ls.size()-k; i--){
                ans *= ls.get(i);
            }
        }
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */