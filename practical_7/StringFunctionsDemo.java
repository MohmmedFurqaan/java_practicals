public class StringFunctionsDemo {
    public static void main(String[] args) {

        String str = "  Java  ";
        String str2 = "java";

        // 1. length()
        System.out.println("1. Length of str: " + str.length());

        // 2. trim()
        String trimmedStr = str.trim();
        System.out.println("2. After trim(): '" + trimmedStr + "'");

        // 3. toUpperCase()
        System.out.println("3. toUpperCase(): " + trimmedStr.toUpperCase());

        // 4. toLowerCase()
        System.out.println("4. toLowerCase(): " + trimmedStr.toLowerCase());

        // 5. charAt(index)
        System.out.println("5. charAt(2): " + trimmedStr.charAt(2));

        // 6. substring(start, end)
        System.out.println("6. substring(0, 4): " + trimmedStr.substring(0, 2));

        // 7. equals()
        System.out.println("7. equals(str2): " + trimmedStr.equals(str2));

        // 8. equalsIgnoreCase()
        System.out.println("8. equalsIgnoreCase(str2): " + trimmedStr.equalsIgnoreCase(str2));

        // 9. contains()
        System.out.println("9. contains('Programming'): " + trimmedStr.contains("Programming"));

        // 10. replace(old, new)
        System.out.println("10. replace('Java', 'Python'): " + trimmedStr.replace("Java", "Python"));
    }
}
