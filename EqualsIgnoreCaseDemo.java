class EqualsIgnoreCaseDemo {
        public static void main (String args []) {
                String str1 = "Shiv";
                String str2 = "Shiv";
                String str3 = "shiv";
                String str4 = "shivraj";
                System.out.println(str1.equalsIgnoreCase(str2));  //true
                System.out.println(str1.equalsIgnoreCase(str3));  //true
                System.out.println(str1.equalsIgnoreCase(str4));  //false
                System.out.println(str2.equalsIgnoreCase(str1));  //true
                System.out.println(str3.equalsIgnoreCase(str1));  //true
                System.out.println(str4.equalsIgnoreCase(str1));  //false
        }
}