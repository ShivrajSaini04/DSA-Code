public class student_attendance {
      public static  boolean checkRecord(String s) {
        int absent =0;
        int latecount=0;
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            // for late 
           if (ch=='L') {
                 latecount++;
                if (latecount>=3)  return false ;
                
            }
           else  if (ch=='A') {
                absent++;
                latecount=0;
            }
            else latecount=0;
        }
        if ( absent>1) return false  ;
        return true  ;
    }
    public static void main(String[] args) {
        String s="PPALLPL";
System.out.println(checkRecord(s));
    }
}
