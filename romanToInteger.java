class romanToInteger {
    public static void main(String args[]) {
        String s = "XXVII";
        int n = s.length();
        int num = 0;

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == 'I') {
                num += 1;
            }
            else if(s.charAt(i) == 'V') {
                num += 5;
            }
            else if(s.charAt(i) == 'X') {
                num += 10;
            }
            else if(s.charAt(i) == 'L') {
                num += 50;
            }
            else if(s.charAt(i) == 'C') {
                num += 100;
            }
            else if(s.charAt(i) == 'D') {
                num += 500;
            }
            else if(s.charAt(i) == 'M') {
                num += 1000;
            }
        }
        System.out.println(num);
    }
}