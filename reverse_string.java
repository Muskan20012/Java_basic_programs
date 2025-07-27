

class Main {
    public static void main(String[] args) {
       String s = "muskan";
      char arr[] = s.toCharArray();
      for(int i = arr.length-1;i>=0;i--){
          System.out.print(arr[i]);
      }
    
    // use .length for arrays and .length() for strings 
    // Arrays in Java are not classes, they are special objects, and .length is treated like a property.

    // String is a full class, and .length() is implemented as a method inside it.
    
        String r = "";
        for(int i=0;i<s.length();i++){
            r = s.charAt(i) + r;
        }
        System.out.println(r);
       
    }
}
