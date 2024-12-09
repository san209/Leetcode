class longestCommonPrefix {
    public static void main(String args[]) {
        String str[] = {"dog","racecar","car"};
        int n = str.length;
        int c[] = new int[n-1];
        int counter = 0;
        int smallest = 0;

        for(int i=0; i<n-1; i++) {
            int p = str[i].length();
            int q = str[i+1].length();
            if(p >= q) {
                for(int j=0; j<q; j++) {
                    if(str[i].charAt(j) == str[i+1].charAt(j)) {
                        counter++;
                    }
                    else {
                        break;
                    }
                }
                c[i] = counter;
                counter = 0;
            }
            else {
                for(int j=0; j<p; j++) {
                    if(str[i].charAt(j) == str[i+1].charAt(j)) {
                        counter++;
                    }
                    else {
                        break;
                    }
                }
                c[i] = counter;
                counter = 0;
            }
        }
        for(int i=0; i<c.length-1; i++) {
            smallest = c[i];
            if(smallest > c[i+1]) {
                smallest = c[i+1];
            }
        }
        
        if(smallest != 0) {
            for(int i=0; i<smallest; i++) {
                System.out.print(str[0].charAt(i));
            }
            System.out.println();
        }
        else {
            System.out.println("There is no common prefix");
        }
    }
}