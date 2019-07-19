public class HappyNumber {
    public boolean isHappy(int n) {
        int result = 0;
        int first = 1;
        int count = 0;
        String str = Integer.toString(n);
        while(result != 1){
            if(first == 1){
                first = 0;
            }
            else{
                str = Integer.toString(result);
                result = 0;
            }
            for(int i = 0; i < str.length(); i++){
                int num = str.charAt(i) - '0';
                num = num*num;
                result += num;

            }
            count++;
            if(count > 10){
                return false;
            }
        }
        return true;
    }
}
