public class Remove_AllOccurenceofan_element {
    public static int remopveelement(int[] arr,int val){
      int n=arr.length;
      int idx=0;
      for(int i=0;i<n;i++){
        if (arr[i]!=val){
            arr[idx++]=arr[i];
        }
      }
      return idx;
    }
    public static void main(String[] args) {
        int [] arr={1,2,2,3,4,5,3,5,6,4,6};
        int val=3;
        int idx= remopveelement(arr,val);
        for (int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
