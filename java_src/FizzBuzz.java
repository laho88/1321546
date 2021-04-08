public class FizzBuzz {

    public void fizzBuzz(int numb){
        if((numb % 3 == 0) && (numb % 5 == 0)){
            System.out.println("FizzBuzz");
        }else if(numb % 5 == 0){
            System.out.println("Buzz");
        }else if(numb % 3 == 0){
            System.out.println("Fizz");
        }else
            System.out.print(numb); 
    }
} 