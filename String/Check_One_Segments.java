public class Check_One_Segments {
    
    // is problem mai hame check karna ki first(1) charecter ke baad bhi koi one
    // aaraha hai nahi
    // phale character ke sath multiple ho sakte hai lekin
    // agar ik bhi zero ke baad aata hai to allow ni hoga
    // agar aa raha hai to return false karo
    // agar nahi aa raha hai to true return karo
    public static  boolean checkOnesSegment(String s) {
        int n = s.length();
        if (n == 1)
            return true;
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            if (flag == true && s.charAt(i) == '1')
                return false;
            if (s.charAt(i) == '0')
                flag = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "11001";  // ans = true ->  for "111110000"
        System.out.println(checkOnesSegment(str));

    }
}
