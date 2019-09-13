class StringToInt {
    public static void main(String[] args) {
      String str = "12345";
      int i = 0;
      int number = 0;
      int index = str.length();
      while(index>0){
          char c = str.charAt(index-1);
          int n = (int)c-48;
          n = n*(int)exponentVal(10, i);
          number += n;
          i++;
          index--;
       }
       System.out.println(number);
    }

    private static int exponentVal(int base, int exponent){
      if(exponent <1){
        return 1;
      }   else{
          return base*exponentVal(base, exponent-1);
      }
    }
}
