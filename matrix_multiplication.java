

class Main {
    public static void main(String[] args) {
        int arr1[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int arr2[][] = {
            {11,12,13},
            {14,15,16},
            {17,18,19}
        };
        
        int r[][] = new int[arr1.length][arr2[0].length];
        int i,j,k;
        int s = 0;
        for(i=0;i<arr1.length;i++){
            for(j=0;j<arr1[i].length;j++){
                for(k=0;k<arr2.length;k++){
                  s += arr1[i][k]*arr2[k][j];
                }
                r[i][j] = s;
            }
        }
        
         for (i = 0; i < r.length; i++) {
            for (j = 0; j < r[i].length; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
