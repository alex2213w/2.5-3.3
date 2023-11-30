package passes;
import exceptions.ShoolPassOverdueException;
import exceptions.RegularPassNotEnoughMoneyException;
import exceptions.ShoolPassTripFinishedException;
import exceptions.StudentPassOverdueException;
import java.time.YearMonth;

public class PassTest {
    public static void main(String[] args) throws InterruptedException{

        Turnstile turnstile = new Turnstile();
        var pass = KyivSmartCard.createPass((PassType.STUDENT_PASS));
      StudentPass studentPass = (StudentPass)pass;
        studentPass.setMonth(YearMonth.of(2022,1));
          try{
              turnstile.validateEntryPermission(studentPass);
          } catch (ShoolPassOverdueException | StudentPassOverdueException|ShoolPassTripFinishedException |
                   RegularPassNotEnoughMoneyException e ) {
              e.printStackTrace();
          }

    }
}