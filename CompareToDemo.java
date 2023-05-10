class CompareToDemo {
        public static void main (String args []) {
                String str1 = "Shiv";
                String str2 = "Shiv";
                String str3 = "shiv";
                String str4 = "Shivraje";
                System.out.println(str1.compareTo(str2)); //0
                System.out.println(str1.compareTo(str3)); //-32
                System.out.println(str1.compareTo(str4)); //-4
                System.out.println(str2.compareTo(str1)); //0
                System.out.println(str3.compareTo(str1)); //32
                System.out.println(str4.compareTo(str1)); //4
        }
}