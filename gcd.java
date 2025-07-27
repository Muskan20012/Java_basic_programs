class Main {
    public static void main(String[] args) {
       int arr[]={10,25};
       int i;
       int k=arr[0];
       for(i=1;i<arr.length;i++){
           k=gcd(k,arr[i]);
       }
      System.out.println(k);
    }
    
    public static int gcd(int a, int b){
        while(b!=0){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
}
