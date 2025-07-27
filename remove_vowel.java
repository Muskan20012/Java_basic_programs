

class Main {
    public static void main(String[] args) {
       String s = "muskan";
       int index = 0;
       char r[] = new char[s.length()];
       int i;
       for(i=0;i<s.length();i++){
           char ch = s.charAt(i);
        //   System.out.println(ch);
           if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                    r[index] = ch;
                    index++;
                }
            // System.out.println(r);
       }
       
      for(int j = 0;j<index;j++){
          System.out.print(r[j]);
      }
       
    }
}
