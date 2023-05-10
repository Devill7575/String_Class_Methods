class EqualsDemo {
        public static void main (String args []) {
                String str1 = "Shiv";
                String str2 = "Shiv";
                String str3 = "shiv";
                String str4 = "shivraj";
                System.out.println(str1.equals(str2));  //true
                System.out.println(str1.equals(str3));  //false
                System.out.println(str1.equals(str4));  //false
                System.out.println(str2.equals(str1));  //true
                System.out.println(str3.equals(str1));  //false
                System.out.println(str4.equals(str1));  //false
        }
}