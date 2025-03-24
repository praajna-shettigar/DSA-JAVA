public class StringProblem {

    public static void main(String[] args) {
        String str = "aaabbcddeef";
        int target = 2;
        String result = removeAdjacentChars(str, target);
        System.out.println("Output: " + result);
    }

    public static String removeAdjacentChars(String str,int target){
        StringBuilder res = new StringBuilder();
        int n = str.length();

        for(int i=0;i<str.length();i++){
            int start = i;
            int count =1;
            while (i+1<n && str.charAt(i)==str.charAt(i+1)){
                i++;
                count++;
            }

            // If the count of consecutive characters is not equal to target, add to result
            if(target!=count){
                for (int j=0;j<count;j++){
                    res.append(str.charAt(start++));
                }
            }
        }
        return res.toString();


    }
}
