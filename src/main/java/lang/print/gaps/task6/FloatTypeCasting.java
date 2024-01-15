package lang.print.gaps.task6;

public class FloatTypeCasting {
   public static void roundNumber(float numberToBeRounded) {

       int rounded = Math.round(numberToBeRounded);
       System.out.println(rounded);
   }
   public static void main(String[]args){
       float numberToBeRounded=5.25f;
       roundNumber(numberToBeRounded);
       }
}
