public class FizzBuzz {

    private static final String EXCEPTION_TEXT = "Invalid input! Must be > 0!";
    private static final String ZERO_CASE = "0";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WIZZ = "Wizz";

    public String check(int input){

        if(input <0){
            throw new IllegalArgumentException(EXCEPTION_TEXT);
        }

        if(input == 0){
            return ZERO_CASE;
        }

        String result = "";
        if(isFizz(input)){
            result += FIZZ;
        }

        if(isBuzz(input)){
           result += BUZZ;
        }

        if(isWizz(input)){
           result += WIZZ;
        }
        if(result.isEmpty()){
            result += String.valueOf(input);
        }
        return result;
    }

    private boolean isWizz(int input) {
        return input % 7 == 0 | String.valueOf(input).contains("7");
    }

    private boolean isBuzz(int input) {
        return input % 5 == 0 | String.valueOf(input).contains("5");
    }

    private boolean isFizz(int input) {
        return input % 3 ==0 | String.valueOf(input).contains("3");
    }
}
