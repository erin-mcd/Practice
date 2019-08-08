import java.util.ArrayList;
import java.util.List;

class fizzBuzz{
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for(int i = 1; i < n + 1; i++){
            if(i < 3){
                String add = "" + i;
                list.add(add);
                continue;
            }
            if(i == 4){
                String add = "" + i;
                list.add(add);
                continue;
            }
            if(i % 3 == 0 && i % 5 != 0){
                list.add("Fizz");
            }
            else if(i % 5 == 0 && i % 3 != 0){
                list.add("Buzz");
            }
            else if(i % 5 == 0 && i % 3 == 0){
                list.add("FizzBuzz");
            }
            else{
                String add = "" + i;
                list.add(add);
            }
        }
        return list;
    }
}