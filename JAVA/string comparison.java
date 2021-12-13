

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest=largest=s.substring(0,k);
        for(int i=1;i<s.length()-k+1;i++){
            String c=s.substring(i,i+k);
            if(largest.compareTo(c)<0){
                largest=c;
            }
            if(smallest.compareTo(c)>0){
                smallest=c;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


