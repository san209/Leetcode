class romanToInteger {
    public static void main(String args[]) {
        String s = "MCMXCIV";
        int n = s.length();
        int arr[] = new int[n];
        int num = 0;

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == 'I') {
                arr[i] = 1;
            }
            else if(s.charAt(i) == 'V') {
                arr[i] = 5;
            }
            else if(s.charAt(i) == 'X') {
                arr[i] = 10;
            }
            else if(s.charAt(i) == 'L') {
                arr[i] = 50;
            }
            else if(s.charAt(i) == 'C') {
                arr[i] = 100;
            }
            else if(s.charAt(i) == 'D') {
                arr[i] = 500;
            }
            else if(s.charAt(i) == 'M') {
                arr[i] = 1000;
            }
        }
        
        for(int i=0; i<n; i++) {
            if(arr[i] < arr[i+1]) {
                num = num + arr[i+1] - arr[i];
                i++;
            }
            else {
                num = num + arr[i];
            }
        }
        System.out.println(num);
    }
}