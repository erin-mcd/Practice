class lemonadeChange{
    public static void main(String[] args) {
        int[] b = {5,5,10,10,20};
        System.out.println(lemonadeChange(b));
    }
    public static boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                fives++;
            }
            else if(bills[i] == 10){
                if(fives > 0){
                    fives--;
                    tens++;
                }
                else{
                    return false;
                }
            }
            else if(bills[i] == 20){
                if(tens > 0 && fives > 0){
                    tens--;
                    fives--;
                    //gain $20
                }
                else if(tens == 0 && fives >= 3){
                    fives = fives - 3;
                    //gain $20   ;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}