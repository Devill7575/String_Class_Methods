class CompareToIgnoreCase {
        public static void main (String args []) {
                String str1 = "Shiv";
                String str2 = "Shiv";
                String str3 = "shiv";
                String str4 = "Shivraje";
                System.out.println(str1.compareToIgnoreCase(str2)); //0
                System.out.println(str1.compareToIgnoreCase(str3)); //0
                System.out.println(str1.compareToIgnoreCase(str4)); //-4
                System.out.println(str2.compareToIgnoreCase(str1)); //0
                System.out.println(str3.compareToIgnoreCase(str1)); //0
                System.out.println(str4.compareToIgnoreCase(str1)); //4
        }
}