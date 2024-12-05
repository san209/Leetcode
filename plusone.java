class plusone {
    public static void main(String args[]) {
        int digits[] = {4,3,2,9};
        int n = digits.length;
        int digits2[] = new int[n];
        int digits3[] = {1,0};
        int num=0;

        if(digits[n-1] == 9 && n!=1) {
            for(int i=0; i<n; i++) {
                digits2[i] = digits[i];
            }
            digits2[n-2] = digits[n-2] + 1;
            digits2[n-1] = 0;

            for(int i=0; i<n; i++) {
                System.out.print(digits2[i]+"\t");
            }
            System.out.println();
        }
        else if(digits[n-1] != 9) {
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
        else if(digits[n-1] == 9 && n==1) {
            for(int i=0; i<2; i++) {
                System.out.print(digits3[i]+"\t");
            }
            System.out.println();
        }

    }
}