import java.util.*;

import org.w3c.dom.Node;
public class practce_A2Z {
    // static int[] twosum(int[] arr , int target){
    //   HashMap<Integer,Integer> map = new HashMap<>();
    //   int n = arr.length;
    //   for(int i=0;i<n;i++){
    //     // Twice not Allowed
    //      map.put(arr[i] , i);
    //   }
    //   int[] res= new int[2];
    //    for(int i=0;i<n;i++){
    //     int key = target - arr[i];
    //      if (map.containsKey(key) && i!= map.get(key)){
    //         res[0] = i;
    //         res[1] = map.get(key);
    //         return res;
    //      }
    //    }
    //    return res;
    // }

    static void swap(int[][] matrix , int i , int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
// mising and repeating
    static int[] find(int[] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int [] res = new int[2];
        int ans = 0;
        for(int ele : arr) {
            if (set.contains(ele)) res[0] =ele;
            else set.add(ele);
        }
           for(int i=1;i<=n; i++) {
            if (!set.contains(i))  res[1] =i;
           }
        return res;
    }
   // majority element

    static int majority(int[] nums){
        int n = nums.length;
        int majo = 0 , count=0;
        for(int i=0; i<n; i++){
            if (count==0) majo = nums[i];
            if (nums[i]==majo) count++;
            else count--;
        }
        return majo;
    }

    // search in 2D matrix
    static boolean search(int[][] matrix , int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0 , high = row * col -1;
        while(low<=high){
            int mid = (low + high )/2;
            
            int rowMid = mid / col;
            int colMid = mid % col;
            
            if (matrix[rowMid][colMid]==target) return true;
            else if (matrix[rowMid][colMid] > target)  high = mid - 1;
            else  low = mid + 1;
        }
        return false;
    }

    // merge sort 
    static void mergeArray(int[] arr, int i,int mid , int j){
      
    }

    static void  mergesort(int[] arr , int i , int j){
        if ( i== j) return ;
         int mid = (i + j) /2;
         mergesort(arr, i, mid-1);
         mergesort(arr, mid, j);
         mergeArray(arr,i,mid,j);
    }


    
   
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 5, 6, 3, 4, 2, 7 };   
        //  mergesort(arr, 0, arr.length-1);
        // int n = 5;
        // int[] arr = { 1,2,3,2,2,4,2};
        // System.out.println(majority(arr));
        // System.out.println("hello");
        // int[] res = find(arr);
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=1;j<=n-i;j++){
        //      System.out.print( j+" ");
        //     }
        //     System.out.println();
        // }
    // String str = "i am iron man";
    
    // System.out.println(revrseword(str));

        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(-7);
        b.left = e;
        b.right = f;
        ArrayList<Integer> list = new ArrayList<>();
        list = Boundary(root);
        System.out.println(list);
         
    }


    // boundary trevarsal 
    ArrayList<Integer> list;

    ArrayList<Integer> Boundary(Node root){
        if (root.left != null || root.right != null)
            list.add(root.data);
        if (root.left != null)
            leftBoundary(root.left);
        bottomBoundary(root);
        if (root.right != null)
            rightBoundary(root.right);
        return list;
    }


    void leftBoundary(Node root) {
        if (root.left == null && root.right == null)
            return;
        list.add(root.data);
        if (root.left == null)
            leftBoundary(root.right);
        else
            leftBoundary(root.left);
    }

    void bottomBoundary(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            list.add(root.data);

        bottomBoundary(root.left);
        bottomBoundary(root.right);
    }

    void rightBoundary(Node root) {
        if (root.left == null && root.right == null)
            return;
        if (root.right == null)
            rightBoundary(root.left);
        else
            rightBoundary(root.right);
        list.add(root.data);
    }

    // revrse word in string

    static String revrseword(String str) {
       // str += " ";
        int n = str.length();
        char[] arr = str.toCharArray();
        int i = 0, j = 0;
        StringBuilder s = new StringBuilder();
        while (j < n) {
            if (j == n - 1)
                reverse(i, j, arr);
            if (arr[j] == ' ') {
                reverse(i, j - 1, arr);
                i = j + 1;
            }
            j++;
        }
        return new String(arr);
    }

    static void reverse(int i, int j, char[] arr) {
        while(i<j){
            char ch = arr[i];
            arr[i++] = arr[j];
            arr[j--] = ch;
        }
    }


}


