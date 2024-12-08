class palindrome {
    public static void main(String args[]) {
        int num = 10;
        int temp = num;
        int digit = 0;
        int rev = 0;

        if(num < 0) {
            System.out.println("It is not a palindrome");
        }
        else {
            while(num != 0) {
                digit = num % 10;
                rev = rev*10 + digit;
                num /= 10;
            }

            if(temp == rev) {
                System.out.println("It is a palindrome");
            }
            else {
                System.out.println("It is not a palindrome");
            }
        }
    }
}