/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
            for (int i = 1; i <= numberToSum; i++){
                    sum += i;
                } //loop iterates thru and adds 1
                int answer = sum;//set answer to 0 add 1 until matches test case
                sum = 0; 
                return answer;
    }

}
