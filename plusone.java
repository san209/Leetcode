class plusone {
    public static void main(String args[]) {
        int digits[] = {9,9,9,9};
        int n = digits.length;
        int num =0;
        int m=0;
        
        for(int i=0; i<n; i++) {
            num = num*10 + digits[i];
        }
        num++;
        System.out.println(num);
        int temp = num;

        while(num != 0) {
            num/=10;
            m++;
        }

        int digits2[] = new int[m];

        for(int i=m-1; i>=0 && temp != 0; i--) {
            digits2[i] = temp%10;
            temp /= 10;
        }

        for(int i=0; i<m; i++) {
            System.out.print(digits2[i]+"\t");
        }
        System.out.println();

    }
}