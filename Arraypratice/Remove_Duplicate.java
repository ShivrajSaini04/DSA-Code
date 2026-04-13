public class Remove_Duplicate {
      public static int removeduplicate(int[] arr){
      int n=arr.length;
      int idx=0;
      for(int i=1;i<n;i++){
        if (arr[idx]!=arr[i]){
            arr[++idx]=arr[i];
        }
      }
      return idx+1;
    }
    public static void main(String[] args) {
         int [] arr={1,2,2,3,4,5,5,6,6};
        int idx= removeduplicate(arr);
        for (int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
