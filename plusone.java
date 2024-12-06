class plusone {
    public static void main(String args[]) {
        int digits[] = {1,2,3,9};
        int n = digits.length;
        int digits2[] = new int[n+1];
        int digits3[] = new int[n];
        int num=0;
        int flag=0;
        
        for(int i=0; i<n; i++) {
            if(digits[i] == 9) {
                flag++;
            }
        }
        
        if(flag == n) {
            for(int i=1; i<n+1; i++) {
                digits2[i] = 0;
            }
            digits2[0] = 1;
            digits2[n] = 0;

            for(int i=0; i<n+1; i++) {
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
        else if(digits[n-1] == 9 && flag != n) {
            for(int i=0; i<n; i++) {
                if(i == n-2) {
                    digits3[i] = digits[i] + 1;
                }
                else if(i == n-1) {
                    digits3[i] = 0;
                }
                else {
                    digits3[i] = digits[i];
                }
            }
            for(int i=0; i<n; i++) {
                System.out.print(digits3[i]+"\t");
            }
            System.out.println();
        }

    }
}