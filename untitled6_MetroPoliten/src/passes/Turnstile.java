package passes;

import exceptions.ShoolPassOverdueException;
import exceptions.RegularPassNotEnoughMoneyException;
import exceptions.ShoolPassTripFinishedException;
import exceptions.StudentPassOverdueException;

import java.time.YearMonth;

public class Turnstile {
    public void validateEntryPermission(MetroPass pass) throws  RegularPassNotEnoughMoneyException,
            ShoolPassOverdueException, ShoolPassTripFinishedException,StudentPassOverdueException {

        if (pass instanceof SchoolPass schoolPass) {
            if (((SchoolPass) pass).getMonth().isBefore(YearMonth.now())){
               KyivSmartCard.addProhibitions();
              throw new  ShoolPassOverdueException(schoolPass);
            }
            else if (((SchoolPass)pass).getCountOfTrip()<1||schoolPass.getMonth().equals(YearMonth.now())){
                KyivSmartCard.addProhibitions();
                throw new ShoolPassTripFinishedException(schoolPass);
            }
            else {
                KyivSmartCard.addPermitions();
                schoolPass.setCountOfTrip(schoolPass.getCountOfTrip()-1);
            }
        }

        if(pass instanceof StudentPass studentPass){
         if(studentPass.getMonth().isBefore(YearMonth.now())){
             KyivSmartCard.addProhibitions();
             throw new StudentPassOverdueException(studentPass);
         }
         else {
             KyivSmartCard.addPermitions();
         }

    }

        if(pass instanceof RegularPass regularPass){
            if(regularPass.getAmountOfMoney()<8){
                KyivSmartCard.addProhibitions();
                throw  new RegularPassNotEnoughMoneyException(regularPass);
            }
            else {
                KyivSmartCard.addPermitions();
                KyivSmartCard.subtractFair(regularPass);
            }
        }
}
}
