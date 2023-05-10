import java.io.*;
class MyStringLengthDemo {
        static int myStrLength (String str) {
                char arr[] = str.toCharArray();
                int count = 0;
                for (int i=0; i<arr.length; i++) {
                        count++;
                }
                return count;
        }
        public static void main(String args []) throws IOException {
                System.out.println("enter string");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str1= br.readLine();
                int length = myStrLength(str1);
                System.out.println(length);
        }
}