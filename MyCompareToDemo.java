import java.io.*;
class MyCompareToDemo {
        int myCompareTo(String str1, String str2) {
        if (str1.length() != str2.length()) {
                int diff = str1.length() - str2.length();
                return diff;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
               int diff2 = (int)str1.charAt(i) - (int)str2.charAt(i);
               return diff2;
            }
        }
        return 0;
        }
        public static void main (String ar[])throws IOException {
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter 1st String");
                String str1 = br.readLine();
                System.out.println("enter 2nd String");
                String str2 = br.readLine();

                CompareToDemo obj = new CompareToDemo();
                int output = obj.myCompareTo(str1,str2);
                System.out.println(output);
        }
}
