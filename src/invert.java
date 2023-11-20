public class invert {
    public static  void invert (int[]array){
      for(int i=0;i<array.length/2;i++)  {
          int one=array[i];
          array [i]=array[array.length-i-1];
          array[array.length-i-1]=one;
      }
    }
}
