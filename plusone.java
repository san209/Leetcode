class plusone {
    public static void main(String args[]) {
        int digits[] = {4,3,2,1};
        int n = digits.length;
        int digits2[] = new int[n];
        int digits3[] = {1,0};
        int num=0;

        if(n == 1 && digits[0] == 9) {
            for(int i=0; i<2; i++) {
                System.out.print(digits3[i]+"\t");
            }
            System.out.println();
        }
        else {
            for(int i=0; i<n; i++) {
                if(i == n-1) {
                    digits2[i] = digits[i] + 1;
                }
                else {
                digits2[i] = digits[i];
                }
            }
            for(int i=0; i<n; i++) {
                System.out.print(digits2[i]+"\t");
            }
            System.out.println();
        }

    }
}