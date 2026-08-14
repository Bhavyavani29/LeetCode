class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
        return "0";
        int m = num1.length();
        int n = num2.length();

        int arr1[] = new int[m];
        for(int i = 0;i < m;i++){
            arr1[i] = num1.charAt(i) - '0';
        }
        
        int arr2[] = new int[n];
        for(int j = 0;j < n;j++){
            arr2[j] = num2.charAt(j) - '0';
        }

        int result[] = new int[m + n];
        for(int i = m - 1;i >= 0;i--){
            for(int j = n - 1;j >= 0;j--){
                int mul = arr1[i] * arr2[j];
                int p1 = i + j;
                int p2 = i + j + 1;
                int total = mul + result[p2];
                result[p1] += total / 10;
                result[p2] = total % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int val : result){
            if(!(sb.length() == 0 && val == 0)){
                sb.append(val);
            }
        }
        return sb.toString();
    }
}