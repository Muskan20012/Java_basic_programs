

class Main {
    public static void main(String[] args) {
        int arr1[][] = {
            {0,0,0},
            {0,5,0},
            {7,0,9}
        };
        
        int i,j;
        int k=0;
        for(i=0;i<arr1.length;i++){
            for(j=0;j<arr1[i].length;j++){
                if(arr1[i][j]==0){
                    k++;
                }
            }
        }
        
        if (k > arr1.length*arr1[0].length/2){
            System.out.println("Sparse Matrix");
        }else{
            System.out.println("Not a sparse matrix");
        }
        
         
    }
}
